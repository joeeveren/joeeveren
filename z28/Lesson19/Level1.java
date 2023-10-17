import java.util.*;

public class Level1 {

    public static String[] ShopOLAP(int N, String[] items) {
        String[] name = new String[N];
        int[] num = new int[N];
        for (int j = 0; j < N; j++) {
            String[] i = items[j].split(("\\s+"));
            name[j] = i[0];
            num[j] = Integer.parseInt(i[1]);
        }
        List<String> n = new ArrayList<>();
        List<String> f = new ArrayList<>();
        for (int u = 0; u < N; u++) {
            if (ex(n, name[u])) {
                continue;
            }
            n.add(name[u]);
            int a = num[u];
            for (int t = u + 1; t < N; t++) {
                if (name[t].compareTo(name[u]) == 0) {
                    a = a + num[t];
                }
            }
            f.add(String.valueOf(a));
        }
        List<String> finals = new ArrayList<>();
        for (int g = 0; g < n.size(); g++) {
            finals.add(n.get(g) + " " + f.get(g));
        }
        String[] resultArray = new String[finals.size()];
        for (int i = 0; i < finals.size(); i++) {
            resultArray[i] = finals.get(i);
        }
        return resultArray;
    }

    public static boolean ex(List<String> n, String s) {
        for (String nam : n) {
            if (s.equals(nam)) {
                return true;
            }
        }
        return false;
    }
}
