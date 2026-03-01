import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CharFrequency {

    public static void main(String[] args) {

        String str = "madhubabu manikala";

        Map<Character, Long> freqChar = str.toLowerCase().replace(" ","").chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(
                Function.identity(), LinkedHashMap::new,Collectors.counting()
        ));

        System.out.println(freqChar);

      //  IntStream.iterate(1,n->n+2).limit(10).skip(2).forEach(System.out::println);

        //str.chars().mapToObj(i->(char)i).distinct().forEach(System.out::println);

        str.chars().mapToObj(i->(char)i).filter(c->"aeiou".indexOf(c)>=0).distinct().forEach(System.out::println);

    }
}
