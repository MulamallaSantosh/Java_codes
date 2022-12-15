import java.util.ArrayList;
import java.util.Scanner;

public class Q16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of operations : ");
        int b = input.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int k = 0; k < b; k++) {
            System.out.print("Enter which operation you want to perform");
            System.out.println("\n1 - Push \n2 - Pop \n3 - Size \n4 - empty check\n5 - top element\n6 - exit");
            int a = input.nextInt();

            switch (a) {
                case 1 -> {
                    System.out.print("Enter the number you want to add : ");
                    int c = input.nextInt();
                    arr.add(c);
                    System.out.println("The array is " + arr);
                }

                case 2 -> {
                    // int indexx = arr.size()-1;
                    int arr_sizr = arr.size();
                    if (arr_sizr != 0) {
                        arr.remove(0);
                    }
                    System.out.println("The array is " + arr);
                }

                case 3 -> {
                    int sizee = arr.size();
                    System.out.println("The size of array is " + sizee);
                }

                case 4 -> {
                    int sizee = arr.size();
                    if (sizee == 0) {
                        System.out.println("Array is empty");
                    } else {
                        System.out.println("Array is not empty");
                    }
                }

                case 5 -> {
                    System.out.println("Top element of array is " + arr.get(0));
                }

                case 6 -> {
                    System.out.print(arr);
                    return;
                }

            }
        }
        input.close();
    }
}
