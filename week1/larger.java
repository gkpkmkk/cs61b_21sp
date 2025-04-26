/** Define a function in java */
public class larger {
    /** a function that return larger number of a and b */
    public static int larger(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(larger(10, 20));
    }
}