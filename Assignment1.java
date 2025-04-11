import java.util.Scanner;

public class Assignment1 {
    //Complexity: linear O(n)
    public static void Task1() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(findMin(nums));
    }

    private static int findMin(int[] n) {
        return findMinRecursive(n, n.length - 1);
    }

    private static int findMinRecursive(int[] n, int index) {
        if (index == 0) {
            return n[0];
        }
        return Math.min(findMinRecursive(n, index - 1), n[index]);
    }
    //Complexity: linear O(n)
    public static void Task2() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(average(nums));
    }

    private static double average(int[] numbers) {
        return averageRecursive(numbers, numbers.length, 0);
    }

    private static double averageRecursive(int[] numbers, int length, int index) {
        if (index == length - 1) {
            return numbers[index] / (double) length;
        }
        return numbers[index] / (double) length + averageRecursive(numbers, length, index + 1);
    }
    //Complexity: linear O(n)
    public static void Task3() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (checkPrime(n, 2)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }

    private static boolean checkPrime(int n, int divisor) {
        if (n <= 1) return false;
        if (divisor * divisor > n) return true;
        if (n % divisor == 0) return false;
        return checkPrime(n, divisor + 1);
    }
    //Complexity: linear O(n)
    public static void Task4() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }

    private static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
    //Complexity: exponential O(2**n)
    public static void Task5() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fib(n));
    }

    private static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }
    //Complexity: linear O(n)
    public static void Task6() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(power(a, n));
    }

    private static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }
    //Complexity: factorial O(n!)
    public static void Task7() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        permute(str, "");
    }

    private static void permute(String str, String path) {
        if (str.length() == 0) {
            System.out.println(path);
        } else {
            for (int i = str.length() - 1; i >= 0; i--) {
                permute(str.substring(0, i) + str.substring(i + 1), path + str.charAt(i));
            }
        }
    }
    //Complexity: linear O(n)
    public static void Task8() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (checkDigits(str, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean checkDigits(String str, int index) {
        if (index == str.length()) return true;
        if (!Character.isDigit(str.charAt(index))) return false;
        return checkDigits(str, index + 1);
    }
    //Complexity: exponential O(2**n)
    public static void Task9() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(binomialCoefficient(n, k));
    }

    private static int binomialCoefficient(int n, int k) {
        if (k == 0 || n == k) return 1;
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
    //Complexity: logarithmic O(log n)
    public static void Task10() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(gcd(n, m));
    }

    private static int gcd(int n, int m) {
        if (m == 0) return n;
        return gcd(m, n % m);
    }
//Calling all functions
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
        Task8();
        Task9();
        Task10();
    }
}
