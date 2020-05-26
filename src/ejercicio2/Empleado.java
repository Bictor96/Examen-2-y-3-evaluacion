package ejercicio2;

import java.io.Serializable;
import java.util.Calendar;
import java.util.EnumMap;

public class Empleado implements IEmpleado, Comparable, Serializable {

    private String Name;
    private String Surname;
    private String HireDate;
    private int Salary;
    private int BankAccount;

    public Empleado(String Name, String Surname, String HireDate, int Salary, int BankAccount)
        throws SalaryException {

        this.Name= Name;
        this.Surname = Surname;
        this.HireDate = HireDate;
        this.BankAccount = BankAccount;
        this.setSalary(Salary);

    }

    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public String getSurname() {
        return this.Surname;
    }

    @Override
    public String getHireDate() {
        return this.HireDate;
    }

    @Override
    public int getSalary() {
        return this.Salary;
    }

    @Override
    public int getBankAccount() {
        return this.BankAccount;
    }

    @Override
    public void setSalary(int newSalary) throws SalaryException{

        if (newSalary < 0 )
            throw new SalaryException("No se puede guardar un salario negativo.");

        this.Salary = newSalary;
    }

    @Override
    public void setBankAccount(int newAccount) {
        this.BankAccount = newAccount;
    }

    @Override
    public String toString() {
        return this.Name + " " + this.Surname + "  Fecha de Contratación: " + this.HireDate.toString()
                + " Salario: " + this.Salary + " Nº Cuenta: " + this.BankAccount;
    }

    @Override
    public int compareTo(Object o) {
        Empleado e = (Empleado) o;
        int result = this.Surname.compareTo(e.getSurname());
        return result == 0? this.Name.compareTo(e.getName()) : result;
    }
}
