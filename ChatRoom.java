import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] hello = {'h', 'e', 'l', 'l', 'o'};
        int helloIndex = 0;
        char[] helloIn = scanner.nextLine().toCharArray();

        for(int i = 0; i < helloIn.length; i++){
            if(helloIn[i] == hello[helloIndex]){
//                System.out.println("hello character: " + hello[helloIndex] + " and hello length: " + helloIn[i]);
//                System.out.println(helloIndex + "" + hello.length);
                if(helloIndex == (hello.length - 1)){
                    System.out.println("YES");
                    helloIndex++;
                    break;
                }
                helloIndex++;
            }
        }
//        System.out.println(helloIndex + "" + hello.length);
       if(helloIndex <= (hello.length - 1)){
            System.out.println("NO");
        }
    }
}