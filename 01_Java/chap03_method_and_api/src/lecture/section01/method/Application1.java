package lecture.section01.method;

public class Application1 {

    public static void main(String[] args) {

        System.out.println("Main Method implemented...");
        Application1 app1 = new Application1(); // create a class

        app1.methodA(); //methodA calling
        app1.methodB();
        app1.methodC();

        System.out.println("Main Method closed...");

    }

    public void methodA() {

        System.out.println("methodA() calling...");

        return;

    }
    public void methodB() {

        System.out.println("methodB() calling...");

        return;

    }
    public void methodC() {

        System.out.println("methodC() calling...");

        return;

    }
}
