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



}
