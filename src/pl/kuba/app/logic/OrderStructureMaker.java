package pl.kuba.app.logic;

import java.io.File;

public class OrderStructureMaker {

    private String[] orderDirectories = {"zlecenie", "od klienta", "PW", "zestawienia"};

    public OrderStructureMaker(String path) {
        createOrderStructure(path);
    }

    private void createOrderStructure(String path) {

        for (String s: orderDirectories) {
            File file = new File(path + "/" + s);
            file.mkdir();
        }

    }
}
