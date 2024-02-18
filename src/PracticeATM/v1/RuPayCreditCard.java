package PracticeATM.v1;

public class RuPayCreditCard implements CreditCard{
    @Override
    public int getAnnualFeeCharges() {
        return 10;
    }

    @Override
    public boolean isPinChangeable() {
        return false;
    }

    @Override
    public int getCharges() {
        return getAnnualFeeCharges();
    }
}
