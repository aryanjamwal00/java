import java.util.HashMap;
import java.util.Map;

public class Basic {
    static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");

        for(Map.Entry<Integer,String> entry : map.entrySet() ){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
