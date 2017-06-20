import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Z on 20/06/2017.
 */
public class Stacks {

    public void ballPasses(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many cases");
        int cases = scanner.nextInt();
        System.out.println("how many pases");
        int passes = scanner.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        int whoHasBall = 0;
        char typeOfPass = 'P';  //P - pass, B - ball back
        int howManyBackPasses = 1;



        while(cases > 0){
            whoHasBall = scanner.nextInt();
            stack.push(whoHasBall);
            for(int i = 0; i < passes; i++) {
                System.out.println("what kind of pass?");
                typeOfPass = scanner.next().charAt(0);
                if(typeOfPass == 'P') {
                    System.out.println("who have the ball?");
                    whoHasBall = scanner.nextInt();
                    stack.push(whoHasBall);
                    howManyBackPasses = 1;
                }
                if(howManyBackPasses == 2){
                    stack.push(whoHasBall);
                    howManyBackPasses = 1;
                }
                else if(typeOfPass =='B') {
                    stack.pop();
                    howManyBackPasses++;
                }
                System.out.println(stack);
                System.out.println(stack.peek());
            }
            System.out.println(stack.peek());
            cases--;
        }
    }
}
