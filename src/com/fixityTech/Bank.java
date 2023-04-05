package com.fixityTech;
public class Bank {
	
    Account accounts[]=new Account[1000];
    Transaction transactions[]=new Transaction[1000];
    int noOfAccounts;
    int noOfTransactions;
  public Account openAccount(String name,double amt)
   {
	   if(noOfAccounts<1000)
	   {
	   Account account=new Account();
	   account.setId(Account.getGenerateID());
	   account.setName(name);
	   account.deposit(amt);
	   
	   accounts[noOfAccounts++]=account;
	 return account;  
	   }
	    return null;
   }
  
  Account getAccount(int id)
  {
	  for(int i=0;i<noOfAccounts;i++)
		  if(accounts[i].getId()==id)
			  return accounts[i];
	  return null;
 }
  
  Account[] getAccounts()
  {
	  Account accounts[]=new Account[noOfAccounts];
	  for(int i=0;i<noOfAccounts;i++)
		accounts[i]=this.accounts[i];
	 return accounts; 
  }
  
  public Transaction deposit(int acid,double amt )
  {
	  Account account=getAccount(acid);
	  if(account!=null)
	  {
		Transaction transaction=account.deposit(amt);
		if(noOfAccounts<1000)
			transactions[noOfTransactions++]=transaction;
		return transaction;
	  }
	  else
		  return null;
  }
  
  public Transaction withDrawl(int acid,double amt )
  {
	  Account account=getAccount(acid);
	  if(account!=null)
	  {
		Transaction transaction=account.withDrawl(amt);
		if(noOfAccounts<1000)
			transactions[noOfTransactions++]=transaction;
		return transaction;
	  }
	  else
		  return null;
  }
  
  
  int getTransactionsCount(int id)
  {
  int count=0;
    for(int i=0;i<noOfTransactions;i++)
       if(transactions[i].getAccountId()==id)
         count++;
  return count;
  }
  
  
  Statement getMiniStatement(int id)
  {
    Account acc=getAccount(id);
  if(acc!=null)
  {
    Statement st=new Statement();
    st.setAccountBalance(acc.getBalance());
    st.setName(acc.getName());
    st.setAccountId(id);
   int nt=getTransactionsCount(id);
  if(nt>10)
        nt=10;
  Transaction tss[]=new Transaction[nt];
  for(int i=0,j=0;j<nt && i<noOfTransactions;i++)
     if(transactions[i].getAccountId()==id)
         tss[j++]=transactions[i];
   st.setTransactions(tss);
  return st;
  }
  return null;
  }
  
  Statement getDetailedStatement(int id)
  {
    Account acc=getAccount(id);
  if(acc!=null)
  {
    Statement st=new Statement();
    st.setAccountBalance(acc.getBalance());
    st.setName(acc.getName());
    st.setAccountId(id);
   int nt=getTransactionsCount(id);
  Transaction tss[]=new Transaction[nt];
  for(int i=0,j=0;j<nt && i<noOfTransactions;i++)
     if(transactions[i].getAccountId()==id)
         tss[j++]=transactions[i];
   st.setTransactions(tss);
  return st;
  }
  return null;
  }


  
  
}//class
