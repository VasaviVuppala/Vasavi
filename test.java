package com.amdocs.bank;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BankAcc savAcc=new SavingsAcc("SAV001",0,0.03);
      BankAcc curAcc=new CurrentAcc("CUR001",0);
      savAcc.deposit(1000);
      savAcc.withDraw(500);
      System.out.println("Savings Account Balance : INR " +savAcc.CheckBal()+"\n");
      System.out.println("Transferring from Savings Account to Current Account");
      savAcc.Transfer(curAcc, 500);
      
      curAcc.deposit(1500);
      curAcc.withDraw(400);
      System.out.println("Current Account Balance : INR " +curAcc.CheckBal()+"\n");
      //System.out.println("Savings Account Balance : INR " +savAcc.Transfer("CUR001", 0));
      System.out.println("Transferring from Current Account to Savings Account");
      curAcc.Transfer(savAcc, 600);
	}
	
	

}
 