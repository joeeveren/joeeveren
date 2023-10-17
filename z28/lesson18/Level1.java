public class Level1 {
    public static boolean MisterRobot(int N, int[] data) {
        
        int d = 1;
        while (d <= N){
            int i = 0;
        while (i < N - 2) {
            int a = data[i];
            int b = data[i + 1];
            int c = data[i + 2];

            if (a < с && b < c) {
                i++;
            } else  {
                int temp = a;
                data[i] = b;
                data[i + 1] = c;
                data[i + 2] = temp;
        }
        }
      
               d += 1;
        }
        for (int j = 1; j < N; j++) {
            if (data[j] < data[j - 1]) {
                return false; 
            }
        }
        return true; 
    }
}
