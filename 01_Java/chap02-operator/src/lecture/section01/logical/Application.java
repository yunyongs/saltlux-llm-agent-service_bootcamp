package lecture.section01.logical;

public class Application {

    public static void main(String[] args) {


        /*
         * 논리 연산자
         * -> 논리값을 다루는 연산자 (true or false)
         *
         *
         * && : 두 조건이 모두 true일 때만 true 리턴 (and operator)
         *
         * || : 두 조건 중 하나라도 참이면 참 (or operator)
         *
         * ! : Negate the boolean value (Invert the boolean value)
         * */

        System.out.println("logical operation for true and true: " + (true && true));
        System.out.println("logical operation for true and false: " + (true && false));

        System.out.println("logical operation for true and true: " + (true || true));
        System.out.println("logical operation for true and false: " + (true || false));


        System.out.println("===============================================");

        // 성인이면서 티켓이 있는가?
        // 평균 80점 이상, 출석률이 90% 이상이고 징계 이력이 없어야 장학금 대상이다.
        // 아래의 조건의 학생은 장학금 대상인가?
        int averageScore = 88;
        int attendanceRate = 95;
        boolean hasRecord = false;

        boolean result2;

        result2 = (averageScore >= 80) && (attendanceRate >=90) && !hasRecord;
        System.out.println("result2 = " + result2);
    }
}
