package com.fixityTech;

public class Statement {
	
	int accountId;
	String name;
	double accountBalance;
	Transaction transactions[];
	
	void setAccountId(int accountId)
	{
	this.accountId=accountId;
	}



	int getAccountId()
	{
	return accountId;
	}
	void setName(String name)
	{
	this.name=name;
	}

	String getName()
	{
	return name;
	}



	void setAccountBalance(double accountBalance)
	{
	this.accountBalance=accountBalance;
	}
	double getAccountBalance()
	{
	return accountBalance;
	}



	void setTransactions(Transaction transactions[])
	{
	this.transactions=transactions;
	}



	Transaction[] getTransactions()
	{
	return transactions;
	}

	

}//class
