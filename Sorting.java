import java.util.Scanner;

/**
 * Created by Z on 02/06/2017.
 */
public class Sorting {

    //Save Patients: https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/save-patients/
    public void bubbleSort(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("size of array");
        int size = scanner.nextInt();
        int[] a = new int[size];
        int[] b = new int[size];
        for (int i = 0; i < size; i++)
            a[i] = scanner.nextInt();
        for (int i = 0; i < size; i++)
            b[i] = scanner.nextInt();
        int temp = 0;
        for (int j = 0; j < size - 1; j++) {
            for (int i = 0; i < size - 1 - j; i++) {
                if (a[i] > a[i + 1]) {
                    temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                }
                if (b[i] > b[i + 1]) {
                    temp = b[i + 1];
                    b[i + 1] = b[i];
                    b[i] = temp;
                }
            }
        }
        for (int i = 0; i < size; i++)
            System.out.print(a[i] + " ");
        System.out.print("\n");
        for (int i = 0; i < size; i++)
            System.out.print(b[i] + " ");
        System.out.println("\n");
        boolean test = true;
        for (int i = 0; i < size; i++)
            if(a[i] < b[i])
                test = false;
        if(test)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
