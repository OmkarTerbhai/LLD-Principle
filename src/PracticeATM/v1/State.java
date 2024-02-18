package PracticeATM.v1;

public interface State {
    public void init();

    public void cancelTxn();

    public void nextState();
}
