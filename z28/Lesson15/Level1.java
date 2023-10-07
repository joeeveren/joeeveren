public class Level1 {
    public static String south (int a, int b, int c , String s) {
        String [] w = s.split(" ");
        String t = "";
        for (int i = 0; i < b; i ++) {
            String e = "";
            for (int j = 0; j < a; j ++) {
                e = e + w[j].charAt(i);
            }
            t = t + " " + " ".repeat(c - a) + e;
        }
        return t.substring(c - a + 1);
    }
    public static String north (int a, int b, int c , String s) {
        String t = south (a,  b,  c , s);
        String n = "";
        for (int i = t.length() - 1; i >= 0; i --) {
            n = n + t.charAt(i);
        }
        return n;
    }
    public static String reverse (int a, int b, int c , String s){
        String n = "";
        for (int i = s.length() - 1; i >= 0; i --) {
            n = n + s.charAt(i);
        }
        return n;
    }
    public static String normalise (int a, int b, int c , String s) {
        String [] w = s.split("\\s+");
        String t = "";
        for (String i:w) {
            t = t + " " + " ".repeat(c - b) + i;
        }
        return t.substring(c - b + 1);
    }
    public static Boolean ch(int n, String s, String t) {
        for (int i = 0; i < t.length(); i ++) {
            if ( t.charAt(i) != s.charAt(i + n) & t.charAt(i) != ' ') {
                return false;
            }
        }
        return true;
    }
    public static String rev(int a, int b, int c , String s) {
        String [] w = s.split(" ");
        String ret = "";
        for (String e:w) {
            String t = "";
            for (int i = e.length() - 1; i >= 0; i --) {
                t = t +e.charAt(i);
            }
            ret = ret + " "+ t;
        }
        return ret.substring(1);
    }
    public static Boolean TankRush(int H1, int W1, String S1, int H2, int W2, String S2) {
        Boolean b = false;
        String s = south (H2, W2, W1, S2);
        String ss = reverse (H2, W2, W1, s);
        String sss = normalise (W2, H2, W1,rev (H2, W2, W1, s));
        String r = normalise (H2, W2, W1, rev (H2,W2,W1,S2));
        String n = north (H2, W2, W1, S2);
        String nn = normalise (H2, W2, W1,rev (H2, W2, W1, n));
        String nnn = normalise (W2, H2, W1,rev (H2, W2, W1, n));
        String p = reverse (H2, W2, W1, r);
        String norm = normalise (H2, W2, W1, S2);
        String u = reverse (H2, W2, W1, norm);
        Boolean chec = false;
        for (int i = 0; i < S1.length(); i ++) {
            if (S1.charAt(i) == s.charAt(0) & S1.length() - i >= s.length() - 1) {
                chec = ch (i, S1, s);
                if (chec) {
                    return true;
                }
            }
            if (S1.charAt(i) == ss.charAt(0) & S1.length() - i >= ss.length() - 1) {
                chec = ch (i, S1, ss);
                if (chec) {
                    return true;
                }
            }
            if (S1.charAt(i) == sss.charAt(0) & S1.length() - i >= sss.length() - 1) {
                chec = ch (i, S1, sss);
                if (chec) {
                    return true;
                }
            }
            if  (S1.charAt(i) == n.charAt(0) & S1.length() - i >= n.length() - 1) {
                chec = ch (i, S1, n);
                if (chec) {
                    return true;
                }
            }
            if  (S1.charAt(i) == nn.charAt(0) & S1.length() - i >= nn.length() - 1) {
                chec = ch (i, S1, nn);
                if (chec) {
                    return true;
                }
            }
            if  (S1.charAt(i) == nnn.charAt(0) & S1.length() - i >= nnn.length() - 1) {
                chec = ch (i, S1, nnn);
                if (chec) {
                    return true;
                }
            }
            if   (S1.charAt(i) == norm.charAt(0) & S1.length() - i >= norm.length() - 1) {
                chec = ch (i, S1, norm);
                if (chec) {
                    return true;
                }
            }
           if   (S1.charAt(i) == p.charAt(0) & S1.length() - i >= p.length() - 1) {
                chec = ch (i, S1, p);
                if (chec) {
                    return true;
                }
            }
            if  (S1.charAt(i) == u.charAt(0) & S1.length() - i >= u.length() - 1) {
                chec = ch (i, S1, u);
                if (chec) {
                    return true;
                }
            }
            if  (S1.charAt(i) == r.charAt(0) & S1.length() - i >= r.length() - 1) {
                chec = ch (i, S1, r);
                if (chec) {
                    return true;
                }
            }
        }
        return false;
    }
}
