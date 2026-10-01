package lecture.section01.method;
import java.util.Scanner;

public class Application5 {


    public static void main(String[] args) {
        Application5 app4 = new Application5();
        System.out.println("첫번째 정수: ");
        Scanner scX = new Scanner(System.in);
        int x = scX.nextInt();
        System.out.println("두번째 정수: ");
        Scanner scY = new Scanner(System.in);
        int y = scY.nextInt();
        

    System.out.println("sum = " + app4.add(x, y));
    System.out.println("sub = " + app4.subtract(x, y));
    System.out.println("mul = " + app4.multiply(x, y));
    System.out.println("div = " + (float) app4.divide(x, y));



    }


    // 두 수를 받아 더하는 메소드
    // 두 수를 받아 빼는 메소드
    // 두 수를 받아 곱하는 메소드
    // 두 수를 받아 나누는(몫) 메소드, 실수 형태
    public int add (int x, int y) {

        return x+y;
    }
    public int subtract (int x, int y) {

        return x-y;
    }
    public int multiply (int x, int y) {

        return x*y;
    }
    public int divide (int x, int y) {
        if (y != 0) {
            return  x / y;
        } else {
            return 0;
        }

    }
}
