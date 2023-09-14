import java.util.*;

public class Level1
{
   public static int odometer(int [] oksana)  {
        int w = 0;
        for (int i = 0; i < oksana.length; i += 2) {
            if     (i == 0)  w = w + oksana[i] * oksana [i + 1];
            else             w = w + oksana[i] * (oksana [i + 1] - oksana [i - 1]);
        }
        return w ;
    }
}
