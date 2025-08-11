public class FirstIndex {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(FirstOccurance(haystack, needle));
    }

    public  static int FirstOccurance(String haystack, String needle) {
        return haystack.indexOf(needle);

    }
}
