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
        //char 배열을 String으로 변환하는 방법 
        //1. String 생성자 2. String.valueOf() 3. StringBuilder
        //1,2 간단하나 큰 배열의 경우 메모리 사용량이 증가할 수 있음 3. 메모리 효율성이 높지만 코드가 상대적으로 복잡해질 수 있음.
        System.out.println(result);
    }
}
