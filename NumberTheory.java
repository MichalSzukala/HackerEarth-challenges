import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
//Help Oz: https://www.hackerearth.com/practice/math/number-theory/basic-number-theory-1/practice-problems/algorithm/a-simple-task/
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
//Calculate the Power: https://www.hackerearth.com/practice/math/number-theory/basic-number-theory-1/practice-problems/algorithm/calculate-the-power/
    public void bigPower(){
        Scanner scanner = new Scanner(System.in);
        double base = scanner.nextInt();
        int power = scanner.nextInt();
        double result = 1;

        while(power > 0){
            if(power % 2 == 1)
                result = (result * base);
            base = (base * base);
            power = power / 2;
        }
        System.out.println(result);
    }

//Greatest Common Divisor
    public int GCD(int number1, int number2){
        if(number2 == 0)
            return number1;

        return GCD(number2, number1%number2);
    }


}
