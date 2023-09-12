import Classes.*;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) {
        Market magnit = new Market();

        iActorBehaviour client1 = null;
        iActorBehaviour client2 = null;
        iActorBehaviour client3 = null;
        iActorBehaviour client4 = null;
        client1 = new OrdinaryClient("boris");
        client2 = new SpecialClient("prezident", 1);
        client3 = new TaxInspector();
        iActorBehaviour client5 = null;
        iActorBehaviour client6 = null;
        try {
            client4 = new StockClient("Alex", "black friday");
            client4.getActor().setAllowReturnProduct(true);
            client5 = new StockClient("Ivan", "black friday");
            client6 = new StockClient("Anton", "black friday");
        } catch (StopStockException ex) {
            System.out.println("stock is finish");
        }
        if(!client1.equals(null)) {
            magnit.acceptToMarket(client1);
        }
        if(!client2.equals(null)) {
            magnit.acceptToMarket(client2);
        }
        if(!client3.equals(null)) {
            magnit.acceptToMarket(client3);
        }
        if(!client4.equals(null)) {
            magnit.acceptToMarket(client4);
        }
        if(!client5.equals(null)) {
            magnit.acceptToMarket(client5);
        }

        magnit.update();
    }
}
