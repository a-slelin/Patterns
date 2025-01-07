package Example;

public class Client {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT ...");
        // ...
        Database bar = Database.getInstance();
        bar.query("SELECT ...");
        // Переменная "bar" содержит тот же объект, что
        // и переменная "foo".
    }
}
