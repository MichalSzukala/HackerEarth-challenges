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
//Will change uppercase to lowercase at given index
//    public void charToUpper(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Give a string");
//        String word = scanner.nextLine();
//        StringBuilder word1 = new StringBuilder(word);
//        System.out.println("index of letter you want to change");
//        int location1 = scanner.nextInt();
//        System.out.println("index of letter you want to change");
//        int location2 = scanner.nextInt();
//        char one = word1.charAt(location1);
//        if(Character.isUpperCase(one))
//            one = Character.toLowerCase(one);
//        else
//            one = Character.toUpperCase(one);
//        word1.replace(location1, location1+1, String.valueOf(one));
//        char two = word1.charAt(location2);
//        if(Character.isUpperCase(two))
//            two = Character.toLowerCase(two);
//        else
//            two = Character.toUpperCase(two);
//        word1.replace(location2, location2+1, String.valueOf(two));
//        System.out.println(word1);
//    }
//Will change uppercase to lowercase at given index
    public void charToUpper() {
        Scanner ob = new Scanner(System.in);
        System.out.println("Give a string");
        String s = ob.nextLine();
        System.out.println("index of letter you want to change");
        int n1 = ob.nextInt();
        System.out.println("index of letter you want to change");
        int n2 = ob.nextInt();
        n1--;
        n2--;
        char ch[] = s.toCharArray();
        if (Character.isLowerCase(ch[n1]))
            ch[n1] -= 32;
        else if (Character.isUpperCase(ch[n1]))
            ch[n1] += 32;
        if (Character.isLowerCase(ch[n2]))
            ch[n2] -= 32;
        else if (Character.isUpperCase(ch[n2]))
            ch[n2] += 32;
        String st = new String(ch);
        System.out.println(st);
    }
//After giving a full name it will print initials
    public void printInitials(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string");
        StringBuilder word = new StringBuilder(scanner.nextLine());
        int upperCaseIndex = 0;
        for(int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))){
                upperCaseIndex= i;
        }
            if(Character.isWhitespace(word.charAt(i))) {
                word.replace(upperCaseIndex + 1, i, ".");
                i = upperCaseIndex + 2;
            }
        }
        System.out.print(word);

    }

}

