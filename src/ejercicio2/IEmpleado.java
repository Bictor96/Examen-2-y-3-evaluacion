package ejercicio2;

import java.util.Calendar;

public interface IEmpleado {
    String getName();
    String getSurname();
    String getHireDate();
    int getSalary();
    int getBankAccount();

    void setSalary(int newSalary) throws SalaryException;
    void setBankAccount(int newAccount);
}
