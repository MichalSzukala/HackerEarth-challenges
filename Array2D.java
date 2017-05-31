import java.util.Scanner;

/**
 * Created by Z on 30/05/2017.
 */
public class Array2D {
//Add even and odd elements separately
    public void sumOfElements(){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sumOdd = 0;
        int sumEven = 0;
        int[][] array = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                array[i][j] = scanner.nextInt();
                if(count % 2 == 0)
                    sumEven += array[i][j];
                else
                    sumOdd += array[i][j];
                count++;
            }

        }
        System.out.println(sumEven);
        System.out.println(sumOdd);
    }

    public void binaryPattern(){
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        while(cases > 0) {
            int size = scanner.nextInt();
            int[][] array = new int[size][size];
            for(int i = 0; i < size; i++) {
                String number = scanner.next();
                char[] digits = number.toCharArray();
                for (int j = 0; j < size; j++) {

                    //for(int k = 0; k < digits.length; k++) {


                    array[i][j] = Character.getNumericValue(digits[j]);
                    // System.out.println(array[i][j]);
                    //}
                }
            }
            loop:
            for(int i = 0; i < size / 2; i++)
                for (int j = 0; j < size/ 2; j++)
                    if(array[i][j] != array [i][size - 1 - j] || array[i][j] != array [size - 1 - i][j]){
                        System.out.println("NO");
                        break loop;
                    }
            System.out.println("YES");
            cases--;
        }
    }

}
