import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] array_word = new char[a.length()];
        
        for(int i = 0; i < a.length(); i ++){
            char b = (a.charAt(i));
            if(Character.isUpperCase(b)){
                array_word[i] = Character.toLowerCase(b);
            }else{
                array_word[i] = Character.toUpperCase(b);
            }
        }
        String result = new String(array_word);
        System.out.println(result);
    }
}