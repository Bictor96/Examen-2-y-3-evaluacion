package ejercicio2;

import java.io.Serializable;
import java.util.Calendar;

public class EmpresaServicio implements Payable, Serializable {
    private String Name;
    private String Job;
    private int MonthlyBill;
    private int BankAccount;

    public EmpresaServicio(String Name, String Job, int Bill, int Account) throws ImporteMensualException    {
        this.Name = Name;
        this.Job = Job;

        this.setMonthlyBill(Bill);
        this.BankAccount = Account;
    }

    public void setMonthlyBill(int monthlyBill) throws ImporteMensualException {

        if (monthlyBill < 0 ) {
            throw  new ImporteMensualException("El importe mensual de la empresa no puede ser negativo.");
        }
        MonthlyBill = monthlyBill;
    }

    public void setBankAccount(int bankAccount) {
        BankAccount = bankAccount;
    }

    public String getName() {
        return Name;
    }

    public String getJob() {
        return Job;
    }

    public int getMonthlyBill() {
        return MonthlyBill;
    }

    public int getBankAccount() {
        return BankAccount;
    }

    @Override
    public void pay() {
        System.out.println("[EMPRESA]" + "Importe Transferencia: " + this.MonthlyBill + "Fecha: " + Calendar.getInstance()
                + "\n Transferencia realizada con exito.");
    }

    @Override
    public String toString() {
        return "Empresa: " + this.Name + " Servicio: " +this.Job + " Factura: " + this.MonthlyBill;
    }
}
