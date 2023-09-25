public class Level1 {
    
    public static int SumOfThe(int N, int [] data) {
        int s = 0;
        for (int i : data) 
        s = s + i;
        return s / 2;
    }
}
