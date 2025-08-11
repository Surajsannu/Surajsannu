public class LastWord {
    public static void main(String[] args) {
        String s  =  "Hello World";
        System.out.println(LengthOfLastWorld(s));
    }
    public static int LengthOfLastWorld(String s){
      String[] splitted  =  s.split("\s");
      return splitted[splitted.length-1].length();
    }
}
