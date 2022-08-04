import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] friends = new int[count];
        for(int i = 0; i < count; i++){
            friends[scanner.nextInt() - 1] = i;
        }

        for(int i = 0; i < count; i++) {
            System.out.print(friends[i] + 1 + " ");
        }
    }
}