import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.task2(new int[10]);
        main.task2(new int[7]);
        main.task3();


    }


    public void task2(int[] intArray) {
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Devide by zero: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of range: " + e);
        }

    }

    public void task3() {

        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (ArithmeticException e) {
            System.out.println("Devide by zero: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of range: " + e);
        }

    }


    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}

