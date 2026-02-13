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
        int n = 22;
        int result = numberOfOneBit(n);
        int expected = Integer.bitCount(n);

        System.out.println("n = " + n + " (binary: " + Integer.toBinaryString(n) + ")");
        System.out.println("Hamming weight = " + result);
        System.out.println("Expected = " + expected);

        if (result == expected) {
            System.out.println("Тест пройден!");
        } else {
            System.out.println("Тест не пройден!");
        }
    }
}