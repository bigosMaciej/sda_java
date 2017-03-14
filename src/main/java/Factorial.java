/**
 * Created by mac on 2017-03-14.
 */
public class Factorial {

        static int calculateFactorial(int i)
        {
            if (i < 1)
                return 1;
            else
                return i * calculateFactorial(i - 1);
        }
}
