import java.util.Stack;

public class Baseball {

    public static void main(String[] args) {


        String[] ar = new String[] {"5","2","C","D","+"};

        Stack<Integer> st = new Stack<>();

        for (String s: ar) {

            if (s.equals("C")) {

                st.pop();
            }

            else if (s.equals("D")) {

                Integer val = st.peek();
                st.push(val * 2);
            }

            else if (s.equals("+")) {

                Integer val  = st.pop();
                Integer val2  = st.peek();//just get the look up.

                st.push(val);//push back again
                st.push(val+val2);
            } else {

                st.push(new Integer(s));
            }

        }
        int ans =0;
        for (Integer i: st) {
            ans+=i;
        }
        System.out.println(ans);
    }
}
