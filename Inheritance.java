import java.util.ArrayList;

/**
 * Inheritance
 */
public class Inheritance {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(3.0);
        SavingsAccount savingsAccount = new SavingsAccount(2.1);
        savingsAccount.deposit(500);
        savingsAccount.withdraw(10);
        System.out.println(savingsAccount.getBalance());

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Liam"));
        students.add(new Student("Clay"));
        students.add(new Student("Mak"));

        students.sort(new StudentComp());

        for (Student student : students) {
        System.out.println(student.GetName());
        }
    }

}