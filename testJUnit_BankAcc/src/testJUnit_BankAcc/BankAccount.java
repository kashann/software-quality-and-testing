package testJUnit_BankAcc;

/*
Fiind dat codul din clasa BankAccount, sa se implmenenteze un sistem 
de testare automata, bazat pe JUnit, care sa verifice urmatoarele conditii:
- la retragerea unei sume de bani nu se accepta sume mai mari decat limita 
stabilita pentru cont sau mai mari decat valoarea curenta a soldului
- la retragerea unei sume de bani nu sunt accepate valori aberante
- la depunere nu sunt acceptate valori aberante

Testul trebuie sa permita integrarea acestuia intr-un set mai mare (Test Suite) de teste

Pregatirea sesiunii de testare presupune utilizarea unor fisiere de test din care
 sa fie preluate valorile de intrare si cele asteptate. 
*/

public class BankAccount {
	double balance;
	double limit;
	double lowestBalance;
	
	public BankAccount(double b, double l, double lb){
		balance=b;
		limit=l;
		lowestBalance=lb;
	}
	
	//Retrage bani
	public void withdraw(double amount) throws ExceptionWithdrawal{
		if(amount <= limit && amount <= getBalance() - lowestBalance && amount >= 10)
			balance = balance - amount;
		else
			throw new ExceptionWithdrawal();
	}
	
	//Depozit
	public void deposit(double amount) throws ExceptionDeposit{
		if(amount > 0 && amount < Double.MAX_VALUE - getBalance())
			balance = balance + amount;
		else
			throw new ExceptionDeposit();
	}
	
	//Get the value of balance
	public double getBalance(){
		return balance;
	}
}