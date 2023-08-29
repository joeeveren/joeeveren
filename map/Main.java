import java.util.HashMap;
import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println("Заданиe 1");
        String[] capitalsArray = {
                "Tokyo", "New Delhi", "Beijing", "Moscow", "Cairo", "London", "Berlin", "Paris", "Rome", "Madrid",
                "Bangkok", "Seoul", "Mexico City", "Washington, D.C.", "Ottawa", "Brasília", "Buenos Aires", "Copenhagen", "Stockholm", "Helsinki",
                "Oslo", "Amsterdam", "Vienna", "Athens", "Dublin", "Riyadh", "Ankara", "Cape Town", "Nairobi", "Cairo",
                "Baghdad", "Tel Aviv", "Abu Dhabi", "Doha", "Kuwait City", "Manama", "Muscat", "Jakarta", "Hanoi", "Wellington",
                "Canberra", "Islamabad", "Colombo", "Kathmandu", "Dhaka", "Phnom Penh", "Bangkok", "Vientiane", "Hanoi", "Kuala Lumpur",
                "Singapore", "Manila", "Jakarta", "Pyongyang", "Seoul", "Tokyo", "Beijing", "Taipei", "Ulaanbaatar", "Astana",
                "Moscow", "Tehran", "Baghdad", "Kuwait City", "Riyadh", "Abu Dhabi", "Doha", "Ankara", "Jerusalem", "Amman",
                "Cairo", "Nairobi", "Harare", "Pretoria", "Addis Ababa", "Dakar", "Rabat", "Accra", "Lagos", "N'Djamena",
                "Tripoli", "Algiers", "Tunis", "Rabat", "Khartoum", "Cairo", "N'Djamena", "Brazzaville", "Kigali", "Kinshasa",
                "Nairobi", "Kampala", "Maputo", "Antananarivo", "Windhoek", "Gaborone", "Lusaka", "Luanda", "Pretoria", "Maseru"
        };
        HashMap<String, Integer> capitalCities = new HashMap<String, Integer>();
        Random rand = new Random();
        for (String capital : capitalsArray) {

            capitalCities.put(capital, rand.nextInt(100)+1);
        }
        for (String capital : capitalCities.keySet())
            System.out.println(capital + " : " + capitalCities.get(capital));
        capitalCities.clear();
        
        
        System.out.println("Заданиe 2");
        int [] num = {8, 5, 9, 7, 4, 3, 9, 10, 10, 3, 4, 10, 5, 7, 4, 2, 9, 5, 4, 6, 3, 3, 8, 2, 3, 9, 10, 4, 7, 6, 2, 5, 2, 10, 6, 2, 4, 1, 8, 7, 2, 3, 7, 3, 4, 4, 8, 1, 1, 2, 3, 1, 2, 9, 7, 7, 8, 8, 8, 10, 7, 3, 5, 4, 1, 9, 9, 7, 4, 4, 6, 3, 9, 10, 2, 1, 10, 6, 2, 4, 2, 3, 1, 6, 4, 1, 1, 5, 6, 3, 7, 4, 4, 9, 7, 3, 2, 7, 1, 2};

        int mount = 8;
        HashMap<Integer, Integer> nums = new HashMap<Integer, Integer>();
        for (int q = 1; q < 11; q ++)
            nums.put(q, 0);
        for (int w : num)
            nums.put(w, nums.get(w) + 1);
        for (Integer p: nums.keySet())
            if (nums.get(p) >= mount)
                System.out.println(p  );
    }}
