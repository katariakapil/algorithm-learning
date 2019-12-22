import java.util.Stack;

public class RemoveDups {

    public String removeDuplicates(String S) {

        Stack<Character> st = new Stack();

        for (Character c : S.toCharArray()) {


            if (st.isEmpty()) {

                st.push(c);
            } else {

                if (c == st.peek()){
                    st.pop();
                } else {
                    st.push(c);
                }

            }

        }



        StringBuilder builder = new StringBuilder();
        while (!st.isEmpty()) {
            builder.append(st.pop());
        }

        return builder.toString();


    }
}
