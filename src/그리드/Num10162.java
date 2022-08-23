package 그리드;
import java.util.Scanner;


public class Num10162 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int time = sc.nextInt();
        int count[] = new int[3];
        count[0] = 300; count[1] = 60; count[2] = 10;
        int min = 0;

        for(int i=0; i<count.length; i++){
            if(time%10 != 0){
                System.out.println(-1);
                break;
            }
            min += time/count[i];
            time = time%count[i];
            System.out.print(min);
            System.out.print(" ");
            min = 0;
        }

    }


}
