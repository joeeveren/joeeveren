import java.util.*;
public class Level1 {
    public static int Unmanned(int L, int N, int [][] track) {
        int s = 0;
        int k = 0;
        for (int i = 0; i < track.length; i ++){
            k = track[i][0]  - k;
            int t = (s + k ) % (track[i][1] + track[i][2]); 
            int l = (t < track[i][1]) ? track[i][1] : k;
            s = s + l ;
        }
        return s + L - track[track.length -1][0] ;
        }
}
