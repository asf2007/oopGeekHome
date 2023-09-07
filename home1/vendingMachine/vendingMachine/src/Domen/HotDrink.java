package Domen;

public class HotDrink extends Product{
    private  int temperature;

    /**
     *
     * @param name название продукта
     * @param price цена продукта
     * @param temperature температура горячего продукта
     * @throws Exception
     */
    public HotDrink(String name, int price, int temperature) throws Exception {
        super(name, price);
        this.temperature = temperature;
    }



    public int getTemperature() {
        return temperature;
    }


    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString()
    {
        return "Product{" +
                super.toString() +
                "; temperature=" + getTemperature() +
                '}';
    }
}
