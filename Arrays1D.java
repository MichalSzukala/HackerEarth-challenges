import java.util.Scanner;

/**
 * Created by Z on 18/05/2017.
 */
public class Arrays1D {
//How many times you need to add one to obtain all numbers above given value
    void addingOne() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lenght of array? ");
        int arrayLenght = scanner.nextInt();
        System.out.println("What is min value you want to reach? ");
        int minValue = scanner.nextInt();
        int[] array = new int[arrayLenght];
        for(int j = 0; j < arrayLenght; j++) {
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



}
