/**
 * Created by caleb on 3/9/17.
 */
public class EHSMain {

    public static int factorial (int n) throws EHSException {
        // assert n >= 0;
        if (n < 0) {
            throw new EHSException("can't handle a negative number " + n);
        }
        int total = 1;
        for (int i = n ; i >0 ; i--) {
            total = total * i;
        }
        return total;
    }

    public static void main(String[] args) {
        try {
            System.out.println(factorial(3));
            System.out.println(factorial(-4));
        } catch (EHSException ex){
            System.out.println(ex);
            ex.printStackTrace();
        }
    }
}
