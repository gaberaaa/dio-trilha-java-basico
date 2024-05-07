package Entities;

public class UserData {
	
	public int accountNumber;
	public String accountAgency;
	public String accountHolder;
	public double accountBalance;
	
	public int accNumber() {
		return accountNumber;
	}
	
	public String accAgency(){
		return accountAgency;
	}
	
	public String accHolder() {
		return accountHolder;
	}
	
	public double accBalance() {
		return accountBalance;
	}
	
	public String toString() {
		return "Olá "+
				accountHolder +
				", Obrigado por realizar um depósito em nosso banco, sua agência é " +
				accountAgency +
				", conta " + 
				accountNumber +
				" e seu saldo de $" +
				String.format("%.2f",accountBalance) +
				" já está disponível para uso.";
	}
	

}
