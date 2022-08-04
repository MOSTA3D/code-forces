import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] coins = new int[n];
        int sum=0, count=0;
        float comparator = 0;
        for(int i = 0; i < n; i++){
            coins[i] = scanner.nextInt();
            comparator += coins[i];
        }

        comparator = comparator / 2;

        Arrays.sort(coins);

        for(int i = n-1; i >= 0; i--){
            sum+= coins[i];
            count++;
            if(sum > comparator){
                break;
            }
        }

        System.out.println(count);
    }
}