package pl.kuba.app.logic;

public class ExecuteThread extends Thread {

    public void run(){
        new CreatorLogic().execute();
    }

}
