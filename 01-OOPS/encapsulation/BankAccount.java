 class Money
{
    private int balance = 0;
    public void deposit(int amount)
    {
        if (amount>0)
        {
            balance  = balance + amount;
        }
        else
        {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(int amount)
    {
        if (amount>0 && amount <= balance)
        {
            balance  = balance - amount;
        }
        else
        {
            System.out.println("Invalid amount");
        }
    }
    public int myBalance()
    {
        return balance;
    }


}
    public class BankAccount
    {
    public static void main(String[] args)
    {
        Money account = new Money();
        account.deposit(1000);
        account.withdraw(400);
        System.out.println("Final balance : " + account.myBalance());
        
    }

}