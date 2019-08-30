package IG.Adapter;

public interface IBankAccount {
 void accountTransfer(IBankAccount account, double amount);
 void deposit(double amount);
}
