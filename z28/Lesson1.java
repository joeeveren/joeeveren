import java.util.*;

public class Level1
{
    public static int squirrel(int N)
    {
        double g = 1 ;
        System.out.println(N);
        while (N > 0) {
            g = g * N ;
            N = N - 1;
        }
        while (g > 10)
            g = g / 10;
        return (int) g  ;
    }
}
