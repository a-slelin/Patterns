package Structure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static Map<String, Flyweight> cashe = new HashMap<>();

    public static Flyweight getFlyweight(String repeatingState){
        Flyweight result = cashe.get(repeatingState);
        if(result == null){
            result = new Flyweight(repeatingState);
            cashe.put(repeatingState, result);
        }

        return result;
    }

    public static void show(){
        System.out.println(cashe.toString());
    }
}
