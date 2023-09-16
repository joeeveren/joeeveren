import java.util.*;
public class Level1
{
    public static int ConquestCampaign(int N, int M, int L, int [] battalion) {
        int  b[][] = new int[ N + 2 ][ M + 2];
        int r = 0;
        int d = 1 ;
        for (int i = 0; i < 2 * L; i += 2) {
            b[ battalion [i] ][ battalion [i+1] ] = 5 ;
            r = r + 1 ;
            
        }
        while (r < N * M ) {
            for (int i = 1 ; i <=  N ; i ++){
                for (int j = 1; j <= M ; j ++) {
                   if ( b[ i ][ j ] == 0 & b[i][j + 1] == 5) {
                    b[i][j] += 1  ;
                    r = r + 1;
                   }
                }
            }
            for (int i = 1 ; i <=  N ; i ++){
                for (int j = 1; j <= M ; j ++) {
                   if (b[i][j] == 0 & b[i][j - 1] == 5  ) {
                    b[i][j] += 1 ;
                    r = r + 1;
                   }
                }
            }
            for (int i = 1 ; i <=  N ; i ++){
                for (int j = 1; j <= M ; j ++) {
                   if ( b[ i ][ j ] == 0 & b[i-1][j] == 5 ) {
                    b[i][j] += 1 ;
                    r = r + 1; 
                   }
                }
            }
            for (int i = 1 ; i <=  N ; i ++){
                for (int j = 1; j <= M ; j ++) {
                   if ( b[ i ][ j ] == 0 &b[i +1][j] == 5) {
                    b[i][j] += 1 ;
                    r = r + 1;
                   }
                }
            }
            for (int i = 1 ; i <=  N ; i ++){
                for (int j = 1; j <= M ; j ++) {
                   if ( b[ i ][ j ]  != 0) {
                    b[i][j] = 5 ;
                   }
                }
            }
            d = d + 1; 
        } 
        
        return d;
    }

}
