import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Z on 18/05/2017.
 */
public class Arrays1D {
    //How many times you need to add one to obtain all numbers above given value
    public void addingOne() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lenght of array? ");
        int arrayLenght = scanner.nextInt();
        System.out.println("What is min value you want to reach? ");
        int minValue = scanner.nextInt();
        int[] array = new int[arrayLenght];
        for (int j = 0; j < arrayLenght; j++) {
            System.out.println("Give the number to array: ");
            array[j] = scanner.nextInt();
        }
        int min = array[0];
        for (int j = 0; j < arrayLenght; j++) {
            if (array[j] < min)
                min = array[j];
        }
        int count = 0;
        while (min < minValue) {
            min++;
            count++;
        }
        System.out.println(count);
    }

    //Will show which number was the most frequent in the array
    public void frequentNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Give me number");
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        int count = 0;
        int countMax = 0;
        int number = array[0];
        for (int i = 1; i < length; i++) {
            if (array[i] == array[i - 1]) {
                count++;
                if (count > countMax) {
                    countMax = count;
                    number = array[i];
                }
            } else
                count = 0;
        }
        System.out.println(number);
    }

    //If there is 0 in array it will erase value before , and at the end will give sum of all numbers
    public void removeIfZero() {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] == 0 && i > 0)
                array[i - 1] = 0;
        }

        int sum = 0;
        for (int i = 0; i < length; i++)
            sum += array[i];

        System.out.println(sum);

    }

    //If min valueof the array is in the array odd number of times, than print Lucky
    public void oddOrEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lenght of array");
        int arrayLenght = scanner.nextInt();
        int[] array = new int[arrayLenght];
        System.out.println("Give the number");
        array[0] = scanner.nextInt();
        int min = array[0];
        int count = 1;
        for (int j = 1; j < arrayLenght; j++) {
            array[j] = scanner.nextInt();
            if (array[j] < min) {
                min = array[j];
                count = 1;
            } else if (min == array[j])
                count++;
        }
        if (count % 2 == 0)
            System.out.println("Unlucky");
        else
            System.out.println("Lucky");
    }
//It construct 3th array, and put sum of int of two other arrays
    public void sumOfTwoArrays(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size of array");
        int length = scanner.nextInt();
        int[] A = new int[length];
        int[] B = new int[length];
        int[] C = new int[length];
        for(int i = 0; i < length; i++)
            A[i] = scanner.nextInt();
        for(int i = 0; i < length; i++)
            B[i] = scanner.nextInt();
        for(int i = 0; i < length; i++) {
            C[i] = A[i] + B[i];
            System.out.print(C[i] + " ");
        }
    }
//After giving string it checks if it reads this same from the front as from the reverse
    public void palindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string");
        String word = scanner.next();
        Boolean test = false;

        for(int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(word.length() - 1 - i))
                test = true;
        }

        if(test && word.length() % 2 == 0)
            System.out.println("YES" + " EVEN");
        else if(test && word.length() % 2 == 1)
            System.out.println("YES" + " ODD");
        else
            System.out.println("NO");
    }
//Count vovels if they are next to each other and give the biggest number when they were together
    public void longVovels(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string");
        String word = scanner.next();
        char[] vovels ={'a', 'e', 'i', 'o','u'};
        int count = 0;
        int maxCount = 0;
        boolean test = true;
        for(int i = 0; i < word.length(); i++) {
            test = false;
            for (int j = 0; j < vovels.length; j++) {
                if (word.charAt(i) == vovels[j]) {
                    test = true;
                }
            }
            if(test) {
                count++;
                if (count >= maxCount)
                    maxCount = count;
            }
            else
                count = 0;
        }
        System.out.println(maxCount);


    }


    public void rotationInArray(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("how big array?");
        int arrayLenght = scanner.nextInt();
        System.out.println("how many rotations?");
        int numberOfRotations = scanner.nextInt();
        int[] array = new int[arrayLenght];
        for(int j = 0; j < arrayLenght; j++)
            array[j] = scanner.nextInt();

        while(numberOfRotations > 0){
            int temp = array[arrayLenght-1];
            for(int j = arrayLenght - 1; j > 0; j--)
                array[j] = array[j - 1];
            array[0] = temp;
            numberOfRotations--;
        }
        for(int j = 0; j < arrayLenght; j++)
            System.out.print(array[j] + " ");

    }

    public void swap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("how big array?");
        int arrayLenght = scanner.nextInt();
        int[] array = new int[arrayLenght];
        for(int j = 0; j < arrayLenght; j++)
            array[j] = scanner.nextInt();
        System.out.println("how many rotations?");
        int numberOfRotations = scanner.nextInt();
        int temp = 0;
        while(numberOfRotations > 0){
            System.out.println("first number to swap?");
            int one = scanner.nextInt();
            System.out.println("second number to swap?");
            int two = scanner.nextInt();
            temp = array[one + 1]
            array [one -1] = array[arrayLenght - 1 - i]
                if(array[i] == one) {
                    temp = i;
                    array[i] = array[arrayLenght - 1 - i];
                    array[arrayLenght - 1 - i] = temp;
                    break;
                }


            numberOfRotations--;
        }
        for(int i = 0; i < arrayLenght; i++)
            System.out.print(array[i] +" ");
    }

}
