public class JudgeCircl {

    public static void main(String[] args) {

        System.out.println(judgeCircle("UDDLUR"));

    }

    public static boolean judgeCircle(String moves) {

        int steps = 0;
        for (char c : moves.toCharArray()) {

            if ('U' == c) {
                steps += 2;
            }

            if ('D' == c) {
                steps -= 2;
            }

            if ('R' == c) {
                steps += 1;
            }

            if ('L'== c) {
                steps -= 1;
            }

        }
        return (steps == 0);

    }

}
