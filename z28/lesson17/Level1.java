import java.util.*;

public class Level1
{
  public static Boolean LineAnalysis(String line) {
        int a = line.length();
        for (int i = 0; i < a / 2; i ++) {
            if (line.charAt(i) != line.charAt(a - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
