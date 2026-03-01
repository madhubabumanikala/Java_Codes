import java.util.Arrays;
import java.util.*;

public class ArraySecondBiggest {

    public static void main(String[] args) {

        //approach 1
        int[] arr = {1, 3, 5, 9, 56,98}; // with duplicates
        System.out.println(Arrays.stream(arr).distinct().sorted().skip(Arrays.stream(arr).distinct().count() -2).findFirst().orElseThrow());

        //approach 2
        List<Integer> arr1 = Arrays.asList(5,8,6);

//        List<Integer> arr1 = new ArrayList<>(5);
//        arr1.add(23);
//        arr1.add(3);
//        arr1.add(2);
//        arr1.add(93);
//        arr1.add(63);

        System.out.println(arr1.stream().distinct().sorted().skip(arr1.stream().distinct().count() -2).findFirst().orElseThrow());

        //Second smallest in an array or list
        int[] arr2 = {1, 3, 5, 9, 56,98}; // with duplicates
        System.out.println(Arrays.stream(arr2).distinct().sorted().skip(Arrays.stream(arr2).distinct().count() -3).findFirst().orElseThrow()); // skipping first 2 elements


    }
}
