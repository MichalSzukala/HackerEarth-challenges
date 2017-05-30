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

}
