public class Sort {
    public static int[] sort(int[] w) {
        int n = w.length;
        for (int b = n - 1; b > 0; b--) {
            for (int i = 0; i < b; i++) {
                if (w[i] > w[i + 1]) {
                    int e = w[i];
                    w[i] = w[i + 1];
                    w[i + 1] = e;
                }
            }
        }
        return w;
    }
}
