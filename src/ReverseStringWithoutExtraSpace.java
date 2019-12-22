public class ReverseStringWithoutExtraSpace {


    public static void main(String[] args) {

        ReverseStringWithoutExtraSpace e = new ReverseStringWithoutExtraSpace();

       String s = e.reverseWords("hello this is a new string".toCharArray());

        System.out.println(s);
    }

    public String reverseWords(char[] s) {
        int i=0;
        for(int j=0; j<s.length; j++){
            if(s[j]==' '){
                reverse(s, i, j-1);
                i=j+1;
            }
        }

        reverse(s, i, s.length-1);

        reverse(s, 0, s.length-1);

        StringBuilder sb = new StringBuilder();
        for (char c : s){
            sb.append(c);
        }
       return sb.toString();
    }

    public void reverse(char[] s, int i, int j){
        while(i<j){
            char temp = s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }

}
