import java.util.Scanner;

/**
 * Created by Z on 12/05/2017.
 */
public class InputOutput {


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


    public static void main(String[] args){
        InputOutput start = new InputOutput();
        start.toggleString();

    }
}
