package com.fixityTech;

class Account
{
int id;
String name;
double balance;

static int generateID=1001;

public static int getGenerateID() {
	return generateID++;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public Transaction deposit(double amount)
{
balance=balance+amount;
Transaction transaction=new Transaction();
  transaction.setTransactionId(transaction.generatorId());
  transaction.setAccountId(id);
   transaction.setAmount(amount);
   transaction.setType(1);
   transaction.setStatus(0);



return transaction;
}
public Transaction withDrawl(double amount)
{
Transaction transaction=new Transaction();
  transaction.setTransactionId(transaction.generatorId());
  transaction.setAccountId(id);
   transaction.setAmount(amount);
   transaction.setType(1);
if(balance-amount>=0)
{
balance=balance-amount;
transaction.setStatus(0);
}
else
   transaction.setStatus(1);
return transaction;
}
}