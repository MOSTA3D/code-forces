import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int five = 5;
        int[] dimensions = new int[2];
        int[][] matrix = new int[five][five];
        for(int i = 0; i < five; i++){
            for(int j = 0; j < five; j++){
                int t = scanner.nextInt();
                if(t != 0){
                    dimensions[0] = i;
                    dimensions[1] = j;
                }
                matrix[i][j] = t;
            }
        }
        scanner.close();
        System.out.println(abs(2 - dimensions[0]) + abs(2 - dimensions[1]));
    }
}