import java.util.HashMap;

public class FindUnique {
    public static void main(String[] args) {
        char[] ch = {'c','a','c','a','b','b','c','e','f'};
        System.out.println("The first oocurance of unqiue value is : " +
                uniqueword(ch));
    }

    public  static char uniqueword(char[] ch) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : ch){
            map.put(c,map.getOrDefault(c,0)+1);
            }
        for(char c : ch){
            if(map.get(c) ==1){
                return c;
            }
        }
        return 0;
    }
}
