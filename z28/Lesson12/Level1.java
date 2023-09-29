import java.util.*;
public class Level1 {
    public static String MassVote(int N, int [] Votes) {
        if (N == 1) {
            return "majority winner 1";
        }
        int id ;
        int max1 ;
        int max2 ;
        if(Votes[0] > Votes[1]) {
        max1 = Votes[0];
        id = 0;
        max2 = Votes[1];
      } else {
        max1 = Votes[1];
        id = 1;
        max2 = Votes[0];
      }
        int sum = Votes[0] + Votes[1];
        for(int i = 2; i < N; i ++) {
            sum = sum + Votes[i];
            if(Votes[i] >= max1) {
                max2 = max1;
                max1 = Votes[i];
                id = i;
            } else if(Votes[i] > max2)
         max2 = Votes[i];
        }
        if (max1 == max2) {
            return  "no winner" ;
        }
        if (1.0 *max1 / sum * 100 >= 50 ) {
            return "majority winner " + (id + 1);
        }
        return "minority winner " + (id + 1);
        }
    }

