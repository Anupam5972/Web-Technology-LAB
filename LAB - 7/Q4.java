// 4. Write a Program in java to implement banking system with a class Account having data members Accno, AccHolderName,Account_type(saving/current), balance and perform following operations. 
// A. Display Account Holder details
// B. Deposit the amount
// C. Withdraw the amount. 
// D. Search the Account Holder and display his details

import java.util.Scanner;

class Account {
    String Accno;
    String AccHoldername;
    String Account_Type;
    long balance;
    Scanner sc = new Scanner(System.in);

    public void openAccount() {
        System.out.print("Enter Account No: ");
        Accno = sc.next();
        System.out.print("Enter Account type: ");
        Account_Type = sc.next();
        System.out.print("Enter Name: ");
        AccHoldername = sc.next();
        System.out.print("Enter Balance: ");
        balance = sc.nextLong();
    }

    public void showAccount() {
        System.out.println("Name of account holder: " + AccHoldername);
        System.out.println("Account no.: " + Accno);
        System.out.println("Account type: " + Account_Type);
        System.out.println("Balance: " + balance);
    }

    public void deposit() {
        long amt;
        System.out.println("Enter the amount you want to deposit: ");
        amt = sc.nextLong();
        balance = balance + amt;
    }

    public void withdrawal() {
        long amt;
        System.out.println("Enter the amount you want to withdraw: ");
        amt = sc.nextLong();
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!");
        }
    }

    public boolean search(String ac_no) {
        if (Accno.equals(ac_no)) {
            showAccount();
            return (true);
        }
        return (false);
    }
}

public class Q4 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Customers to be Entered: ");
        int n = sc.nextInt();
        Account C[] = new Account[n];
        for (int i = 0; i < C.length; i++) {
            C[i] = new Account();
            C[i].openAccount();
        }

        int ch;
        do {
            System.out.println("\n1. Display all account details \n2. Search by Account number\n3. Deposit the amount \n4. Withdraw the amount \n5.Exit ");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    for (int i = 0; i < C.length; i++) {
                        C[i].showAccount();
                    }
                    break;
                case 2:
                    System.out.print("Enter account no. you want to search: ");
                    String ac_no = sc.next();
                    boolean found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 3:
                    System.out.print("Enter Account no. : ");
                    ac_no = sc.next();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            C[i].deposit();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 4:
                    System.out.print("Enter Account No : ");
                    ac_no = sc.next();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            C[i].withdrawal();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 5:
                    System.out.println("Exited");
                    break;
            }
        } while (ch != 5);
    }
}