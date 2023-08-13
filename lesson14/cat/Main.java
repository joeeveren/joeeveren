import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class Cat {
    private String name;
    private double weight;
    private int murr;

    public Cat(String name, double weight, int murr) {
        this.name = name;
        this.weight = weight;
        this.murr = murr;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getMurr() {
        return murr;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", murr=" + murr +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Cat> catList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("cats.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] catInfo = line.split(" ");
                if (catInfo.length != 3) {
                    System.out.println("неверный формат: " + line);
                    continue;
                }

                try {
                    String name = catInfo[0];
                    double weight = Double.parseDouble(catInfo[1]);
                    int murr = Integer.parseInt(catInfo[2]);
                    catList.add(new Cat(name, weight, murr));
                } catch (NumberFormatException e) {
                    System.out.println("неверные данные: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Cat cat : catList) {
            System.out.println(cat);
        }
    }
}
