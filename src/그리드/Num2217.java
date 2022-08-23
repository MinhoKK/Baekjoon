package 그리드;
import java.util.Scanner;
import java.util.Arrays;

public class Num2217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int lopeWeight[] = new int [num];

        for(int i=0; i<num; i++){
            lopeWeight[i] = sc.nextInt();
        }

        Arrays.sort(lopeWeight);
        int max = 0;

        for(int j=0; j<num; j++){
            int check = lopeWeight[j]*(num-j);
            if(check > max){
                max = check;
            }
        }
        System.out.println(max);
    }
}

