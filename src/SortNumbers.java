import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortNumbers {
    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(1,2,3,4,5,6,6,6,6,7,7,8);
//        System.out.println("List of uniquenumbers are  :");
//        List<Integer> uniquenumber  =  list.stream()
//                .collect(Collectors.toMap(num->num,num->num,(existing,replacement)->existing))
//                .values().stream().collect(Collectors.toList());
//        System.out.println("List of sorted and distinct values are :");
//        uniquenumber.forEach(System.out::println);
        List<Integer> sort =  list.stream().distinct().collect(Collectors.toList());
        sort.forEach(System.out::println);
    }
}
