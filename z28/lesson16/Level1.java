import java.util.*;
public class Level1 {
    public static int [] sorted( int [] m) {
        int b = m.length;
        while ( b > 0){
            for(int i = 0; i < b - 1; i ++){
                if (m[i] < m[i + 1]) {
                    int e = m[i];
                    m[i] = m[i + 1];
                    m[i + 1] = e;
                }
            }  b = b - 1;
        }
        return m;
    }
    public static int MaximumDiscount(int N, int [] price) {
        int [] p = sorted(price);
        int sum = 0;
        for (int i = 0; i < N; i ++) {
            if (i % 3 == 2) {
                sum = sum + p[i];
            }
        }
        return sum;
    }

}
