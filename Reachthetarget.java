import java.util.Scanner;

class Reachthetarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextInt();
            long b = sc.nextInt();
            long c = sc.nextInt();
            long d = sc.nextInt();
            if (isPossible(a, b, c, d))
                System.out.println("yes");
            else
                System.out.println("no");

        }

    }

    static boolean isPossible(long a, long b, long c, long d) {
        if (d == 0 && a == c)
            return true;
        if (d == 0 && a != c)
            return false;
        if (a <= c)
            return isPossible(a + b, b, c, d - 1);
        else
            return isPossible(a - b, b, c, d - 1);

    }
}