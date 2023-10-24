package com.amdocs.bank;

public class BankAcc {
	protected String acc_Id;
	protected double cur_bal;
	public BankAcc(String acc_Id,double cur_bal)
	{
		this.acc_Id=acc_Id;
		this.cur_bal=cur_bal;
	}
	public void deposit(double amount)
	{
		if(amount>0)
		{
			cur_bal  += amount;
			System.out.println("Deposited: INR " +amount );
		}
	else 
		{
			System.out.println("Invalid Deposit amount");
		}
	}
	public void withDraw(double amount)
	{
		if(amount>0 && cur_bal>=amount)
		{
			cur_bal -= amount;
		System.out.println("Withdrawn: INR " +amount );
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
	public double CheckBal()
	{
		double amount = 0;
		double interest= amount*0.03;
		return cur_bal+ interest;
	}
	public void Transfer(BankAcc targetAcc,double amount)
	{
	if(amount<=this.cur_bal)
	{
			this.withDraw(amount);
		targetAcc.deposit(amount);
		System.out.println("Transfered INR " + amount +" To " + targetAcc.getacc_Id()+"\n");
	}
	else
		{
		System.out.println("Invalid Transfer or Insufficient Balance");
		}
	}
	public String getacc_Id()
	{
		return acc_Id;
	}
}
