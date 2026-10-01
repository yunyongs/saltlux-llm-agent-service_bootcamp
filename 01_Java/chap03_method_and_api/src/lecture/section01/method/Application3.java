package lecture.section01.method;

import java.time.LocalDate;
import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        System.out.println("Main Method implemented...");
        Application3 app1 = new Application3(); // create a class

        Scanner sc = new Scanner(System.in);

        System.out.println("당신의 출생년도는 : ");
        int birthYear = sc.nextInt();
        int age = app1.printAge(birthYear); //methodA calling
        app1.personalInfo("윤용석", age, '남');


        System.out.println("Main Method closed...");

    }

    public int printAge(int birthYear) {

        int thisYear = LocalDate.now().getYear();
        int age = thisYear - birthYear;
        return age;

    }

    public void personalInfo (String name, int age, char gender){
        System.out.println("==========당신의 정보==========");
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
    }
}


