public class HammingWeight {
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            // if the minor bit equals 1 - add 1 to the count
            count += n & 1;
            // move number to the right, to check out next bit
            n >>>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 22;
        // int[] testNumbers = { 0, 1, 2,3,4,5,6,7,8,11,128,255,256, Integer.MAX_VALUE};
        System.out.println("n = " + n + " (binary: " + Integer.toBinaryString(n) + ")");
        System.out.println("Set bits: " + hammingWeight(n));
    }
}