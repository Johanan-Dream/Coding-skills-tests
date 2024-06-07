import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().toUpperCase();

        char[] arr = text.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : arr){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        Integer maxValue = Collections.max(map.values());
        List<String> result = map.entrySet()
            .stream()
            .filter(entry -> entry.getValue().equals(maxValue))
            .map(entry -> entry.getKey().toString())
            .collect(Collectors.toList());

        if(result.size() >= 2){
            System.out.println("?");
        }else if(result.size() == 1){
            System.out.println(result.get(0));
        }
    }
}
