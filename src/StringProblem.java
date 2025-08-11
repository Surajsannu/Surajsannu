import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class StringProblem {
    public static void main(String[] args) {
        String input = "baseball";
        System.out.println("To count the frequency:" + FrequencyCount(input));
    }

    public static String FrequencyCount(String input) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char count : input.toCharArray()){
            map.put(count,map.getOrDefault(count,0) +1);
        }
        StringBuilder result  =  new StringBuilder();
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() >=2){
                result.append(entry.getKey()).append(" ");
            }
        }

        return result.toString().trim();
    }

}
