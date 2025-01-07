package Example;

public class Database {
    private static Database instance = new Database();

    private Database(){
        // Здесь может жить код инициализации подключения к
        // серверу баз данных.
        // ...
    }

    public static Database getInstance(){
        return instance;
    }

    public boolean query(String sql){
        // Все запросы к базе данных будут проходить через
        // этот метод. Поэтому имеет смысл поместить сюда
        // какую-то логику кеширования.
        // ...
        return true;
    }
}
