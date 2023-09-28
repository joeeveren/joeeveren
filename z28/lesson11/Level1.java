import java.util.*;
public class Level1 {
    public static String BigMinus(String s1, String s2) {
        char [] a ;
        char [] b;
        if (s1.length() >  s2.length() || s1.length() ==  s2.length() &  s1.compareTo(s2) > 0) {
            a = s1.toCharArray();
            b = s2.toCharArray();
            
        } else {
            a = s2.toCharArray();
            b = s1.toCharArray();
        }
        int c = 0;
        int y = a.length - b.length;
        for (int i = b.length - 1; i >= 0; i --) {
            int g;
            int a1 = Character.getNumericValue(a[i + y]);
            int b1 = Character.getNumericValue(b[i]);
            if (a1 - c >= b1) {
                g = a1 - b1 - c;
                c = 0;
            } else {
                g = a1 + 10 - b1 - c;
                c = 1; 
            }a[i + y] = (char)(g+'0');
        }
        for (int i = y - 1; i >= 0; i --) {
            if (c == 0) {
                break;
            } if (Character.getNumericValue(a[i]) - 1 >= 0 ) {
                c = 1;
                a[i] = (char)( Character.getNumericValue(a[i]) - 1+'0');
            }else {
                a[i] = (char)( Character.getNumericValue(a[i]) - 1 + 10 +'0');
            }
        }
        String fine = "";
        boolean f = true;
        for (char o : a ) {
            if (o == '0' & f) {
                continue;
            } 
            f = false;
            fine = fine + o;
        }
        return fine;
    } 
}
