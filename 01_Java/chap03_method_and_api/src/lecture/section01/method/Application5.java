package lecture.section01.method;

public class Application4 {

    /*
    * return : 현재 메소드를 종료하고 호출한 구문으로 돌아가라는 명령
    * */
    public static void main(String[] args) {
        Application4 app4 = new Application4();
//        app4.testMethod();
        String greeting = app4.sayHello();
        System.out.println(greeting);

    }

    public void testMethod() {
        System.out.println("테스트 동작 확인1");
        return;
//        System.out.println("테스트 동작 확인1");


    }

    // 문자열을 반환
    // 접근제어자 뒤에 반환할 타입을 명시해야 한다.
    // 아무것도 반환하지 않을 때는 void
    public String sayHello () {
        String hello = "Hello Java";
        return hello;
    }
}
