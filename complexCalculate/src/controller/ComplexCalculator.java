package controller;

import model.ComplexNumbers;

public class ComplexCalculator implements iCalculable {
    private String arg1;
    private String arg2;
    private double [] argComplex1;
    private double [] argComplex2;

    public ComplexCalculator() {
    }

    public ComplexCalculator(String arg1, String arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }
    public void makeNumArray(){
       this.argComplex1 = new ComplexNumbers(this.arg1).getArrayNum();
       this.argComplex2 = new ComplexNumbers(this.arg2).getArrayNum();
    }

    @Override
    public String getArg1() {
        return arg1;
    }

    @Override
    public String getArg2() {
        return arg2;
    }

    public void setArg1(String arg1) {
        this.arg1 = arg1;
    }

    public void setArg2(String arg2) {
        this.arg2 = arg2;
    }

    @Override
    public String sum() {
        makeNumArray();
        return this.argComplex1[0]+this.argComplex2[0] + "+"+(this.argComplex1[1]+this.argComplex2[1])+"i";

    }

    @Override
    public String multi() {
        makeNumArray();
        return (this.argComplex1[0]*this.argComplex2[0]-this.argComplex1[1]*this.argComplex2[1])+
                "+"+(this.argComplex1[0]*this.argComplex2[1]+this.argComplex1[1]*this.argComplex2[0]+"i");
    }

    @Override
    public String divide() {
        makeNumArray();
        return (((this.argComplex1[0]*this.argComplex2[0])+(this.argComplex1[1]*this.argComplex2[1]))/((this.argComplex2[0]*this.argComplex2[0])+(this.argComplex2[1]*this.argComplex2[1])))+
                "+"+(((this.argComplex1[1]*this.argComplex2[0])-(this.argComplex1[0]*this.argComplex2[1]))/((this.argComplex2[0]*this.argComplex2[0])+(this.argComplex2[1]*this.argComplex2[1])))+"i";
    }
}
