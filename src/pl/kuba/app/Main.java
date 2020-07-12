package pl.kuba.app;


import pl.kuba.app.logic.CreatorLogic;
import pl.kuba.app.view.MainPanel;

public class Main {

    //Przykładowe lokalizacje folderu projektów i folderów katalogów
    String orderName = "1234_RE_Abc_xyz_dla Patki";
    String path = "P:\\Projekty";
    String sourcesPath = "C:\\Users\\jakub\\Desktop\\Projekty\\Katalogi";

    public static void main(String[] args) {

        new MainPanel();
        //CreatorLogic logic = new CreatorLogic(new Main().path);
        //logic.setOrderName(new Main().orderName);
        //logic.execute();

    }
}
