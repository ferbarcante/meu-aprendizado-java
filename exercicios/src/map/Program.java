package map;

import java.util.TreeMap;
import java.util.Map;

public class Program {

    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "7189838");

        cookies.remove("phone");

        System.out.println("ALL COOKIES");
        for(String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
