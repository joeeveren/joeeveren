import java.util.*;
public class Level1 {
    public static int [] MadMax(int N, int [] Tele) {
        Tele = sorted(Tele);
        for(int i =(N - 1 ) / 2; i < (3 * N / 4 -0.25); i ++){
                    int e = Tele[i];
                    Tele[i] = Tele[N -1- i + (N - 1 ) / 2];
                    Tele[N - i - 1 + (N - 1 ) / 2] = e;
    }
    return Tele;
    }
    public static int [] sorted( int [] m) {
        int b = m.length;
        while ( b > 0){
            for(int i = 0; i < b - 1; i ++){
                if (m[i] > m[i + 1]) {
                    int e = m[i];
                    m[i] = m[i + 1];
                    m[i + 1] = e;                
                }
            }  b = b - 1;
        }    
         return m;
} 
}
