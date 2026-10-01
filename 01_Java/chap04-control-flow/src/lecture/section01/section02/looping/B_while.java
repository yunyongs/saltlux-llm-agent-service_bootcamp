package lecture.section01.section02.looping;

import java.util.Scanner;

public class B_while {

    //ctrl + alt + l : 줄정렬
    //crtl + alt + o : 안쓰는 import 제거

    public void sampleWhile() {
        int i = 1;


        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("정수를 입력해 주세요: ");
            int num = sc.nextInt();

            i++;

            if (num == 5) {
                break;
            }
        }
    }

}
