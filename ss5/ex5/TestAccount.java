package ss5.ex5;

public class TestAccount {

    public static void main(String[] args) {
        Account acc1 = new Account(555);
        System.out.println(acc1);
        Account acc2 = new Account(1234,4431);

        //test getters
        System.out.println("Account Number is: " + acc2.getNumber());
        System.out.println("The Balance is: " + acc2.getBalance());

        //test credit(),debit() and transferTo()
        acc1.credit(11.1);
        System.out.println(acc1);
        acc1.debit(5.5);
        System.out.println(acc1);
        acc1.debit(500);
        System.out.println(acc1);

    }
}
