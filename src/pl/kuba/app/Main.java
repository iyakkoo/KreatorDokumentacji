package pl.kuba.app;


import pl.kuba.app.logic.CreatorLogic;

public class Main {

    //Przykładowe lokalizacje folderu projektów i folderów katalogów
    String orderName = "2200_RE_Abc_xyz_SK";
    String path = "C:\\Users\\jakub\\Desktop\\Projekty\\Projekty\\2020";
    String sourcesPath = "C:\\Users\\jakub\\Desktop\\Projekty\\Katalogi";

    public static void main(String[] args) {

        CreatorLogic logic = new CreatorLogic(new Main().path);
        logic.setOrderName(new Main().orderName);
        logic.execute();

    }
}
