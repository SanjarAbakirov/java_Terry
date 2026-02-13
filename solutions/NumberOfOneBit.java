class NumberOfOneBit {
    public static int numberOfOneBit(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>>= 1;
        }
        return count;
    }

    // Проверочная функция (тест)
    public static void main(String[] args) {
        int[] testValues = { 0, 1, 2, 3, 4, 5, 22, -1, -2, Integer.MAX_VALUE, Integer.MIN_VALUE };
        for (int n : testValues) {
            int result = numberOfOneBit(n);
            int expected = Integer.bitCount(n);
            System.out.printf("n = %d (binary: %s) -> result: %d, expected: %d %s%n",
                    n, Integer.toBinaryString(n), result, expected,
                    result == expected ? "OK" : "FAIL");
        }
    }
}