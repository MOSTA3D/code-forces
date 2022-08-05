import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static int[] getLuckyList(int n){
        int size = 0;
        for(int i = 0; i < n;i++){
            size += Math.pow(2, i+1);
        }

        int[] luckyList = new int[size];
        int luckyListIndex = 0;

        for(int i = 0; i < n; i++){
            double nRows = Math.pow(2, i+1);
            int[][] matrix = new int[i+1][(int) nRows];
            for(int j = 0; j < (i+1); j++){
                double step = Math.pow(2, j);
                double t1 = nRows/(2*step);
                for(int k = 0; k < step; k++){
                    for(int x = 0; x < t1;x++){
                        int t2 = x + ((2 * k * (int)t1));
                        matrix[j][t2] = 4;
                        matrix[j][t2+(int)t1] = 7;
                    }
                }
            }

            for(int h = 0; h < nRows; h++){
                int sum = 0;
                for(int g = 0; g < i+1; g++){
                    sum += matrix[g][h];
                    sum *= 10;
                }
                luckyList[luckyListIndex] = sum/10;
                luckyListIndex++;
            }
        }
        return luckyList;
    }


    public static boolean isLucky(int num){
        while(true){
            int digit = num % 10;
            if(digit == 4 || digit == 7){
                num /= 10;
            }else{
                return false;
            }
            if(num == 0){
                break;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        if(isLucky(n)){
            System.out.println("YES");
            return;
        }

        for(int i : getLuckyList(3)){
            if(n%i == 0){
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}