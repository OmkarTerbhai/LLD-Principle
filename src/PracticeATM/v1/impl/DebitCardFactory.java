package PracticeATM.v1.impl;

import PracticeATM.v1.Card;
import PracticeATM.v1.RuPayCreditCard;
import PracticeATM.v1.VisaDebitCard;

public class DebitCardFactory {
    public static Card getCard(String vendor) {
        if("Visa".equals(vendor)) {
            return new VisaDebitCard();
        }
        return null;
    }
}
