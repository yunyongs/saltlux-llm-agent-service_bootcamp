package lecture.section02.package_and_import;

import lecture.section01.method.Calculator
/*
* 패키지
* - 서로 관련있는 클래스 등을 모아 하나의 그룹으로 구성하는 것을 의
* */


public class Application1 {

    public static void main(String[] args) {

        //스태틱 메서드라 바로 사용 가능
        int result = lecture.section01.method.Calculator.sum(10,10);
        System.out.println("result = " + result);

        lecture.section01.method.Calculator calculator = new lecture.section01.method.Calculator();
        int result2 = calculator.minus(10, 5);
        System.out.println("result2 = " + result2);
    }


}
