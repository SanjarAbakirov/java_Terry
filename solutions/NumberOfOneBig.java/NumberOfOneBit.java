class NumberOfOneBit {
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 22;
        System.out.println("n = " + n + " (binary: " + Integer.toBinaryString(n) + ")");
    }
}