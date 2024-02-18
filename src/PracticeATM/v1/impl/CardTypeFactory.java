package PracticeATM.v1.impl;

import PracticeATM.v1.Card;
import PracticeATM.v1.CardType;
import PracticeATM.v1.VisaDebitCard;

public class CardTypeFactory {
    public static Card getCard(String cardProvider, CardType type) {
        if(CardType.CREDIT.equals(type)) {
            return CreditCardFactory.getCard(cardProvider);
        }
        else if(CardType.DEBIT.equals(type)) {
            return DebitCardFactory.getCard(cardProvider);
        }
        return null;
    }
}
