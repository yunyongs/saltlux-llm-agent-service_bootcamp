package lecture.section01.method;

public class Application2 {

    public static void main(String[] args) {

        System.out.println("Main Method implemented...");
        Application2 app1 = new Application2(); // create a class

        app1.methodA(); //methodA calling


        System.out.println("Main Method closed...");

    }

    public void methodA() {

        System.out.println("methodA() calling...");
        methodB();
        System.out.println("MethodA() closed...");

        return;

    }
    public void methodB() {

        System.out.println("methodB() calling...");
        methodC();
        System.out.println("MethodB() closed...");

        return;

    }
    public void methodC() {

        System.out.println("methodC() calling...");
        System.out.println("MethodC() closed...");

        return;

    }
}
