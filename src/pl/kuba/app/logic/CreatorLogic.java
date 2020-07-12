package pl.kuba.app.logic;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class CreatorLogic {

    public static boolean needOrderStructure;
    public static boolean needProjectStructure;
    public static boolean needDefaultCalculator;
    public static boolean needDocumentation;
    public static boolean needCertificates;
    private static OrderCreator orderCreator;
    private static final String defaultPath = "P:\\Projekty";
    public static String orderName;
    private static String defaultCalculatorLocation
            = "P:\\Procedura wyceny\\Archiwum wersji datowanych\\Procedura wyceny 2020.02.17.xlsx";


    public static void execute() {

        String year = String.valueOf(2020);
        orderCreator = new OrderCreator();
        orderCreator.setOrderName(orderName);
        String orderPath = defaultPath + "\\" + year;
        orderCreator.createOrder(orderPath);
        orderPath = orderPath + "\\" + orderCreator.getOrderName();

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
                System.out.println("Dodano poprawnie kalkulator");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (needDocumentation) {
            //String in = "C:\\Users\\jakub\\Desktop\\Projekty\\Katalogi\\TA\\Karty katalogowe\\Komponenty TA-200, TA-1230";
            //String out = orderPath + "\\PW\\V. Karty katalogowe";
            //FileCopier.copyDirectory(in, out);
        }
        if (needCertificates) {
            //String in = "C:\\Users\\jakub\\Desktop\\Projekty\\Katalogi\\TA\\Certyfikaty";
            //String out = orderPath + "\\PW\\VI. Certyfikaty";
            //FileCopier.copyDirectory(in, out);
        }
    }

}
