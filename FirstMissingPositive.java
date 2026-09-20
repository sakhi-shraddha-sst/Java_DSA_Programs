public class FirstMissingPositive {
    public static int find(int[] a) {
        for (int i = 0; i < a.length; i++) {
            while (a[i] >= 1 && a[i] <= a.length && a[a[i] - 1] != a[i]) {
                int t = a[i];
                a[i] = a[t - 1];
                a[t - 1] = t;
            }
        }
        for (int i = 0; i < a.length; i++)
            if (a[i] != i + 1) return i + 1;
        return a.length + 1;
    }
}