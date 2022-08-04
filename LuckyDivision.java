import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static boolean isLucky(int num){
        char[] charList = String.valueOf(num).toCharArray();
        for(int i = 0; i < charList.length; i++){
            if(charList[i] == 55 || charList[i] == 52){
                continue;
            }else{
                return false;
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

        for(int i = 0; i < 1000; i++){
            if(isLucky(i) && n%i == 0){
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}