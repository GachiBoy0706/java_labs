public class Main {
    public static void main(String[] args) {
        // Логические операции: && (и), || (или), !
        boolean bool_true = true;
        boolean bool_false = false;

        System.out.println("Logical Operators:");
        System.out.println("bool_true && bool_false: " + (bool_true && bool_false)); // false
        System.out.println("bool_true || bool_false: " + (bool_true || bool_false)); // true
        System.out.println("!bool_true: " + !bool_true); // false

        // Тернарная операция: x < y ? x : y
        int x = 5;
        int y = 10;
        int result = (x < y) ? x : y;
        System.out.println("\nTernary Operator:");
        System.out.println("result: " + result); // 5

        // Поразрядные логические операции: & (и), | (или), ^ (исключающее или), ~ (инверсия)
        int num5 = 5;  // 0101 в двоичной системе
        int num3 = 3;  // 0011 в двоичной системе

        System.out.println("\nBitwise Logical Operators:");
        System.out.println("num5 & num3: " + (num5 & num3)); // 1 (0001)
        System.out.println("num5 | num3: " + (num5 | num3)); // 7 (0111)
        System.out.println("num5 ^ num3: " + (num5 ^ num3)); // 6 (0110)
        System.out.println("~num5: " + (~num5));

        // Операции сдвига: >> (арифметический сдвиг вправо), << (сдвиг влево), >>> (логический сдвиг вправо)
        int num16 = 16; // 10000 в двоичной системе

        System.out.println("\nShift Operators:");
        System.out.println("num16 >> 2: " + (num16 >> 2));   // 4 (0100)
        System.out.println("num16 << 1: " + (num16 << 1));   // 32 (100000)
        System.out.println("num16 >>> 2: " + (num16 >>> 2)); // 4 (0100)
    }
}
