package Structure;

public class Client {
    public static void main(String[] args){
        Composite main = new Composite();

        Composite sub = new Composite();
        sub.add(new Composite());
        sub.add(new Leaf());
        sub.add(new Composite());

        main.add(sub);
        main.add(new Leaf());
        main.add(new Leaf());

        main.execute();
    }
}
