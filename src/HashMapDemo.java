import java.util.HashMap;
import java.util.Map;


public class HashMapDemo {


    public static void main(String[] args){

        HashMap<String, Integer> map = new HashMap<>();
        map.put("madhu", 1);
        map.put("babu", 2);
        map.put("manikala", 3);

        System.out.println(map);

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }

}
