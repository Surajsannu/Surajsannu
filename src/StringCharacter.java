public class StringCharacter {
    public static void main(String[] args) {
        String s = "Suraj";
        String reversed = reversed(s);
        System.out.println("Reversed string :" + reversed);
    }

    public static String reversed(String s) {
        s= s.trim();
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length - 1;
        //swap
        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return new String(ch);
    }
}

