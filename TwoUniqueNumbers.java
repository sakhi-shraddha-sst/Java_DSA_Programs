public class TwoUniqueNumbers {
    public static int[] find(int[] a) {
        int xor = 0;
        for (int x : a) xor ^= x;
        int bit = xor & -xor;
        int x = 0, y = 0;
        for (int v : a) {
            if ((v & bit) == 0) x ^= v;
            else y ^= v;
        }
        return new int[]{x, y};
    }
}