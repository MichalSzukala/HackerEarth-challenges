import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Z on 20/06/2017.
 */
//The Football Fest: https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/the-football-fest-6/
public class Stacks {

    public void ballPasses(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many cases");
        int cases = scanner.nextInt();
        int whoHasBall = 0;
        char typeOfPass = 'P';  //P - pass, B - ball back
        int howManyBackPasses = 1;

        while(cases > 0){
            Stack<Integer> stack = new Stack<Integer>();
            System.out.println("how many pases");
            int passes = scanner.nextInt();
            whoHasBall = scanner.nextInt();
            stack.push(whoHasBall);
            typeOfPass = 'P';
            howManyBackPasses = 1;

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
            }
            System.out.println(stack.peek());
            stack.clear();
            cases--;

            System.out.println("---------------------------");
        }
    }
//Monk and Philosopher's Stone: https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/monk-and-philosophers-stone/
    public void harryGoldCoin(){
        Scanner scanner = new Scanner(System.in);
        int coins = scanner.nextInt();
        int[] harryArray = new int[coins];
        Stack<Integer> monkStack = new Stack<Integer>();
        for(int i = 0; i < coins; i++)
            harryArray[i] = scanner.nextInt();
        int numberOftasks = scanner.nextInt();
        int value = scanner.nextInt();
        String task = null;
        int k = 0;
        int monkStackValue = 0;

        for(int i = 0; i < numberOftasks; i++){
            task = scanner.next();
            if(task.equals("Harry")){
                monkStack.push(harryArray[k]);
                monkStackValue += harryArray[k];
                k++;
                if(monkStackValue == value){
                    int numberOfCoins = 0;
                    while(!monkStack.empty()) {
                        numberOfCoins++;
                        monkStack.pop();
                    }

                    System.out.println(numberOfCoins);
                    return;
                }
            }
            else if(task.equals("Remove")){
                monkStackValue -= monkStack.pop();
            }
        }
        System.out.println("-1");



    }
//Little Monk and Balanced Parentheses: https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/little-monk-and-balanced-parentheses/
    public void balance(){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++)
            array[i] = scanner.nextInt();

        Stack<Integer> stack = new Stack<Integer>();
        int lastValue = 0;
        int counter = 0;

        for(int i = 0; i < size; i++){
            if(!stack.empty()) {
                lastValue = stack.peek();
            }
            stack.push(array[i]);
            if(stack.peek() + lastValue == 0 && lastValue > 0){
                counter++;
                stack.pop();
                stack.pop();
            }
        }
        System.out.println(counter * 2);
    }
}
