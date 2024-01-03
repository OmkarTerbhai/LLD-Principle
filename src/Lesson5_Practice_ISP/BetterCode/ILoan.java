package Lesson5_Practice_ISP.BetterCode;

import Lesson5_Practice_ISP.ProblematicCode.Account;

public interface ILoan extends IAccount {
    public void payEMI();

}
