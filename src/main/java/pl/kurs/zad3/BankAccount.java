package pl.kurs.zad3;

import java.util.Arrays;

public class BankAccount {

    private String name;
    private String bankName;
    private String number;
    private String pesel;
    private double interestRate;
    private double cash;
    private String[] operationsHistory = new String[100];
    private int transactionsCounter;

    public BankAccount(String name, String bankName, String number, String pesel, double interestRate) {
        this.name = name;
        this.bankName = bankName;
        this.number = number;
        this.pesel = pesel;
        this.interestRate = interestRate;

    }


    public void cashDeposit(double cashDeposit){

        cash = cash + cashDeposit;
        if(transactionsCounter < operationsHistory.length)
        operationsHistory[transactionsCounter++] = transactionsCounter + ". Dnia 25-06-2022 wykonano operacje wplata na kwote " + cashDeposit ;

    }

    public void cashPayout(double cashPayout){

        if (cash < cashPayout) {
            System.out.println("Nie masz " + cashPayout + " aby wyplacic z banku");
        }else {
            cash = cash - cashPayout;
            if(transactionsCounter < operationsHistory.length)
            operationsHistory[transactionsCounter++] = transactionsCounter + ". Dnia 25-06-2022 wykonano operacje wyplata na kwote " + cashPayout;
        }
     }

     public void cashTransfer(BankAccount bankAccount , double cashTransfer){
        if(cashTransfer > cash){
            System.out.println("Transakcja niemozliwa , brak srodkow na koncie");
        }else {
            cash = cash - cashTransfer;
            bankAccount.cash = bankAccount.cash + cashTransfer;
            if(transactionsCounter < operationsHistory.length)
            operationsHistory[transactionsCounter++] = transactionsCounter + ". Dnia 25-06-2022 wykonano operacje przelew na kwote " + cashTransfer;

        }
     }

     public void printOperationsHistory(){

         for (int i = 0; i < operationsHistory.length; i++) {
             if((operationsHistory[i]) == null)
                 break;
             else
                 System.out.println(operationsHistory[i]);
         }

     }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", bankName='" + bankName + '\'' +
                ", number='" + number + '\'' +
                ", pesel='" + pesel + '\'' +
                ", interestRate=" + interestRate +
                ", cash=" + cash +
                '}';
    }
}
