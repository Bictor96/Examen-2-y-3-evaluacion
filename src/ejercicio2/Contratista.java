package ejercicio2;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.Set;

public class Contratista extends Empleado implements Payable{

    private LinkedList<SociedadAnonima> Sociedades;

    public Contratista(String Name, String Surname, String HireDate, int Salary, int BankAccount, LinkedList<SociedadAnonima> Sociedades) throws SalaryException {
        super(Name, Surname, HireDate, Salary, BankAccount);

        this.Sociedades = Sociedades;
    }

    public void añadirSociedad(String Name, Set<String> TrabajosPermitidos) {
        this.Sociedades.add(new SociedadAnonima(Name, TrabajosPermitidos));
    }

    public void eliminarSociedad(String Name, String SocietyName) {
        for (int i = 0; i < this.Sociedades.size(); i++)
        {
            if (this.Sociedades.get(i).getName() == SocietyName) {
                this.Sociedades.remove(i);
            }
        }
    }

    @Override
    public void pay() {
        System.out.println("[CONTRATISTA]" + "Importe Transferencia: " + this.getSalary() + "Fecha: " + Calendar.getInstance()
                + "\n Transferencia realizada con exito.");
    }

    @Override
    public String toString() {
        return "[CONTRATISTA] " + super.toString() + " Sociedades: " + Sociedades.size();
    }
}
