import java.util.Scanner;

/**
 * Created by Z on 12/05/2017.
 */
public class InputOutput {

// All char in upper case will be in lower case and vice versa
    public void toggleString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a string");
        String s = scanner.next();
        String nowa = "";

        for(int i = 0; i < s.length(); i++){
            char character = s.charAt(i);
            Boolean test = Character.isUpperCase(character);
            if(test) {
                character = Character.toLowerCase(character);
                nowa += character;
            }
            else {
                character = Character.toUpperCase(character);
                nowa += character;
            }
        }
        System.out.println(nowa);
    }

// Will give factors of the number
    public void factorial() {
        System.out.println("Give me a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int factorial = number;

        for (int i = 1; i < number; i++)
            factorial *= (number - i);

        System.out.println(number + "! = " + factorial);

    }
// After giving string it will check if read backwards will be this same string
    public void stringBackward(){
        System.out.println("Give me a string");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        char[] array = word.toCharArray();
        int number = array.length - 1;
        Boolean test = true;
        for(int i = 0; i < array.length; i++){
            if(array[i] != array[number])
                test = false;
            number--;
        }
        if(test)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
// Check if all the numbers before given number are prime numbers, if so print them
    public void primeNumber(){
        System.out.println("Give me a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Boolean test;

        for(int primeNumbers = 2; primeNumbers < number; primeNumbers++) {
            test = true;
            for (int i = 2; i < primeNumbers; i++)
                if (primeNumbers % i == 0)
                    test = false;
            if (test == true)
                System.out.print(primeNumbers + " ");
        }




    }








    public static void main(String[] args){
        BasicsOfImplementation start = new BasicsOfImplementation();
        start.checkArray();







    }
}
