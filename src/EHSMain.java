/**
 * Created by caleb on 3/9/17.
 */
public class EHSMain {

    public static int factorial (int n) {
        assert n >= 0;
        int total = 1;
        for (int i = n ; i >0 ; i--) {
            total = total * i;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(factorial(3));
        System.out.println(factorial(-4));
    }
}
