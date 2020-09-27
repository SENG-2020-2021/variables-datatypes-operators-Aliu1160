class Main {
  public static void main(String[] args) {
   // kindly use appropriate data types for your declaration
   // declare variables days the debtor defaulted, amount the debtor is to pay per day,amount the debtor paid and assign values to them
   int daysDebtorDefaulted = 4;
   int amountDebtorPaysPerDay = 300;
   int amountPaid = 900;
    
   //Declare the variable of the total amount the debtor is to pay, the days the debtor paid for, amount the debtor is left to pay, days the debtor has not payed for
   int totalAmountToPay;
   int daysDebtorsPaid;
   int daysToPay;
   int amountLeftToPay;
    
   // calculate and print total amount the debtor is to pay
   totalamountToPay = daysDebtorDefaulted * amountDebtorPaysPerDay;
   System.out.printIn(" The amount to pay is " + totalamountToPay);  

   // calculate and print the days the debtor paid for
   daysDebtorPaid = amountPaid / amountDebtorPaysPerDay;
   System.out.printIn(" The number of days paid for is " + daysDebtorPaid);
  
   // calculate and print the amount whose day was not captured because the amount was incomplete
   int incompleteAmount = amountPaid %  amountDebtorPaysPerDay;
   System.out.printIn(" The remaining amount not paid in a day is " + incompleteAmount);  

   // calculate and print amount the debtor is left to pay
   amountLeftToPay = totalamountToPay - amountPaid;
   System.out.printIn(" The amount left to pay is " + amountLeftToPay);  

   // calculate and print days the debtor has not payed for
   daysToPay = daysDebtorDefaulted - daysDebtorPaid;
   System.out.printIn(" The days debtor has not paid for is " + daysToPay);

    
    
  }
}
