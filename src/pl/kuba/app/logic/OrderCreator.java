package pl.kuba.app.logic;

import java.io.File;

public class OrderCreator {

    private String orderName;

    public void createOrder(String path) {

        File file = new File(path + "\\" + orderName);
        boolean isCreated = file.mkdir();
        System.out.println("Stworzono zlecenie: " + isCreated);

    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderName() {
        return orderName;
    }
}
