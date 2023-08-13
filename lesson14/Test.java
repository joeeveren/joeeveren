import java.io.*;

public class Test {
    public static void main(String[] args) {
        File myFile = new File("1.txt");
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(myFile));
            String st = br.readLine();
            while (st != null) {
                System.out.println(st);
                st = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
