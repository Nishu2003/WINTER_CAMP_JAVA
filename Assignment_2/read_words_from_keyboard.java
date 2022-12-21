package Assignment2;
import java.util.Scanner;
public class read_words_from_keyboard {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            String word;
            do{
                System.out.println("Enter a word : ");
                word=sc.next();
                char p=word.charAt(0);
                char m=word.charAt(word.length()-1);
                if(p==m){
                    System.out.println("First and last character is equal");
                }
                else{
                    System.out.println("First and last character is not equal");
                }

            }while(!word.equalsIgnoreCase("done"));
        }
    }
}
