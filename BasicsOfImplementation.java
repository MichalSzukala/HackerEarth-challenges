/**
 * Created by Z on 14/05/2017.
 */
import java.util.Scanner;

public class BasicsOfImplementation {


    public void checkArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Length of array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++)
            array[i] = scanner.nextInt();

        int max = array[0];
        int min = array[0];
        for(int i = 1; i < length; i++) {
            if(array[i] > max)
                max = array[i];
            if(array[i] < min)
                min = array[i];
        }
        Boolean contain, output = true;
        for(int i = min+1; i < max; i++) {
            contain = false;
            for (int j = 0; j < length; j++) {
                if (array[j] == i)
                    contain = true;
            }
            if(!contain)
                output = false;
        }

        if(output)
            System.out.println("YES");
        else
            System.out.println("NO");

    }

    public void sixConsecutiveNumbers(){
        Boolean oneTest = true;
        int zeroCount = 0, oneCount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me binary number");
        String number = scanner.next();

        for(int i = 0; i < number.length(); i++) {
            oneTest = true;
            char singleDigit = number.charAt(i);
            if(singleDigit == '0') {
                zeroCount++;
                oneTest = false;
            }
            else {
                oneCount++;
            }

            if(!oneTest)
                oneCount = 0;
            else
                zeroCount = 0;
            if(oneCount > 5 || zeroCount > 5) {
                System.out.println("Sorry, sorry!");
                return;
            }

        }
        System.out.println("Good luck!");
    }
}
