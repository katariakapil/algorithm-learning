import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateFiles {

    public static void main(String[] args) {

        String[] files = {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"};

        HashMap<String,ArrayList<String>> map = new HashMap();
        for (int i=0;i<files.length;i++) {


            String file = files[i];

            String[] ar = file.split(" ");
            String path = ar[0];
            for (int j=1;j<ar.length;j++) {

                String name = ar[j];
                String content = name.substring(name.indexOf("(")+1, name.indexOf(")"));
                System.out.println(content);
                String filename = name.substring(0,name.indexOf("("));

                ArrayList<String> data = map.getOrDefault(content, new ArrayList<>());
                data.add(path+"/"+filename);

                map.put(content, data);
            }


        }

        List<List<String>> result = new ArrayList<>();

        for (String key : map.keySet()) {

            if (map.get(key).size() > 1) { //get keys which has more than one files.

                result.add(map.get(key));
            }

        }

        System.out.println(result);

    }
}
