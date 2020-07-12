package pl.kuba.app.logic;

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
    private String defaultCalculatorLocation = "C:\\Users\\jakub\\Desktop\\Procedura wyceny.xlsx";

    public CreatorLogic(String orderPath) {
        this.orderPath = orderPath;
    }

    public void execute() {

        orderCreator = new OrderCreator();
        orderCreator.setOrderName(orderName);
        orderCreator.createOrder(orderPath);
        orderPath = orderPath + "\\" + orderCreator.getOrderName();

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
            String in = defaultCalculatorLocation;
            String out = orderPath + "\\PW\\III. Obliczenia\\Procedura wyceny.xlsx";
            try {
                Files.copy(new File(in).toPath(), new File(out).toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (needDocumentation) {
            String in = "C:\\Users\\jakub\\Desktop\\Projekty\\Katalogi\\TA\\Karty katalogowe\\Komponenty TA-200, TA-1230";
            String out = orderPath + "\\PW\\V. Karty katalogowe";
            FileCopier.copyDirectory(in, out);
        }
        if (needCertificates) {
            String in = "C:\\Users\\jakub\\Desktop\\Projekty\\Katalogi\\TA\\Certyfikaty";
            String out = orderPath + "\\PW\\VI. Certyfikaty";
            FileCopier.copyDirectory(in, out);
        }
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
}
