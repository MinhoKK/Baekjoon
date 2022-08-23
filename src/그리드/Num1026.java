package 그리드;
import java.util.Scanner;
import java.util.Arrays;

public class Num1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int aArray[] = new int [len];
        int bArray[] = new int [len];

        for(int i=0; i<len; i++)
            aArray[i] = sc.nextInt();


        for(int i=0; i<len; i++)
            bArray[i] = sc.nextInt();

        Arrays.sort(aArray);
        Arrays.sort(bArray);
        int sum=0;

        for(int i=0; i<len; i++){
            sum += aArray[i]*bArray[len-i-1];
        }
        System.out.println(sum);
    }
}
