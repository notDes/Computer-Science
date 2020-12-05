/**
  A cash register totals up sales and computes change due.
*/
public class CashRegister
{
  // private instance variables go here
  private int numberOfItems;
  private double runningTotal;
  private double taxRate;
  private double purchase;



  
  
  /**
    Constructs a cash register with no money in it.
  */
  public CashRegister()
  {  
    this.taxRate = 0.075; // The combined sales tax rate for Hilliard, OH is 7.5%. This is the total of state, county and city sales tax rates.
  
    //variable for number of items purchased
    this.numberOfItems = 0;
    
  
    //variable for the "running total" due
    this.runningTotal = 0;
    //
  }
  
  
  /**
    recordPurchase(double amount)
    Records the sale of a NON-TAX item.
    Adds the price of the item to the running total due.
    @param amount the price of the item
  */
  public void recordPurchase(double amount)
  {
    this.runningTotal = runningTotal + amount;
    numberOfItems++;
  }
  
  
  /**
    recordTaxablePurchase(double amount)
    Records the sale of a TAXED item.
    Use getItemTax() to calculate the tax for this purchase.
    Then, add the price of the item to the running total due.
    @param amount the price of the item
  */
  public void recordTaxablePurchase(double amount)
  {
    runningTotal = amount + (amount * taxRate);
    numberOfItems++;
  }
  
  
  /**
    receivePayment(double amount)
    Processes a payment received from the customer.
    @param amount the amount of the payment
  */
  public void receivePayment(double amount)
  {
    purchase = purchase + amount;
  }
  
  
  /**
    giveChange()
    Computes the change due and resets the machine for the next customer.
    @return the change due to the customer
  */
  public double giveChange()
  {
    double change = purchase - runningTotal;
    numberOfItems = 0;
    runningTotal = 0;
    purchase = 0;
    return change;
  }
  
  
  /**
    getItemCount()
    Returns number of items purchased.
    @return the number of items purchased
  */
  public int getItemCount()
  {
    return numberOfItems;
  }
  
  
  /**
    getItemTax(double itemAmount)
    Calculates the total tax collected during recordTaxablePurchase()
    Calculate the amount of tax for this item by multiplying itemAmount and the taxrate instance variable
    @param itemAmount the pretax price for this item
    @return the total tax for this item
  */
  private double getItemTax(double itemAmount)
  {
    return itemAmount * taxRate;
  }   
}