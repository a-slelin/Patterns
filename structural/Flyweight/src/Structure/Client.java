package Structure;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args){
        ArrayList<Context> contexts = new ArrayList<>();
        String type = "Type";
        for(int i = 0; i < 1000; ++i){
            Context context = new Context(i + i/5.0, type);
            contexts.add(context);
            if (i == 10){
                type = "Type2";
            }
            if(i == 900){
                type = "Type3";
            }
        }
        FlyweightFactory.show();
        System.out.println();
        System.out.println(contexts);
    }
}
