import java.util.*;
public class Level1 {
   public static String PatternUnlock(int N, int [] hits)  {
       int [] x = {0,2,2,2,1,1,1,3,3,3 }; // coordinates of points on x
       int [] y = {0,3,2,1,1,2,3,1,2,3 }; //coordinates on y
      double s = 0;
for (int i = 0; i < N - 1; i++) {
    s += Math.sqrt(Math.pow(x[hits[i]] - x[hits[i + 1]], 2) + Math.pow(y[hits[i]] - y[hits[i + 1]], 2));
}
s = Math.round(s * 100000.0) / 100000.0; 
         return  String.valueOf(s).replace("0","").replace(".",""); 
    }
}
