package PracticeATM.v1.impl;

import PracticeATM.v1.Card;
import PracticeATM.v1.RuPayCreditCard;
import PracticeATM.v1.VisaDebitCard;

public class CreditCardFactory {
    public static Card getCard(String vendor) {
        if("RuPay".equals(vendor)) {
            return new RuPayCreditCard();
        }
        return null;
    }
}
