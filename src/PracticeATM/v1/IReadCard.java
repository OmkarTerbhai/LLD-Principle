package PracticeATM.v1;

public interface IReadCard extends State{
    public void readCardDetails();

    public void validateCardDetails();
}
