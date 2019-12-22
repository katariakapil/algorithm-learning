package lc_question;

public class RangeSumQuery303 {

    public static void main(String[] args) {


        int [] ar = {-2,0, 3, -5 , 2, -1};

        int [] d = new int[ar.length+1];

        for (int i=0;i<ar.length;i++) {

            d[i+1] = ar[i] + ar[i];
        }

        for (int i : d){
            System.out.print(i+" ");
        }

        System.out.println("RS"+ (d[5 + 1] - d[2]));
    }
}
