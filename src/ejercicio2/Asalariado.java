package ejercicio2;

import java.util.Calendar;

public class Asalariado extends Empleado implements Payable {
    private String Departament;

    public Asalariado(String Name, String Surname, String HireDate, int Salary, int BankAccount, String Department) throws SalaryException {
        super(Name, Surname, HireDate, Salary, BankAccount);

        this.Departament = Department;
    }

    public String getDepartament()
    {
        return this.Departament;
    }

    @Override
    public String toString() {
        return "Asalariado: " + super.toString() + " Departamento: " + this.Departament;
    }

    @Override
    public void pay() {
        System.out.println("[ASALARIADO]" + "Importe Transferencia: " + this.getSalary() + "Fecha: " + Calendar.getInstance()
            + " Transferencia realizada con exito.");
    }
}
