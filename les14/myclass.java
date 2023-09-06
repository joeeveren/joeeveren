import java.io.*;
import java.util.Random;

public class myclass {
    private static final String LOG_FILE_PATH = "error.log"; // Путь к лог-файлу
    public static final Random rand = new Random();

    public static void main(String[] args) {

        // задание 3.1
        for (int i = 1; i < 11; i++) {
            String filePath = i + ".txt";
            File myFile = new File(filePath);

            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(myFile));
                bw.write(String.valueOf(rand.nextInt(100)));
                bw.newLine();
                bw.write(String.valueOf(rand.nextInt(100)));
                bw.newLine();
                bw.write(String.valueOf(rand.nextInt(100)));
                bw.close();
            } catch (IOException e) {
                logError("ошибка при создании файла: " + e.getMessage());
            }
        }

        // задание 3.2
        try {
            int sum = sumFromFile("");
            System.out.println("Сумма всех чисел: " + sum);
        } catch (IOException e) {
            logError("ошибка при суммировании чисел: " + e.getMessage());
        }
    }

    public static int sumFromFile(String pathPrefix) throws IOException {
        int sum = 0;
        int n1 = rand.nextInt(10) + 1;
        int n2 = rand.nextInt(10) + 1;

        for (int i : new int[]{n1, n2}) {
            String filePath = pathPrefix + i + ".txt";
            File myFile = new File(filePath);
            BufferedReader br = new BufferedReader(new FileReader(myFile));
            int g = 3;
            while (g > 0) {
                String line = br.readLine();
                if (line == null) {
                    logError("файл " + myFile.getName() + " неполное.");
                    throw new IOException("Файл " + myFile.getName() + " неполное.");
                }
                sum += Integer.parseInt(line);
                g--;
            }
            br.close();
        }
        return sum;
    }

    private static void logError(String message) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(LOG_FILE_PATH, true))) {
            bw.write(message);
            bw.newLine();
        } catch (IOException e) {
            System.err.println("ошибка при записи в лог файл: " + e.getMessage());
        }
    }
}
