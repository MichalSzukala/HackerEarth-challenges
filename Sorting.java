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
    //Will show which number was the most frequent in the array
    public void frequentNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Give me number");
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        int count = 0;
        int countMax = 0;
        int number = array[0];
        for (int i = 1; i < length; i++) {
            if (array[i] == array[i - 1]) {
                count++;
                if (count > countMax) {
                    countMax = count;
                    number = array[i];
                }
            } else
                count = 0;
        }
        System.out.println(number);
    }
}
