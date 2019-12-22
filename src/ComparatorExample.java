import java.util.Arrays;
import java.util.Comparator;

public class ComparatorExample {


    public static void main(String[] args) {

        Integer[] a = new Integer[] {1,3,5,35,3,52,5,36};


        Arrays.sort(a , new Comparator<Integer>() {

            public int compare(Integer o1, Integer o2) {

                return o1 - o2;
            }
        });

        for (Integer i : a){
            System.out.print(i + ", ");
        }

        // user comparator

        User[] users = { new User(4, "Kapil") , new User(2, "Kannu") , new User(9,"Test")};

        Arrays.sort(users);

        for  (User u : users) {
            System.out.print(u.toString());

        }
     }

     static class User implements Comparable<User> {

        int id;
        String name;

        User(int id , String name) {
            this.id = id;
            this.name = name;
        }

         @Override
         public int compareTo(User o) {
             return  this.id - o.id ;
         }

         @Override
         public String toString() {
             return "User{" +
                     "id=" + id +
                     ", name='" + name + '\'' +
                     '}';
         }
     }
}
