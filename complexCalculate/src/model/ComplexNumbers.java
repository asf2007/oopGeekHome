package model;

public class ComplexNumbers {
    private String complexNum;
    public ComplexNumbers(String complexNum) {
        this.complexNum = complexNum;
    }

    public String getComplexNum() {
        return complexNum;
    }


    public double[] getArrayNum(){
       double [] arr = {Integer.parseInt(complexNum.split("\\+")[0]), Integer.parseInt(complexNum.split("\\+")[1].replace("i", "")) };
       return arr;
    }

}
