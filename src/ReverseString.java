public class ReverseString {
    public static void main(String[] args) {
        String s = "The sky is Blue";
        System.out.println("The reverese string are :" + Reverse(s));
    }

    public static String Reverse(String s) {
        s = s.trim();
        String[] word = s.split("\s+");
        StringBuilder build = new StringBuilder();
        for(int i = word.length-1; i>=0; i--){
            build.append(word[i]);
            if(i>0){
                build.append(" ");
            }
        }
        return build.toString();
    }
}
