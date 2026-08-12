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
        int[] arr2 = {1, 3, 5, 9, 56,98,8,5,9,1}; // with duplicates
        System.out.println(Arrays.stream(arr2).distinct().sorted().skip(Arrays.stream(arr2).distinct().count() -3).findFirst().orElseThrow()); // skipping first 2 elements



                for(int i=1;i<=5;i++) {
                    for(int j=1;j<=i;j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }

                Set<Integer> seen = new HashSet<>();
                Set<Integer> dup = new HashSet<>();
                for(int str1:arr2){
                    if(!seen.add(str1)){
                        if(seen.contains(str1)){
                            System.out.println("test: "+str1);
                            //break;
                        }
                    }
                }
                for(int i : dup){
                    System.out.println(i+" ");
                }
                System.out.println("Unique: "+seen);
                System.out.println("Duplicates: "+dup);




    }
}
