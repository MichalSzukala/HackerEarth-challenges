import java.util.Arrays;
import java.util.Scanner;

public class BasicsOfImplementation {

    //Given an array of integers . Check if all the numbers between minimum and maximum exist
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
    //Input is binary number, if it has 6 zeros, or 6 ones in the row it will print "Sorry
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

    //It's checking how many digits is in the string
    public void numbersInString(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a string");
        String input = scanner.next();
        char[] array = input.toCharArray();
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if(i == 0) {
                if (Character.isDigit(array[i]))
                    count++;
            }
            else {
                if (Character.isDigit(array[i]) && Character.isDigit(array[i - 1]) == false)
                    count++;
            }
        }
        System.out.println(count);

    }
    //Compare two string and check if from one string it's possible to build second string
    public void swapStrings(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me string 1");
        String one = scanner.next();
        System.out.println("Give me string 2");
        String two = scanner.next();
        char[] stringOne = one.toCharArray();
        char[] stringTwo = two.toCharArray();
        Arrays.sort(stringOne);
        Arrays.sort(stringTwo);

        if(Arrays.equals(stringOne, stringTwo))
            System.out.println("YES");
        else
            System.out.println("NO");

    }

    public void whiteSpaces(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me string");
        String string = scanner.nextLine();
        int count = 0;
        for(int i = 0; i < string.length(); i++)
            if(string.charAt(i) == ' ')
                count++;
        System.out.println(count);

    }
    //ASCII Value: https://www.hackerearth.com/practice/algorithms/dynamic-programming/state-space-reduction/practice-problems/algorithm/ascii-value/
    public void ascii(){
        Scanner scanner = new Scanner(System.in);
        char character = scanner.next().charAt(0);
        System.out.println((int)character);
    }


    public void greatKhan(){
        Scanner scanner = new Scanner(System.in);
        int lenght = scanner.nextInt();
        int[] array = new int[lenght];

        for(int i = 0; i < lenght; i++)
            array[i] = scanner.nextInt();

        int number = 0;
        for(int i = 0; i < 3; i++) {
            //int result = number;
            int sum = 0;
            for (int j = 0; j < lenght; j += 3 ){
                 sum += array[j + number];
            }
            System.out.print(sum + " ");
            number++;

        }
    }


}







