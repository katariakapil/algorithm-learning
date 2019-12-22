import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindRestaurant {

    public static void main(String[] args) {

        FindRestaurant f = new FindRestaurant();
        String[] rs = f.findRestaurant(new String[]{"Shogun","Tapioca Express","Burger King","KFC"},
                new String[]{"KFC","Shogun","Burger King"});

        System.out.println(rs[0]);

    }

    public String[] findRestaurant(String[] list1, String[] list2) {

        Map<String,Integer> map = new HashMap();
        Map<String,Integer> fav = new HashMap();

        for (int i=0;i<list1.length;i++) {
            map.put(list1[i],i);
        }

        int sum = Integer.MAX_VALUE;
        ArrayList<String> ar = new ArrayList();

        for (int i=0;i<list2.length;i++) {

            if (map.get(list2[i]) != null) {

                int temp = map.get(list2[i]) + i;

                if (temp <= sum) {

                    if (temp < sum) ar.clear();
                    ar.add(list2[i]);
                    sum = temp;
                }
            }
        }


        return ar.stream().toArray(String[] ::new);

    }

}
