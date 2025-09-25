import java.util.Scanner;

public class BankAccountMenu {
    public static void main(String[] args) {
        // TODO: Implement the bank account menu
        // 1. Create a double variable for balance
        // 2. Create a while loop for the menu
        // 3. Display the menu options
        // 4. Use Scanner to read user input
        // 5. Use switch statement to handle menu choices
        // 6. Implement add money, withdraw money, check balance, and exit functionality
        double balance = 0.0, amount;
        boolean run;
        int choice;
        run = true;
        Scanner sc = new Scanner(System.in);

        while (run)
        {
            System.out.println ("--- Bank Account Menu ---");
            System.out.println ("1. Add Money");
            System.out.println ("2. Withdraw Money");
            System.out.println ("3. Check Balance");
            System.out.println ("4. Exit");
            System.out.println ();
            System.out.print ("Enter Choice:  ");
            choice = sc.nextInt ();
            System.out.println ();
            switch (choice)
            {
                case 1:
                    System.out.print ("Enter amount to add:  ");
                    amount = sc.nextDouble ();
                    if (amount > 0)
                    {
                        balance += amount;
                        System.out.println ("New balance: $" + balance);
                        System.out.println ();
                    }
                    else
                    {
                        System.out.println ("error");
                        System.out.println ();
                    }
                    break;
                case 2:
                    System.out.print ("Enter amount to withdraw:  ");
                    amount = sc.nextDouble ();
                    if (amount > 0 && amount <= balance)
                    {
                        balance -= amount;
                        System.out.println ("New balance: $" + balance);
                        System.out.println ();
                    }
                    else
                    {
                        System.out.println ("Insufficient funds");
                        System.out.println ();
                    }
                    break;
                case 3:
                    System.out.println ("Your balance is $" + balance);
                    System.out.println ();
                    break;
                case 4:
                    System.out.println ("Goodbye!");
                    System.out.println ();
                    run = false;
                    break;
            }
        }
    }
}