import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Z on 02/06/2017.
 */
public class Sorting {
    String teacher;
    String student;
    int age;

    public Sorting(){

    }

    public Sorting(String teacher, String student, int age){
        this.teacher = teacher;
        this.student = student;
        this.age = age;
    }
//Monk's School: https://www.hackerearth.com/practice/algorithms/sorting/merge-sort/practice-problems/algorithm/monks-school-4/
    public void teachaerStudents(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("number of teachers");
        int numberTeachers = scanner.nextInt();
        System.out.println("number of students");

        int numberStudents = scanner.nextInt();
        String[] teacherArray = new String [numberTeachers];
        Sorting[] studentsArray = new Sorting[numberStudents];
        String teacher, student;
        int age;

        for(int i = 0; i < numberTeachers; i++)
            teacherArray[i] = scanner.next();

        for(int i = 0; i < numberStudents; i++) {
            teacher = scanner.next();
            student = scanner.next();
            age = scanner.nextInt();
            Sorting object = new Sorting(teacher, student, age);
            studentsArray[i] = object;
        }
        Arrays.sort(teacherArray);
        Sorting temp;
        for(int i = 0; i < numberStudents - 1; i++){
            for(int j = 0; j < numberStudents - 1 - i; j++) {
                if(studentsArray[j].student.compareTo(studentsArray[j+1].student) > 0){
                    temp = studentsArray[j];
                    studentsArray[j] = studentsArray[j+1];
                    studentsArray[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < numberTeachers; i++) {
            System.out.println(teacherArray[i]);
            for (int j = 0; j < numberStudents; j++) {
                if(studentsArray[j].teacher.equals(teacherArray[i]))
                    System.out.println(studentsArray[j].student + " " + studentsArray[j].age);
            }
        }
    }
//Puchi and Luggage: https://www.hackerearth.com/practice/algorithms/sorting/merge-sort/practice-problems/algorithm/puchi-and-luggage/
    public void luggage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("number of cases");
        int cases = scanner.nextInt();
        while(cases > 0) {
            System.out.println("number of friends");
            int friends = scanner.nextInt();
            int[] weight = new int[friends];
            for (int i = 0; i < friends; i++)
                weight[i] = scanner.nextInt();


            for (int i = 0; i < friends; i++){
                int count = 0;
                for (int j = i + 1; j < friends; j++){
                    if(weight[j] <weight[i])
                        count++;
                }
                System.out.print(count + " ");
            }
            System.out.println();

            cases--;
        }
    }


    //Save Patients: https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/save-patients/
    public void bubbleSort(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("size of array");
        int size = scanner.nextInt();
        int[] a = new int[size];
        int[] b = new int[size];
        for (int i = 0; i < size; i++)
            a[i] = scanner.nextInt();
        for (int i = 0; i < size; i++)
            b[i] = scanner.nextInt();
        int temp = 0;
        for (int j = 0; j < size - 1; j++) {
            for (int i = 0; i < size - 1 - j; i++) {
                if (a[i] > a[i + 1]) {
                    temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                }
                if (b[i] > b[i + 1]) {
                    temp = b[i + 1];
                    b[i + 1] = b[i];
                    b[i] = temp;
                }
            }
        }
    }
//The rise of the weird... things [1]: https://www.hackerearth.com/practice/algorithms/sorting/insertion-sort/practice-problems/algorithm/the-rise-of-the-weird-things-1/
    public void theRise() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("size of array");
        int size = scanner.nextInt();
        int[] a = new int[size];
        int[] b = new int[size + 2];
        for (int i = 0; i < size; i++)
            a[i] = scanner.nextInt();

        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < size; i++) {
            if(a[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }
        int min = 0;
        int temp = 0;
        int minIndex = 0;

        for (int i = 0; i < size; i++) {
            min = a[i];
            minIndex = i;

            for (int j = i + 1; j < size; j++) {
                if (a[j] < min) {
                    min = a[j];
                    minIndex = j;
                }
            }
            temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
        int sumEven = 0;
        int sumOdd = 0;
        int o = 0;
        int e = 1;
        for (int i = 0; i < size; i++) {
            if (a[i] % 2 == 0) {
                b[o] = a[i];
                sumEven += a[i];
                o++;
            }
            else{
                    b[e + evenCount] = a[i];
                    sumOdd += a[i];
                    e++;
            }

        }
        b[evenCount] = sumEven;
        b[size + 1] = sumOdd;
       for(int i = 0; i < size + 2; i++)
           System.out.print(b[i] + " ");
    }


}
