import java.util.Arrays;

public class ArrayBiggest  {

    public static void main(String[] args) {

        int[] arr = {12,4,56,98,0};

        int max = arr[0];

        // using stream
        int biggest = Arrays.stream(arr).max().getAsInt();

        System.out.println(biggest);

        //using for each
        for(int num : arr){
            if(num>max){
                max=num;
            }
        }
        System.out.println(max);

    }
}
