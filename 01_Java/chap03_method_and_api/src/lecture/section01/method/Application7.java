package lecture.section01.method;

public class Application7 {
    public static void main(String[] args) {

        /*
        * 다른 클래스에 작성한 static 메서드는 호출할 때 클래스명을 함께 작성해 주어야 한다.
        * */
        int result = Application6.sum(5,6 );
        System.out.println("result = " + result);


        Application6 app6 = new Application6(); //subtract는 static이 아니기 때문에 클래스 생성 후 호출 가능
        int result2 = app6.subtract(5, 6);
        System.out.println("result2 = " + result2);


    }
}
