import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Loggi {
    public static void main(String[] args) {
        int[] n = new int[4];
        File logFile = new File("log_2.txt");
        try {
            PrintStream printStream = new PrintStream(logFile);
            System.setOut(printStream);
            System.setErr(printStream);

            for (int i = 0; i < 15; i++) {
                n[i] = i;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
