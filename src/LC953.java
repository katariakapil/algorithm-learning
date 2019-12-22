public class LC953 {


        public boolean isAlienSorted(String[] words, String order) {
            for (int i=1; i<words.length; i++) {
                if (! correctOrder(words[i-1], words[i], order))
                    return false;
            }
            return true;
        }

        public boolean correctOrder(String a, String b, String order) {
            for (int i=0; i<a.length(); i++) {
                if (i >= b.length()) {
                    return false;
                }
                if (order.indexOf(a.charAt(i)) > order.indexOf(b.charAt(i))) {
                    return false;
                }
                if (order.indexOf(a.charAt(i)) < order.indexOf(b.charAt(i))) {
                    return true;
                }
            }
            return true;
        }


}
