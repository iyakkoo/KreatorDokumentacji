package pl.kuba.app;

import pl.kuba.app.logic.FileCopier;
import pl.kuba.app.logic.OrderCreator;
import pl.kuba.app.logic.OrderStructureMaker;
import pl.kuba.app.logic.ProjectStructureMaker;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CreatorLogic {

    public static boolean needOrderStructure;
    public static boolean needProjectStructure;
    public static boolean needDefaultCalculator;
    public static boolean needDocumentation;
    public static boolean needCertificates;
    private OrderCreator orderCreator;
    private String orderPath;
    private String orderName;

    public CreatorLogic(String orderPath) {
        this.orderPath = orderPath;
    }

    public void execute() {

        orderCreator = new OrderCreator();
        orderCreator.setOrderName(orderName);
        orderCreator.createOrder(orderPath);
        orderPath = orderPath + "/" + orderCreator.getOrderName();

        needOrderStructure = true;
        needProjectStructure = true;
        needDefaultCalculator = true;
        needDocumentation = true;
        needCertificates = true;
        if (needOrderStructure) {
            new OrderStructureMaker(orderPath);
        }
        if (needProjectStructure) {
            new ProjectStructureMaker(orderPath);
        }
        if (needDefaultCalculator) {
            String in = "C:/Users/jakub.koziol/Desktop/Procedura wyceny 2020.06.04.xlsx";
            String out = orderPath + "/PW/III. Obliczenia/Procedura wyceny 2020.06.04.xlsx";
            try {
                Files.copy(new File(in).toPath(), new File(out).toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (needDocumentation) {
            FileCopier.copyDirectory(null, null);
        }
        if (needCertificates) {
            FileCopier.copyDirectory(null, null);
        }
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
}
