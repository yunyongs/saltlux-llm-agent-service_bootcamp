package lecture.section01.logical;

public class Application4 {
    public static void main(String[] args) {
        /*
        * 삼항연산자
        * [조건식] ? [true일 때 사용할 값]: [false일때 사용할 값]
        * */
        
        int num = 0;
        boolean result = num > 0;
        
        // num 이 0보다 크면 양수다라고 콘솔에 출력하고
        // 0 또는 0 보다 작으면 음수다라고 콘솔에 출력
        String result2 = num > 0 ? "양수다": "음수다";
        System.out.println("result2 = " + result2);
        
        
        
        // 단 3항 연산자를 중첩으로 쓰는 것은 권장되지 않는다. 
        String result3 = num > 0 ? "양수다": (num == 0 ? "0이다" : "음수다");
        System.out.println("result3 = " + result3);
        
        
        
        /*
        * 점수에 따라 A,B,C 학점을 결정한다. 
        * A 90점 이상
        * B 80점 이상, 
        * C 나머지 모두
        * 삼항연산자로 만들어 보세요
        * 
        * */
        
        int score = 80;
        String resultGPA = score >= 90 ? "A학점" : (score >=80 ? "B학점" : "C학점");
        System.out.println("\nresultGPA = " + resultGPA);
    }
}
