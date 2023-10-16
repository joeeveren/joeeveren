import java.util.*;

public class Level1 {
    public static boolean MisterRobot(int N, int [] data) {
        int s = 0;
        for (int i = 0; i < N - 1; i ++) {
            for (int j = i + 1; j < N; j ++ ){
                if ( data[i]> data [j]) {
                    s = s + 1;
                }
            }
        }
        if ( s % 2 == 0) {
            return true;
        }
        return false;
    }
}
