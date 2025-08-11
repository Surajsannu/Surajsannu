import java.util.HashSet;

public class UniqueSet {
    public static void main(String[] args) {
        char[] ch = {'c','a','c','a','b','b','c','e','f'};
        System.out.println(FindUniqueCharacter(ch));
    }

    public  static char FindUniqueCharacter(char[] ch) {
        HashSet<Character> seen  =  new HashSet<>();
        HashSet<Character> duplicate  =  new HashSet<>();
        for(char c : ch){
            if(!seen.add(c)){
                duplicate.add(c);
            }
        }
        for(char c : ch){
            if(!duplicate.contains(c)){
                return c;
            }
        }
        return 0;
    }
}
