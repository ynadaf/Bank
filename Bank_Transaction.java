 class Bank_Transaction {
   String account_name;
   String accountholder_name;
   String account_type;
   String account_number;
   double balance;

   public Bank_Transaction(String var1, String var2, String var3, String var4, double var5) {
      this.account_name = var1;
      this.accountholder_name = var2;
      this.account_type = var3;
      this.account_number = var4;
      this.balance = var5;
   }

   public void displaytransaction() {
      System.out.println("Account Name: " + this.account_name);
      System.out.println("Account Holder: " + this.accountholder_name);
      System.out.println("Account Type: " + this.account_type);
      System.out.println("Account Number: " + this.account_number);
      System.out.println("Balance: " + this.balance);
   }

   public static void main(String[] var0) {
      Bank_Customer var1 = new Bank_Customer("saniya", "01FE24", "Dharwad");
      Bank_Transaction var2 = new Bank_Transaction("SBI", "saniya", "Saving", "SB123456789", 1000.0);
      var1.displayCustomer();
      var2.displaytransaction();
}
}