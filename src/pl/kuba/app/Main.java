package pl.kuba.app;


public class Main {
    public static void main(String[] args) {

        CreatorLogic logic = new CreatorLogic("C:/Users/jakub.koziol/Desktop");
        logic.setOrderName("4321_RE_Klient_Inwestycja_Rodzaj");
        logic.execute();

    }
}
