import java.util.*;

public class Level1 {
    public static String TheRabbitsFoot(String s, Boolean encode){
        
        String s1 = s.replaceAll(" ", ""); 
        int q = s1.length();
        int [] a = sizes (q);
        if (encode) {
            s = s1;
            int x = a[0];
            int y = a[1];
            return Encode (s, x , y);
        } else {
            int x = a[1];
            int y = a[0];
            return Decode (s,x,y);
        } 
    }
    
    public static String Encode (String s, int x , int y ){
        char[][] matric = new char[x][y];
        int place = 0;
        for (int i = 0; i < x; i ++) {
            for (int j = 0; j < y; j++) {
                if (place < s.length()) {
                    matric[i][j] = s.charAt(place);
                    place += 1;
                } else {
                    matric[i][j] = ' ';
                }
            }
        }
        String t = "";
        for (int i = 0; i < y; i ++) {
            for (int j = 0; j < x; j++) {
                t = t + matric[j][i];
            }
            t = t + " ";
        }
        return t;
    }
    
    public static int[] sizes(int q) {
        int w = (int) Math.sqrt(q);
        if (q == w * w) {
            return new int[]{w, w};
        } else if (q <= w * (w + 1)) {
            return new int[]{w, w + 1};
        }
        return new int[]{w + 1, w + 1};
    }
    
    public static String Decode (String s, int x , int y ){ 
        String [] row = s.split(" ");
        String t = "";
        for (int i = 0; i < row.length; i++) {
            if (row[i].length() < x) {
                row[i] = row[i] + " ".repeat(x - row[i].length());
            }
        }
        for (int i = 0; i < x; i ++) {
            for (String j: row)  {
                t = t + j.charAt(i);
            }
        }
        return t.replaceAll(" ", "");
    }
}
