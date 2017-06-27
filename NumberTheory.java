import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Z on 24/06/2017.
 */
public class NumberTheory {
// Can you Guess: https://www.hackerearth.com/practice/math/number-theory/basic-number-theory-1/practice-problems/algorithm/can-you-guess/
    public void allDivisors(){
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        int sum;

        while(cases > 0){
            sum = 0;
            int number = scanner.nextInt();
            for(int i = 1; i <= number / 2; i++){
                if(number % i == 0)
                    sum += i;
            }
            cases--;
            System.out.println(sum);
        }
    }

    public int factorial(int number){
        if(number == 0)
            return 1;
        else
            return number * factorial(number - 1);
    }

    public void helpOz() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        int[] array1 = new int[size];
        for (int i = 0; i < size; i++)
            array[i] = scanner.nextInt();
        array1 = Arrays.copyOf(array, size);
        Arrays.sort(array1);
        int max = array1[size - 1];
        boolean test;

        for (int i = 2; i <= max; i++) {
            int firstElementMod = array[0] % i;

            test = true;

            for (int j = 1; j < size; j++) {
                if (array[j] % i != firstElementMod) {
                    test = false;
                    break;
                }
            }
            if (test)
                System.out.print(i + " ");
        }
    }




}
