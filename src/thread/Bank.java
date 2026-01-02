package thread;

class BankAccount {
    private int balance = 1000;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited amount " + amount + "current balance " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw amount " + amount + "current balance " + balance);
        } else {
            System.out.println("Insufficient balance " + balance);
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class Bank {

    public static void main(String[] args) {
        BankAccount bank = new BankAccount();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                bank.deposit(100);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }

        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                bank.withdraw(300);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("System current balance " + bank.getBalance());
    }
}
