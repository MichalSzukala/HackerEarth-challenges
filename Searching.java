import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Z on 01/06/2017.
 */
public class Searching{
//Rest in peace - 21-1!: https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/rest-in-peace-21-1/
    public void number21(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("give a number");
        String number = scanner.next();
        char[] numberArray = number.toCharArray();
        boolean test = false;
        for(int i = 0; i < numberArray.length-1; i++)
            if ((numberArray[i] == '2' && numberArray[i + 1] == '1') || Integer.parseInt(number) % 21 == 0)
                test = true;
        if(test)
            System.out.println("The streak is broken!");
        else
            System.out.println("The streak lives still in our heart!");
    }




    //counting vowels in the word
    public void searchVowel(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many cases");
        int cases = scanner.nextInt();
        int count = 0;
        for(int i = 0; i < cases; i++) {
            count = 0;
            System.out.println("give a word");
            String word = scanner.next();
            String word1 = word.toUpperCase();
            for(int j = 0; j < word1.length(); j++) {
                if(word1.charAt(j) == 'A' || word1.charAt(j) == 'E' || word1.charAt(j) == 'I' || word1.charAt(j) == 'O' || word1.charAt(j) == 'U')
                    count++;

            }
            System.out.println(count);
        }

    }
//Repeated K Times: https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/repeated-k-times/
    public void smallestRepeted(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many numbers");
        int numbers = scanner.nextInt();
        int[] numberArray = new int[numbers];
        for(int i = 0; i < numbers; i++) {
            System.out.println("Give a number");
            numberArray[i] = scanner.nextInt();
        }
        Arrays.sort(numberArray);
        System.out.println("How many times smalles number should repeat? ");
        int howManyrepeat = scanner.nextInt();
        int howManyrepeat1 = howManyrepeat;
        for(int i = 0; i < numbers-1; i++) {
            if (numberArray[i] == numberArray[i+1]) {
                howManyrepeat1--;
                if(howManyrepeat1 == 1){
                    System.out.println(numberArray[i]);
                    return;
                }
            }
            else
                howManyrepeat1 = howManyrepeat;
        }

    }
//Sherlock and Numbers: https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/sherlock-and-numbers/
    public void sherlock(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many cases");
        int cases = scanner.nextInt();
        boolean test = true;
        while(cases > 0){
            int number = scanner.nextInt();
            int howManyRemove = scanner.nextInt();
            int giveBackNumber = scanner.nextInt();
            for(int i = 0; i < howManyRemove; i++){
                int remove = scanner.nextInt();
                if(giveBackNumber > number - howManyRemove) {
                    System.out.println("-1");
                    test = false;
                    break;
                }
                else if(remove < giveBackNumber)
                    giveBackNumber++;
            }
            if(test)
                System.out.println(giveBackNumber);
            cases--;
        }

    }
//Discover the Monk: https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/discover-the-monk/
    public void binarySearch(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("size of array");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        System.out.println("how many cases");
        int cases = scanner.nextInt();
        for(int i = 0; i < array.length; i++) {
            System.out.println("give a number");
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        while (cases > 0) {
            System.out.println("what number to find");
            int find = scanner.nextInt();
            int low = 0;
            int high = arraySize-1;
            boolean test = false;
            while(low <= high){
                int mid = (low + high)/2;
                if(array[mid] < find)
                    low = mid + 1;
                else if(array[mid] > find)
                    high = mid - 1;
                else {
                    System.out.println("YES");
                    test = true;
                    break;
                }
            }
            if(!test)
                System.out.println("NO");
            cases--;
        }

    }

//Monk's Encounter with Polynomial: https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/monks-encounter-with-polynomial/
    public void polynominal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many cases");
        int cases = scanner.nextInt();
        System.out.println("Equation is A*x^2 + B*x + C >= K");

        while(cases > 0) {
            System.out.println("Give A");
            int a = scanner.nextInt();
            System.out.println("give B");
            int b = scanner.nextInt();
            System.out.println("give C");
            int c = scanner.nextInt();
            System.out.println("give K");
            int k = scanner.nextInt();
            int x = 0;

            while ((a * x * x) + (b * x) + c < k) {
                int d = (a * x * x) + (b * x) + c;
                x++;
            }
            System.out.println(x);
            cases--;
        }
    }

    //Bishu and Soldiers: https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/bishu-and-soldiers/
    public void bishu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How big array");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for(int i = 0; i < arraySize; i++)
            array[i] = scanner.nextInt();
        System.out.println("How many cases");
        int cases = scanner.nextInt();
        Arrays.sort(array);

        while(cases > 0){
            System.out.println("the number");
            int number = scanner.nextInt();
            int sum = 0;
            int howMany = 0;
            for(int i = 0; i < arraySize; i++) {
                if (array[i] <= number) {
                    sum += array[i];
                    howMany++;
                }
                else
                    break;
            }
            System.out.print(howMany + " " + sum);
            cases--;
        }

    }





}
