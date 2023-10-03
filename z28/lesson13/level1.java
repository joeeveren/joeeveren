import java.util.*;

public class Level1 {

    public static int[] UFO(int N, int[] data, boolean octal) {
        List<Integer> output = new ArrayList<>();
        int mult = (octal) ? 8 : 16;
        for (int k : data) {
            int sum = 0;
            int[] gh = (octal) ? oct(k) : noct(k);
            for (int i = 0; i < gh.length; i++) {
                sum = sum + gh[i] * (int) Math.pow(mult, gh.length - i - 1);
            }
            output.add(sum);
        }
        int[] resultArray = new int[output.size()];
        for (int i = 0; i < output.size(); i++) {
            resultArray[i] = output.get(i);
        }

        return resultArray;
    }

    public static int[] noct(int d) {
        String w = String.valueOf(d);
        String[] m = w.split("");
        int[] g = new int[m.length];
        for (int i = 0; i < m.length; i++) {
              if (m[i].equals("A") || m[i].equals("a"))   {
                g[i] = 10;
            } else  if (m[i].equals("B") || m[i].equals("b"))  {
                g[i] = 11;
            }else  if (m[i].equals("C") || m[i].equals("c"))  {
                g[i] = 12; 
            } else   if (m[i].equals("D") || m[i].equals("d"))   {
                g[i] = 13;
            } else   if (m[i].equals("E") || m[i].equals("e"))  {
                g[i] = 14;
            } else   if (m[i].equals("F") || m[i].equals("f"))  {
                g[i] = 15;
            } else 
            g[i] = Integer.parseInt(m[i]);
        }
        return g;
    }

    public static int[] oct(int d) {
        String w = String.valueOf(d);
        String[] m = w.split("");
        int[] g = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            g[i] = Integer.parseInt(m[i]);
        }
        return g;
    }
}
