package oop.money;

import java.util.Arrays;
import java.util.Objects;

public class Account {
   private final int DEFAULT_TRANSACTION_AMOUNT = 10;
   private int id;
   private Transaction[] transactions;
   private int lastTransaction;
    {
        transactions = new Transaction[DEFAULT_TRANSACTION_AMOUNT];
    }

    public Account(int id){
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public void sendMoney(Account accountTo,double moneyAmount){
        if(accountTo == null){
            return;
        }
        Transaction transaction = new Transaction(accountTo,this,moneyAmount,
                StandardAccountOperation.MONEY_TRANSFER_SEND);
        accountTo.receiveMoney(this,moneyAmount);
        addTransaction(transaction);

    }
    public void receiveMoney(Account accountFrom,double moneyAmount){
        if(accountFrom == null || moneyAmount ==0){
            return;
        }

        Transaction transaction = new Transaction(this,accountFrom,moneyAmount,
                StandardAccountOperation.MONEY_TRANSFER_RECEIVE);
        addTransaction(transaction);

    }
    public void withdraw(double moneyAmount){
        if(moneyAmount ==0){
            return ;
        }
        Transaction transaction = new Transaction(this,this,moneyAmount,
                StandardAccountOperation.WITHDRAW);
        addTransaction(transaction);

    }


    public void addTransaction(Transaction transaction){
        if(transaction == null){
            return;
        }

        if(transactions.length >= lastTransaction){
            transactions = Arrays.copyOf(transactions,transactions.length >> 1);
        }
        transactions[lastTransaction++] = transaction;

    }

    public Transaction[] getTransactions() {
       return Arrays.stream(transactions).filter(Objects::nonNull).toArray(Transaction[]::new);
    }

    public void setTransactions(Transaction[] transactions) {
        this.transactions = transactions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return DEFAULT_TRANSACTION_AMOUNT == account.DEFAULT_TRANSACTION_AMOUNT &&
                getId() == account.getId() && lastTransaction == account.lastTransaction &&
                Arrays.equals(getTransactions(), account.getTransactions());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(DEFAULT_TRANSACTION_AMOUNT, getId(), lastTransaction);
        result = 31 * result + Arrays.hashCode(getTransactions());
        return result;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                '}';
    }
}
class Transaction {
    Account accountTo;
    Account accountFrom;
    double moneyAmount;
    StandardAccountOperation operation;
    public Transaction(Account accountTo,Account accountFrom,double moneyAmount,StandardAccountOperation operation){
        this.accountTo = accountTo;
        this.accountFrom = accountFrom;
        this.moneyAmount =moneyAmount;
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "accountTo=" + accountTo +
                ", accountFrom=" + accountFrom +
                ", moneyAmount=" + moneyAmount +
                ", operation=" + operation +
                '}';
    }

    public Account getAccountTo() {
        return accountTo;
    }

    public void setAccountTo(Account accountTo) {
        this.accountTo = accountTo;
    }

    public Account getAccountFrom() {
        return accountFrom;
    }

    public void setAccountFrom(Account accountFrom) {
        this.accountFrom = accountFrom;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public StandardAccountOperation getOperation() {
        return operation;
    }

    public void setOperation(StandardAccountOperation operation) {
        this.operation = operation;
    }
}