package pl.kuba.app.logic;

import java.io.File;

public class ProjectStructureMaker {

    private String[] projectFolders = {"I. Opis techniczny", "II. Oświadczenia", "III. Obliczenia", "IV. Rysunki",
            "V. Karty katalogowe", "VI. Certyfikaty"};

    public ProjectStructureMaker(String path) {
        createProjectStructure(path);
    }

    private void createProjectStructure(String path) {

        for (String s : projectFolders) {
            File file = new File(path + "/PW/" + s);
            boolean dirCreated = file.mkdir();
            if (dirCreated) {
                System.out.println("Stworzono poprawnie");
            } else {
                System.out.println("Błąd tworzenia folderów");
            }
        }
    }

}
