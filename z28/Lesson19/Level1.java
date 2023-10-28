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
        sortResults(resultArray);
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
    
    
    public static void sortResults(String[] results) {
    for (int i = 0; i < results.length - 1; i++) {
        for (int j = 0; j < results.length - i - 1; j++) {
            String[] parts1 = results[j].split("\\s+");
            String[] parts2 = results[j + 1].split("\\s+");
            int sales1 = Integer.parseInt(parts1[1]);
            int sales2 = Integer.parseInt(parts2[1]);

            if (sales1 < sales2) {
                String temp = results[j];
                results[j] = results[j + 1];
                results[j + 1] = temp;
            } else if (sales1 == sales2) {
                if (parts1[0].compareTo(parts2[0]) > 0) {
                    String temp = results[j];
                    results[j] = results[j + 1];
                    results[j + 1] = temp;
                }
            }
        }
    }
}

    
    
    
}
