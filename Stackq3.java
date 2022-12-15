import java.util.ArrayList;
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.print("Enter the number  ");

        String a = sc.nextLine();
        String[] result = a.split("");
        int x = 0;
        int y = 0;

        for (int i = 0; i < result.length; i++) {
            int m = Integer.parseInt(result[i]);
            if ((m == 8) || (m == 1) || (m == 0)) {
                arr.add(m);
                if ((m == 6)) {
                    x = x + 1;
                } else if ((m == 9)) {
                    y = y + 1;
                }
            }

            else {
                System.out.print("The number " + a + " is not strogrammetic number");
                return;
            }

        }

        if (x == y) {
            System.out.print("The number " + a + " is strogrammetic number");
        } else {
            System.out.print("The number " + a + " is not strogrammetic number");
        }

    }
}