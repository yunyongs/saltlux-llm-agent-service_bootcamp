package lecture.section01.logical;

public class Application3 {

    public static void main(String[] args) {

        /*
        * 단락 평가
        * && 와 ||에서 앞의 조건만으로 전체 결과과 결정되면 뒤의 조건을 실행하지 않는 규칙
        *
        *
        */

        int num = 10;
        int zero = 0;

//        int result = num / zero;
//        System.out.println("result = " + result);

        // 앞의 조건이 false가 되므로 and 연산으로 비교할 뒤의 조건을 실행하지 않는다.
//        boolean result = ((num / zero) > 2) && zero != 0; // division by zero exception
        boolean result = zero != 0 && ((num / zero) > 2); // 단락 평가 - 앞의 조건에서 false 판정됨
        System.out.println("result = " + result);


        int count = 10;
        boolean result2 = true || (++count > 0); //조건식 안에서 변수의 값을 바꾸는 것은 매우 안 좋은 코드이다.
        System.out.println("count = " + count);
        System.out.println("result2 = " + result2);
    }
}
