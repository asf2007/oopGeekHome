package Classes;

public class StockClient extends Actor{
    private static int idStockClient = 0;
    private String nameStock;
    private static int maxNumStockClient = 2;

    public StockClient(String name,  String nameStock) throws StopStockException {
        super(name);
        this.nameStock = nameStock;

            this.idStockClient++;
            if(this.getIdStockClient()>maxNumStockClient){
                throw new StopStockException("Stop");
            }


    }

    public void setIdStockClient(int idStockClient) {
        this.idStockClient = idStockClient;
    }

    public void setNameStock(String nameStock) {
        this.nameStock = nameStock;
    }

    public int getIdStockClient() {
        return this.idStockClient;
    }

    public String getNameStock() {
        return nameStock;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean take) {
        super.isTakeOrder = take;

    }

    @Override
    public void setMakeOrder(boolean make) {
        super.isMakeOrder = make;

    }

    @Override
    public Actor getActor() {
        return this;
    }


    @Override
    public void setAllowReturnProduct(boolean isAllowReturn) {
        super.isAllowReturnProduct = isAllowReturn;
    }

    @Override
    public void setReturnProduct(boolean isReturnProduct) {
        super.isReturnProduct = isReturnProduct;

    }

    @Override
    public boolean getAllowReturnProduct() {
        return super.isAllowReturnProduct;
    }
}
