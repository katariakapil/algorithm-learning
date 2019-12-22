
import javafx.util.Pair;

import java.util.*;

//127. Word Ladder Graph Problem
public class PathCoversion {


    public static void main(String[] args) {


        String start = new String("dog");
        //covert to end
        String end  =  new String("hat");

        String[] dict = {"dot", "cat", "hot", "hog" , "eat" , "dug", "dig"};

        HashSet<String> set = new HashSet();
        for (String s : dict) {
            set.add(s);
        }
        set.add(end);
        //path - > dog -> dot -> hot -> hat


        //keep d*g , do* , *og keys with value dog in map
        Map<String, ArrayList<String>> map = new HashMap<>();
/*        set.forEach(word -> {

            for (int i=0;i<word.length();i++) {

                String s = word.substring(0 , i ) + "*" + word.substring(i +1);
                System.out.println("String " + s);
                ArrayList<String> list = map.getOrDefault(s, new ArrayList<>());
                list.add(s);
                map.put(s, list);
            }

        });*/

        set.forEach(
                word -> {
                    for (int i = 0; i < word.length(); i++) {
                        // Key is the generic word
                        // Value is a list of words which have the same intermediate generic word.
                        String newWord = word.substring(0, i) + '*' + word.substring(i + 1);
                        ArrayList<String> transformations =
                                map.getOrDefault(newWord, new ArrayList<String>());
                        transformations.add(word);
                        map.put(newWord, transformations);
                    }
                });

        System.out.println(map);
        // map with hold keys to word

        Queue<Pair<String, Integer>> queue = new LinkedList<>();
        queue.offer(new Pair(start, 1)); // add start of word and its level to queue


        HashMap<String,Boolean> visited = new HashMap();
        visited.put(start, true);// mark first node , start string visited.

        while (!queue.isEmpty()) {

            Pair<String,Integer> p  = queue.poll();

            String word = p.getKey();
            Integer level = p.getValue();

            for (int i=0;i<word.length();i++) {

                String newWord = word.substring(0, i) + "*" + word.substring(i+1);

                //now find its neighbours words in our map

                List<String> list = map.getOrDefault(newWord, new ArrayList<>());

                for (String s : list) {

                    if (s.equals(end)) {
                        //we found our last word, we can stop here
                        level = level + 1;
                        System.out.println("FOUND LEVEL " + level);
                        break;
                    }

                    if (!visited.containsKey(s)) {
                        visited.put(s, true);//mark this new word as visited
                        queue.offer(new Pair(s, level+1));
                    }
                }
            }

        }
        System.out.println("finished");

    }


}
