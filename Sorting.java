import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
    }
//The rise of the weird... things [1]: https://www.hackerearth.com/practice/algorithms/sorting/insertion-sort/practice-problems/algorithm/the-rise-of-the-weird-things-1/
    public void theRise() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("size of array");
        int size = scanner.nextInt();
        int[] a = new int[size];
        int[] b = new int[size + 2];
        for (int i = 0; i < size; i++)
            a[i] = scanner.nextInt();

        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < size; i++) {
            if(a[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }
        int min = 0;
        int temp = 0;
        int minIndex = 0;

        for (int i = 0; i < size; i++) {
            min = a[i];
            minIndex = i;

            for (int j = i + 1; j < size; j++) {
                if (a[j] < min) {
                    min = a[j];
                    minIndex = j;
                }
            }
            temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
        int sumEven = 0;
        int sumOdd = 0;
        int o = 0;
        int e = 1;
        for (int i = 0; i < size; i++) {
            if (a[i] % 2 == 0) {
                b[o] = a[i];
                sumEven += a[i];
                o++;
            }
            else{
                    b[e + evenCount] = a[i];
                    sumOdd += a[i];
                    e++;
            }

        }
        b[evenCount] = sumEven;
        b[size + 1] = sumOdd;
       for(int i = 0; i < size + 2; i++)
           System.out.print(b[i] + " ");
    }

    public void splitingInFour() {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while (cases > 0) {
            //System.out.println("give a string");
            String word = scanner.next();
            String word1 ="";
            Set<String> set = new HashSet<String>();
            int count = 0;
            for(int i = 0; i < word.length(); i++) {
                word1 = word1 + word.charAt(i);
                if (set.add(word1)) {
                    word1 = "";
                    count++;
                }
            }
            for(String x : set)
                System.out.println(x);
            if(count >= 4)
                System.out.println("YES");
            else
                System.out.println("NO");
            cases--;
        }
    }

    public void ants(){
        Scanner scanner = new Scanner(System.in);
        int n1, n2, n3;
        int max, min;
        int cases = scanner.nextInt();

            n1 = scanner.nextInt();
            n2 = scanner.nextInt();
            n3 = scanner.nextInt();
            min = n1;
            max = n1 + n3;
        for(int i = 0; i < cases - 1; i++){
            n1 = scanner.nextInt();
            n2 = scanner.nextInt();
            n3 = scanner.nextInt();
            if(n1 < min)
                min = n1;
            if(n1 + n3 > max)
                max = n1 + n3;

        }


        System.out.println(max - min + 1);
    }
}
