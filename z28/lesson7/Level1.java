import java.util.*;

public class Level1 {
    
    public static int chece(String s, String subs) {
        String[] words = s.split(" ");
        for (String word : words) {
            if (word.equals(subs)) {
                return 1;
            }
        }
        return 0;
    }

    public static int[] WordSearch(int len, String s, String subs) {
        String[] words = s.split(" ");
        int rowo = 0;
        String we = "";
        List<Integer> output = new ArrayList<>();

        for (String word : words) {
            if (rowo + word.length() + 1 <= len) {
                rowo += word.length() + 1;
                we = we + " " + word;
            } else {
                if (we.length() > 0) {
                    output.add(chece(we, subs));
                    we = "";
                    rowo = 0;
                }
                if (word.length() > len) {
                    String ert = word;
                    while (ert.length() >= len) {
                        output.add(chece(ert.substring(0, len), subs));
                        ert = ert.substring(len);
                    }
                    rowo = ert.length();
                    we = ert;
                } else {
                    we = word;
                    rowo = word.length();
                }
            }
        }

        if (we.length() > 0) {
            output.add(chece(we, subs));
        }

        int[] resultArray = new int[output.size()];
        for (int i = 0; i < output.size(); i++) {
            resultArray[i] = output.get(i);
        }

        return resultArray;
    }
}
