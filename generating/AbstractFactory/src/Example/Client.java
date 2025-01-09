package Example;

import Example.Factories.AbstractFurnitureFactory;
import Example.Factories.ArtDecoFurnitureFactory;
import Example.Factories.ModernFurnitureFactory;
import Example.Factories.VictorianFurnitureFactory;
import Example.Products.Chairs.Chair;
import Example.Products.Sofas.Sofa;
import Example.Products.Tables.Table;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Client {
    public AbstractFurnitureFactory style;

    Client(AbstractFurnitureFactory style){
        this.style = style;
    }

    public static void main(String[] args) throws IOException {
        Client currentClient;
        System.out.println("What's style you want?");

        InputStream is = System.in;
        Charset charset = System.console().charset();

        InputStreamReader isr = new InputStreamReader(is, charset);
        BufferedReader br = new BufferedReader(isr);

        String answer = br.readLine();
        switch (answer){
            case "Victorian":
                currentClient = new Client(new VictorianFurnitureFactory());
                break;
            case "ArtDeco":
                currentClient = new Client(new ArtDecoFurnitureFactory());
                break;
            default:
                currentClient = new Client(new ModernFurnitureFactory());
                break;
        }

        Chair chair = currentClient.style.createChair();
        Table table = currentClient.style.createTable();
        Sofa sofa = currentClient.style.createSofa();
    }
}
