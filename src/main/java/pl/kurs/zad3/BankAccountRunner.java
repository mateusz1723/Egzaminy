package pl.kurs.zad3;

public class BankAccountRunner {
    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount("Pawel.Nowak", "ING Bank Slaski", "09249010440000320094007370", "90031716144", 2);
        BankAccount bankAccount2 = new BankAccount("Andrzej.Kowalski", "Santander", "09252235325235252352552445", "92131746144", 2.5);

        System.out.println(bankAccount1);
        System.out.println(bankAccount2);
        System.out.println();

        bankAccount1.cashDeposit(25000);
        bankAccount1.cashPayout(4000);
        bankAccount1.cashTransfer(bankAccount2, 7000);

        bankAccount1.printOperationsHistory();
        System.out.println();
        System.out.println(bankAccount1);
        System.out.println(bankAccount2);


    }
}
