import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        char[] numbers;
 
        char[] expression = scanner.nextLine().toCharArray();
        scanner.close();
 
        numbers = new char[expression.length/2 + 1];
 
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = expression[i * 2];
        }
 
        Arrays.sort(numbers);
 
        for(int i = 0; i < numbers.length; i++) {
            expression[i * 2] = numbers[i];
        }
 
        System.out.println(expression);
    }
}
