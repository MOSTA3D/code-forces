import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] word1Chrs = scanner.nextLine().toLowerCase().toCharArray();
        char[] word2Chrs = scanner.nextLine().toLowerCase().toCharArray();
        int result = 0;

        int length = word1Chrs.length > word2Chrs.length ? word2Chrs.length : word1Chrs.length;

        for(int i = 0; i < length ; i++){
            if(word1Chrs[i] > word2Chrs[i]){
                result = 1;
                break;
            }else{
                if(word1Chrs[i] == word2Chrs[i]){
                    continue;
                }else{
                    result = -1;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}