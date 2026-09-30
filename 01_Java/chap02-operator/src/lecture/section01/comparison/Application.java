package lecture.section01.comparison;

public class Application   {

    public static void main(String[] args) {

        /*
        * 비교 연산하
        *
        * - 두 값을 비교해서 boolean 값을 변환한다.
        * == : 같냐? / != : 다른가? / <: 작은가? >: 큰가?
        *
        * */

        int num1 = 10;
        int num2 = 20;

        System.out.println("num1 = num2: " + (num1 == num2));

        // num1이 num2와 다른가?
        System.out.println("num1 != num2: " + (num1 != num2));

        // num1이 num2와 큰가?
        System.out.println("num1 > num2: " + (num1 > num2));

        // num1이 num2와 작은가?
        System.out.println("num1 < num2: " + (num1 < num2));


    }
}
