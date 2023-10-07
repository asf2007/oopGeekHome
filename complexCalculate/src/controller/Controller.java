package controller;

import view.ViewCalculator;

public class Controller {
    private iCalculable calculator;
    private ViewCalculator view;

    public Controller() {
        this.calculator = new Decorator(new ComplexCalculator(), new Logger());
        this.view = new ViewCalculator();
    }

    public void run() {
        while (true) {
            String arg1 = view.prompt("Введите первый аргумент вида a+bi: ");
            calculator.setArg1(arg1);
            String arg2 = view.prompt("Введите второй аргумент a+bi: ");
            calculator.setArg2(arg2);
            //calculator.sum(primaryArg);
            //iCalculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = view.prompt("Введите команду (*, +,/) : ");
                if (cmd.equals("*")) {
                    calculator.multi();
                    break;
                }
                if (cmd.equals("+")) {
                    calculator.sum();
                    break;
                }
                if (cmd.equals("/")) {
                    calculator.divide();
                    break;
                }

            }
            String mainCmd = view.prompt("---------------------\nEXIT - выход\nлюбая буква - продолжить\n");
            if(mainCmd.equals("exit")){
                break;
            }

        }
    }
}
