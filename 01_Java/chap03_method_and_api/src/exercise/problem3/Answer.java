package lecture.section01.method;
import java.util.Scanner;

public class Answer {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 정수: ");
        int x = sc.nextInt();
        System.out.print("두번째 정수: ");
        int y = sc.nextInt();

        //메서드가 non-static이므로 객체 생성 후 메서드 호출
        Answer as = new Answer();

        System.out.println("덧셈 결과 : " + as.add(x, y));
        System.out.println("뺄셈 결과 : " + as.subtract(x, y));
        System.out.println("곱셈 결과 : " + as.multiply(x, y));
        try {
            System.out.println("나눗셈 결과 : " + as.divide(x, y));
        } catch (ArithmeticException e){
            System.out.println("오류: " + e.getMessage());
        }

    }


    // 두 수를 받아 더하는 메소드
    public int add (int x, int y) {
        return x+y;
    }
    // 두 수를 받아 빼는 메소드
    public int subtract (int x, int y) {
        return x-y;
    }
    // 두 수를 받아 곱하는 메소드
    public int multiply (int x, int y) {
        return x*y;
    }
    // 두 수를 받아 나누는(몫) 메소드, 실수 형태
    public double divide (int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return  (double) x / y;
    }
}
