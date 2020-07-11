package pl.kuba.app.logic;

import java.io.File;

public class OrderCreator {

    private String orderName;

    public void createOrder(String path) {

        if (!orderName.equals(null)) {
            File file = new File(path + "/" + orderName);
            file.mkdir();
        }
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderName() {
        return orderName;
    }
}
