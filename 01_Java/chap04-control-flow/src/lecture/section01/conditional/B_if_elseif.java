package lecture.section01.conditional;

import java.util.Scanner;

public class B_if_elseif {

    /*
    * if-elseif문 작성법
    *
    * if (조건식) {
    *   [조건식이 true일 때 동작할 코드]
    * } else if (조건식 #2){
    *   [조건식 #2이 true일때 동작할 코드]
    * } else {
    *   [전부다 false일 경우 동작할 코드]
    * }
    * */

    public void testSimpleIF() {

        /*
        * 전달된 정수가 짝수면 "짝수입니다."
        * 아니면 "홀수입니다"
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num = sc.nextInt();

        if (num == 0){
            System.out.println("0입니다. ");
        } else if (num % 2 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }
        System.out.println("홀짝 판별 완료");

    }
}
