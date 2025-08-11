public class StringPalindrome {
    public static void main(String[] args) {
        String s  =  "madam";
        System.out.println(isPalindrome(s));
    }

    public  static boolean isPalindrome(String s) {
        //char[] ch  =  s.toCharArray();
        int left  = 0;
         int right  = s.length()-1;
         while(left<=right){
             if(s.charAt(left)!= s.charAt(right)){
                 return false;
             }
             left++;
             right--;
         }
         return true;
    }
}
