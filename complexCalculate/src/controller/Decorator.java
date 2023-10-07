package controller;

public class Decorator implements iCalculable {

    private ComplexCalculator oldCalculator;
    private Logger logger;

    

    public Decorator(ComplexCalculator oldCalculator, Logger logger) {
        this.oldCalculator = oldCalculator;
        this.logger = logger;
    }

    @Override
    public void setArg1(String arg1) {
       oldCalculator.setArg1(arg1);
        logger.log(String.format("Первое значение калькулятора "+arg1+"." ));
    }

    @Override
    public void setArg2(String arg2) {
        oldCalculator.setArg2(arg2);
        logger.log(String.format("Второе значение калькулятора "+arg2+"." ));

    }

    @Override
    public String getArg1() {
        return null;
    }

    @Override
    public String getArg2() {
        return null;
    }

    @Override
    public String sum() {

        String result = oldCalculator.sum();
        logger.log(String.format("Вызова метода sum произошел"));
        logger.log(String.format("Результат операции: "+result+" ."));

        return result;


    }

    @Override
    public String multi() {
        String result = oldCalculator.multi();
        logger.log(String.format("Вызова метода multi произошел"));
        logger.log(String.format("Результат операции: "+result+" ."));

        return result;
    }

    @Override
    public String divide() {
        String result = oldCalculator.divide();
        logger.log(String.format("Вызова метода divide произошел"));
        logger.log(String.format("Результат операции: "+result+" ."));

        return result;
    }





    
}
