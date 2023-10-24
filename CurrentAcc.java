package com.amdocs.bank;

public class CurrentAcc extends BankAcc {
	private double penality;
	public CurrentAcc(String acc_Id,double cur_bal)
	{
		super(acc_Id,cur_bal);
	}
	

	@Override
	public void withDraw(double amount) {
		// TODO Auto-generated method stub
		if(amount>0 && cur_bal>=amount+200)
		{
			super.withDraw(amount);
			double fee=amount+200;
			System.out.println("withdrawn from current account : INR " + fee + " Including INR 200 "
					+ "Withdrawl fee");
			
			
		}
		else
		{
			System.out.println("Invalid Withdrawl or Insufficient Balance");
		}
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		super.deposit(amount);
	}

	@Override
	public double CheckBal() {
		// TODO Auto-generated method stub
		cur_bal=cur_bal-200;
		return super.CheckBal();
	}
	

}
