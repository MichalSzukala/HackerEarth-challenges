import java.util.Scanner;

/**
 * Created by Z on 25/05/2017.
 */
public class stringManipulation {
//Counting vowels in the word
    public void findVovels() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("give a string");
        String word = scanner.next();
        int count = 0;
        for (int i = 0; i < word.length(); i++)
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u'|| word.charAt(i) == 'y')
                count++;
        System.out.println(count);

    }

    public void splitingInFour() {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        while (cases > 0) {
            //System.out.println("give a string");
            String word = scanner.next();
            char[] array = word.toCharArray();
            int firstIndex = 0;
            for(int i = 0; i < word.length(); i++){
                if(array[i] == array[i + 1])
            }
            cases--;
        }
    }

}

