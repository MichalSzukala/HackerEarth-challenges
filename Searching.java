import java.util.Scanner;

/**
 * Created by Z on 01/06/2017.
 */
public class Searching {
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
