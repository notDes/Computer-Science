class Main{
    // tester
    public static void main(String[] args)
      {
        CashRegister foo = new CashRegister();
        foo.recordPurchase(19.99);
        foo.receivePayment(25.00);
        System.out.println("Expected 1");
        System.out.println(foo.getItemCount()); // Expected 1
        System.out.println("Expected 5.01");
        System.out.println(foo.giveChange()); // Expected 5.01
        System.out.println("Expected 0");
        System.out.println(foo.getItemCount()); // Expected 0
        foo.recordTaxablePurchase(19.99);
        foo.receivePayment(25.00);
        System.out.println("Expected 1");
        System.out.println(foo.getItemCount()); // Expected 1
        System.out.println("Expected 3.51");
        System.out.println(foo.giveChange()); // Expected 3.51
        System.out.println("Expected 0");
        System.out.println(foo.getItemCount()); // Expected 0
      }
    }
  }