import controller.Controller;
import controller.Decorator;
import controller.iCalculable;

public class Main {
    public static void main(String[] args) {

//iCalculable cal = new ComplexCalculator();
        Controller controller = new Controller();
        controller.run();
    }
}