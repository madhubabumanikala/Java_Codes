import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class HashMapDemo {


    public static void main(String[] args){
        test();
        HashMap<String, Integer> map = new HashMap<>();
        map.put("madhu", 1);
        map.put("babu", 2);
        map.put("manikala", 3);

        System.out.println(map);

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }

    public static void test() {
        String str = "swiss swiss 855585896 )(*&^%$#@!@#$%^&*(";

        Map<Character, Integer> lmap = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            if (c != ' ' && !Character.isLetterOrDigit(c)) {
                lmap.put(c, lmap.getOrDefault(c, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> emap : lmap.entrySet()) {

            System.out.println(emap.getKey() + ":" + emap.getValue());

            if (emap.getValue() == 1 || emap.getValue() == 2) {
                //  System.out.println(emap.getKey());
            }
        }
    }


}
