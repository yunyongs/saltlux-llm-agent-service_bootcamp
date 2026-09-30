package lecture.section01.logical;

public class Application2 {

    public static void main(String[] args) {
        
        // && || 의 우선순위
        
        boolean result1 = true || false && false;
        System.out.println("result1 = " + result1);

        boolean result2 = (true || false) && false;
        System.out.println("result2 = " + result2);

        //아래의 alpha 변수에 담긴 값이 알파벳인지 판별하는 코드를 작성하세요
        System.out.println("\n=========== quiz ============");
        char alpha = 'f';

        boolean answer; //결과값이 알파벳이면 true 아니면 false가 나와야 합니다.
        boolean answer2;

        answer = (alpha >= 'A' && alpha <= 'Z') || (alpha >= 'a' && alpha <= 'z');
        System.out.println("answer = " + answer);

        answer2 = Character.isUpperCase(alpha) || Character.isLowerCase(alpha);
        System.out.println("answer2 = " + answer2);
    }
}
