package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public abstract class Actor implements iActorBehaviour, iReturnOrder {

    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    protected boolean isAllowReturnProduct = false;
    protected boolean isReturnProduct = false;


    public Actor(String name) {
        this.name = name;
    }

    abstract public void setName(String name);
    abstract public String getName();




}
