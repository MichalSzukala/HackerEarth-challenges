import java.util.ArrayList;
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
//In the String, if letter was already in the string than don't print it
    public void removeDuplicates(){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        char[] wordArray = word.toCharArray();
//        ArrayList<Character> arrayList = new ArrayList<>();
//
//        for(int i = 0; i < wordArray.length; i++) {
//            if (arrayList.contains(wordArray[i]))
//                continue;
//            arrayList.add(wordArray[i]);
//        }
//
//        for(int i = 0; i < arrayList.size(); i++)
//            System.out.print(arrayList.get(i));

        for(int i = wordArray.length - 1; i > 0 ; i--){
            for(int j = 0; j < wordArray.length - 1 - j; j++) {
                if (wordArray[i] == wordArray[j])
                    continue;
                System.out.println(wordArray[i]);
            }
        }

    }
//Check if the word has its revers in the list of words, than print the lenght and middle letter
    public void findReverseWord(){
        Scanner scanner = new Scanner(System.in);
        int numberOfWords = scanner.nextInt();
        ArrayList<String> array = new ArrayList<String>();
        for(int i = 0; i < numberOfWords; i++)
            array.add(scanner.next());

        for(int i = 0; i < array.size(); i++){
            StringBuilder string = new StringBuilder(array.get(i));
            string = string.reverse();
            String stringRevers = new String(string);
            for(int j = 0; j < array.size(); j++)
                if (array.get(j).contains(stringRevers))
                    System.out.print(string.length() + " " + string.charAt(string.length() / 2) + "\n");
        }
    }


}

