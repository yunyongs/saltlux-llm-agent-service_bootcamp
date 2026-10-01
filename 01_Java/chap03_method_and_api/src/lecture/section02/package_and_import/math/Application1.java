package lecture.section02.package_and_import.math;

public class Application1 {

    /*
    * Math class >> 수학에서 자주 사용하는 상수, 함수들을 미리 구현해 놓은 클래스
    * */
    public static void main(String[] args) {

        System.out.println("-7의 절대값: "+ Math.abs(-7));

        System.out.println(Math.min(10, 20));
        System.out.println(Math.max(10, 20));

        //상수 - 변하지 않는 변수
        System.out.println("원주율: " + Math.PI);

        //랜덤한 수 (난수)
        //실수 형태 난수를 발생시킨다.
        System.out.println("난수: " + Math.random());

        // 1~10까지 난수
        int random = (int) (Math.random() * 10)+1 ; //+1은 0이 첫자리에 나오는 것을 방지하고 9가 나온 경우 10으로
        System.out.println("random = " + random);



    }

}
