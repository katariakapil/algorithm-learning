

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReadCSV {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("/Users/m_615672/Desktop/PHI_MRN.csv"));
        String line = null;

        int i=0;
        int counter = 0;
        boolean  flag = false;
        while ((line = br.readLine()) != null) {
            String[] values = line.split("####");
            String name1  = values[0].replaceAll(",","").trim().toLowerCase().replaceAll(" ","");
            String name2 = values[1].replaceAll(",","").trim().toLowerCase().replaceAll(" ","");


                if (checkSubstring(name1,name2) < 1 ) {
                    if ((name2.length() > 6 && !name2.substring(name2.length() - 6).equals("female"))
                            && (name2.length()> 4 && !name2.substring(name2.length() - 4).equals("male")) )
                    System.out.println(i++  + " " + name1 + " >  " + name2 );
                }

            flag = false;
        }
        br.close();
    }

    private static int checkSubstring(String s, String l) {
        int count = 0;
        if (l.length() < s.length())
        {
            return checkSubstring(l , s);
        }

        if (l.contains(s)) {
             return s.length();
        } else {


            int j = 0;
            int end = 3;
            for (int i=0;i<s.length();i++){

                if (j+end <= s.length()) {
                    String t = s.substring(j, j + end);
                     if (l.indexOf(t) != -1) {
                         end++;
                        count++;
                    } else {
                        j++;
                    }
                }

            }
         }
        return count;
    }

}