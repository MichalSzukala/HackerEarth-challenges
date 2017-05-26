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

//    public void splitingInFour() {
//        Scanner scanner = new Scanner(System.in);
//        int cases = scanner.nextInt();
//        while (cases > 0) {
//            //System.out.println("give a string");
//            String word = scanner.next();
//            char[] array = word.toCharArray();
//            int firstIndex = 0;
//            for(int i = 0; i < word.length(); i++){
//                if(array[i] == array[i + 1])
//            }
//            cases--;
//        }
//    }
//Print string in reverse order
    public void stringBackword(){
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        while (cases > 0) {
            String word = scanner.next();
            for(int i = word.length() - 1; i >= 0; i--)
                System.out.print(word.charAt(i));
            cases--;
        }
    }
// change the first letters after white space in the sentence
    public void changeToBigLetter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("give a string");
        String word = scanner.nextLine();
        String newWord = "" + Character.toUpperCase(word.charAt(0));
        for(int i = 1; i < word.length(); i++){
            char letter = word.charAt(i);
            char letterBefore = word.charAt(i-1);
            Boolean test = Character.isLowerCase(letter);
            if(test && Character.isWhitespace(letterBefore))
                newWord +=  Character.toUpperCase(letter);
            else
                newWord += letter;
        }
        System.out.println(newWord);
    }

}

