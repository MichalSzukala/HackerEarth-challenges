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



}
