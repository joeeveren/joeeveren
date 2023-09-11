import java.io.*;
import java.util.Random;

public class myclass {
    public static final Random rand = new Random();

    public static void main(String[] args) {
        try {
            int[] result = sumFromRandomFiles("");
            if (result[0] == 0) {
                System.out.println("Сумма всех чисел: " + result[1]);
                System.out.println(result[0]);
            } else {
                System.out.println("Ошибка при суммировании чисел. Код ошибки: " + result[0]);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при суммировании чисел: " + e.getMessage());
        }
    }

    public static int[] sumFromRandomFiles(String pathPrefix) throws IOException {
        int[] result = new int[2];
        int sum = 0;

        int n1 = rand.nextInt(10) + 1;
        int n2;
        do {
            n2 = rand.nextInt(10) + 1;
        } while (n1 == n2);

        for (int i : new int[]{n1, n2}) {
            String filePath = pathPrefix + i + ".txt";
            File myFile = new File(filePath);

            if (!myFile.exists()) {
                result[0] = 1; // Код ошибки 1: Файл не существует
                result[1] = 0; // Сумма равна 0, так как файла нет
                return result;
            }

            BufferedReader br = new BufferedReader(new FileReader(myFile));
            int linesRead = 0;
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    int number = Integer.parseInt(line);
                    sum += number;
                    linesRead++;
                } catch (NumberFormatException e) {
                    result[0] = 1; // Код ошибки 3: Файл содержит неправильные данные
                    result[1] = 0; // Сумма равна 0, так как файл содержит ошибку
                    br.close();
                    return result;
                }
            }
            br.close();

            if (linesRead != 3) {
                result[0] = 2; // Код ошибки 2: Файл неполный
                result[1] = 0; // Сумма равна 0, так как файл неполный
                return result;
            }
        }

        result[0] = 0; // Успешное выполнение
        result[1] = sum; // Сумма чисел
        return result;
    }
}
