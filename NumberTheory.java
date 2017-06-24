import java.util.Scanner;

/**
 * Created by Z on 24/06/2017.
 */
public class NumberTheory {

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
}
