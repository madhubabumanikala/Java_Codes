import java.util.*;

public class FirstMissingPositiveNumber {

    public static void main(String[] args) {

        int[] nums = {3,4,-1,1};
        List<Integer> list = new ArrayList<>();

        for(int num : nums){
            list.add(num);
        }

        Collections.sort(list);
        int missing = 1;

        for(int num : list){
            if(num == missing){
                missing++;
            }
        }
        System.out.println(missing);

    }
}
