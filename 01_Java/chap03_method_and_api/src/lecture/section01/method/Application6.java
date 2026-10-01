package lecture.section01.method;
import java.util.Scanner;

public class Application6 {


    public static void main(String[] args) {
        Application6 app6 = new Application6();


         System.out.println(sum(5, 6)); //static 매소드의 경우, 객체를 생성하지 않고 메소드 자체를 사용할 수 있다.
         System.out.println(Application6.sum(5, 6)); //static 매소드의 경우, 객체를 생성하지 않고 메소드 자체를 사용할 수 있다.





    }


    public static int sum(int x, int y) {
        return x + y;

    }
    public int subtract(int x, int y) {
        return x - y;

    }

}
