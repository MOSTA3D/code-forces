import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        String[] wordList = new String[n];

        for(int i = 0; i < n;i++){
            String word = scanner.nextLine();
            if(word.length() > 10){
                wordList[i] = word.substring(0, 1) + (word.length() - 2) + word.substring(word.length() - 1);
            }else{
                wordList[i] = word;
            }
        }

        scanner.close();

        for(int i = 0; i < n; i++){
            System.out.println(wordList[i]);
        }
    }
}