package pl.kuba.app.logic;

import pl.kuba.app.view.MainPanel;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDate;

public class CreatorLogic {

    public static boolean needOrderStructure;
    public static boolean needProjectStructure;
    public static boolean needDefaultCalculator;
    public static boolean needSystemDocumentation;
    public static boolean needControlDocumentation;
    public static int sysDocType;
    public static int controlDocType;


    public void execute() {
        ProjectInfo project = new ProjectInfo();
        OrderCreator orderCreator = new OrderCreator();
        orderCreator.setOrderName(ProjectInfo.orderName);
        String orderPath = project.getDefaultPath() + "\\" + LocalDate.now().getYear();
        orderCreator.createOrder(orderPath);
        orderPath = orderPath + "\\" + orderCreator.getOrderName();

        if (needOrderStructure) {
            new OrderStructureMaker(orderPath);
            MainPanel.status = "Tworzenie struktury zlecenia";

            if (needProjectStructure) {
                new ProjectStructureMaker(orderPath);
                MainPanel.status = "Tworzenie struktury projektu";

                if (needDefaultCalculator) {
                    try {
                        Files.copy(new File(project.getDefaultCalculatorLocation()).toPath(),
                                new File(orderPath + project.getTargetCalculatorPath()).toPath());
                        System.out.println("Dodano poprawnie kalkulator");
                        MainPanel.status = "Dodawanie kalkulatora";
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    if (needSystemDocumentation) {
                        FileCopier.copyDirectory(project.getSystemDataSheetLink(sysDocType),
                                orderPath + project.getDefaultDataSheetLocation());
                        FileCopier.copyDirectory(project.getSystemCertyficatesLink(sysDocType),
                                orderPath + project.getDefaultCertificatesLocation());
                    }
                    if (needControlDocumentation) {
                        FileCopier.copyDirectory(project.getControlDataSheetLink(controlDocType),
                                orderPath + project.getDefaultDataSheetLocation());
                        FileCopier.copyDirectory(project.getControlCertyficatesLink(controlDocType),
                                orderPath + project.getDefaultCertificatesLocation());
                    }
                }
            }
        }
    }
}
