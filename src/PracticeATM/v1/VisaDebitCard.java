package PracticeATM.v1;

public class VisaDebitCard implements DebitCard{
    @Override
    public int getOtherBankATMCharges() {
        return 10;
    }

    @Override
    public boolean isPinChangeable() {
        return true;
    }

    @Override
    public int getCharges() {
        return getOtherBankATMCharges();
    }
}
