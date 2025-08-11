public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] num = {1,1,1,2,2,3};
        System.out.println("Duplicate removed :" + countDuplicate(num));
    }

    public static int countDuplicate(int[] num) {
        int i =1;
        int count  = 1;
        for(int right =1; right<num.length; right++){
            if(num[right] == num[right -1]){
                count++;
            }else{
                count =1;
            }
            if(count<=2){
                num[i] = num[right];
                i++;
            }
        }
        return i;
    }
}
