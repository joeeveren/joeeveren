import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Scanner;
public class Vvod{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in,"CP1251");

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Привет, " + name + "!  ");
    }
}

