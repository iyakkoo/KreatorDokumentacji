package pl.kuba.app.logic;

public class ProjectInfo {
    public static String orderName;
    private String systemName;
    private String controlName;
    private final String[] systems = {"Stilde SH", "Stilde SK", "Stilde SI", "Stilde SW", "TA-200", "TA-1230"};
    private final String[] controls = {"Inim", "Ignis"};
    private final String defaultPath = "P:\\Projekty";
    private final String defaultCalculatorLocation
            = "P:\\Procedura wyceny\\Archiwum wersji datowanych\\Procedura wyceny 2020.02.17.xlsx";
    private final String targetCalculatorPath = "\\PW\\III. Obliczenia\\Procedura wyceny.xlsx";
    private final String[] systemDataSheetLinks = {
            "P:\\Narzędzia projektowe\\Elementy dokumentacji\\Seria STILDE - dokumentacja\\Stilde SH i SK\\" +
                    "Karty katalogowe\\2019.07.16\\SH",
            "P:\\Narzędzia projektowe\\Elementy dokumentacji\\Seria STILDE - dokumentacja\\Stilde SH i SK\\" +
                    "Karty katalogowe\\2019.07.16\\SK",
            "P:\\Narzędzia projektowe\\Elementy dokumentacji\\Seria STILDE - dokumentacja\\Stilde SI\\Karty katalogowe KOT",
            "P:\\Narzędzia projektowe\\Elementy dokumentacji\\Seria STILDE - dokumentacja\\Stilde SI\\Karty katalogowe KOT",
            "P:\\Narzędzia projektowe\\Elementy dokumentacji\\Seria TA - dokumentacja\\Karty katalogowe\\Komponenty TA-200, TA-1230",
            "P:\\Narzędzia projektowe\\Elementy dokumentacji\\Seria TA - dokumentacja\\Karty katalogowe\\Komponenty TA-200, TA-1230"
    };
    private final String[] systemCertificatesLinks = {
            "P:\\Narzędzia projektowe\\Elementy dokumentacji\\Seria STILDE - dokumentacja\\kreator\\Stilde SH",
            "P:\\Narzędzia projektowe\\Elementy dokumentacji\\Seria STILDE - dokumentacja\\kreator\\Stilde SK",
            "P:\\Narzędzia projektowe\\Elementy dokumentacji\\Seria STILDE - dokumentacja\\kreator\\Stilde SI",
            "P:\\Narzędzia projektowe\\Elementy dokumentacji\\Seria STILDE - dokumentacja\\kreator\\Stilde SW",
            "P:\\Narzędzia projektowe\\Elementy dokumentacji\\Seria TA - dokumentacja\\Certyfikaty\\kreator\\TA-200",
            "P:\\Narzędzia projektowe\\Elementy dokumentacji\\Seria TA - dokumentacja\\Certyfikaty\\kreator\\TA-1230"
    };
    private final String[] controlDataSheetLinks = {
            "P:\\Narzędzia projektowe\\Elementy dokumentacji\\Systemy sygnalizacji, alarmu i detekcji\\" +
                    "Karty katalogowe i certyfikaty Smartline - 2019\\_PACZKA Karty katalogowe\\Karty katalogowe 08.07.19",
            "P:\\Narzędzia projektowe\\Elementy dokumentacji\\Systemy sygnalizacji, alarmu i detekcji\\" +
                    "Karty katalogowe i certyfikaty Ignis 1520M - 2019\\_PACZKA Karty katalogowe\\Karty katalogowe 08.07.19"
    };
    private final String[] controlCertificatesLinks = {
            "P:\\Narzędzia projektowe\\Elementy dokumentacji\\Systemy sygnalizacji, alarmu i detekcji\\" +
                    "Karty katalogowe i certyfikaty Smartline - 2019\\_PACZKA Certyfikaty\\Certyfikaty 08.07.19",
            "P:\\Narzędzia projektowe\\Elementy dokumentacji\\Systemy sygnalizacji, alarmu i detekcji\\" +
                    "Karty katalogowe i certyfikaty Ignis 1520M - 2019\\_PACZKA Certyfikaty\\Certyfikaty 08.07.19"
    };
    private final String defaultDataSheetLocation = "\\PW\\V. Karty katalogowe";
    private final String defaultCertificatesLocation = "\\PW\\VI. Certyfikaty";

    public String[] getControls() {
        return controls;
    }

    public String getDefaultPath() {
        return defaultPath;
    }

    public String getDefaultCalculatorLocation() {
        return defaultCalculatorLocation;
    }

    public String getTargetCalculatorPath() {
        return targetCalculatorPath;
    }

    public String[] getSystems() {
        return systems;
    }

    public String getSystemDataSheetLink(int linkNumber) {
        return systemDataSheetLinks[linkNumber];
    }

    public String getSystemCertyficatesLink(int linkNumber) {
        return systemCertificatesLinks[linkNumber];
    }

    public String getControlDataSheetLink(int linkNumber) {
        return controlDataSheetLinks[linkNumber];
    }

    public String getControlCertyficatesLink(int linkNumber) {
        return controlCertificatesLinks[linkNumber];
    }

    public String getDefaultDataSheetLocation() {
        return defaultDataSheetLocation;
    }

    public String getDefaultCertificatesLocation() {
        return defaultCertificatesLocation;
    }
}
