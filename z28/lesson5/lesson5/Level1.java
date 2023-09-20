import java.util.*;
public class Level1 {
   public static int [] SynchronizingTables(int N, int [] ids, int [] salary)  {
         salary = sorted(salary);
         int [] idw = sorted2(ids);
         int [] outcom = new int [N];
         for (int i = 0 ; i < N; i ++){
             outcom[i] = salary[idw[i]];
         } return outcom;
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
    public static int [] sorted2( int [] m) {
        int b = m.length;
        int [] k = new int [b] ;
            for(int i = 0; i < b - 1; i ++){
                for(int j = i + 1; j < b ; j ++){
                if (m[i] > m[j]) {
                    k [i] = k[i] + 1;
                } else k[j ] = k[j ] + 1 ;
            } 
        }    
         return k;
}
}
