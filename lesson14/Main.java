import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
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
                e.printStackTrace();
            }
        }
        // задание 3.2
        public static int sumFromFile(String pathPrefix, int number1, int number2) {
            int sum = 0;

            for (int i = 1; i <= 2; i++) {
                String filePath = pathPrefix + i + ".txt";
                try {
                    File myFile = new File(filePath);
                    BufferedReader br = new BufferedReader(new FileReader(myFile));
                    int g = 3;
                    while (g > 0) {
                        String line = br.readLine();
                        if (line == null) {
                            System.out.println("File " + myFile.getName() + " неполное.");
                            return -1;
                        }
                        sum += Integer.parseInt(line);
                        g--;
                    }
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    return -1; //
                } catch (NumberFormatException e) {
                    System.out.println("File " + filePath + " соедржит неправильные данные.");
                    return -1;
                }
            }
            return sum;
        }



    }
    }

