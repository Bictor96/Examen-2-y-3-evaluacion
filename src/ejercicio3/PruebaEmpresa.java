package ejercicio3;

import ejercicio2.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class PruebaEmpresa {

    // Arraylist para empleados y empresas
    ArrayList<Payable> payableArrayList = new ArrayList<>();
    LinkedList<Empleado> employeeList = new LinkedList<Empleado>();

    public PruebaEmpresa()
    {
        // ArrayList de Empresas y Empleados
        addMembersToPayableList();
        iterateOverPayableList();

        // LinkedList de Empleados
        addMembersToEmployeeList();
        sortEmployeeList();
        showEmployeeList();

        // Guardar ArrayList
        saveArrayListToFile(this.payableArrayList);

        // Guardar LinkedList
        saveLinkedList(this.employeeList);

    }

    private void showEmployeeList() {
        System.out.println("----- Lista de Empleados -------");
        for (Empleado e : this.employeeList) {
            System.out.println(e.toString());
        }
    }

    private void sortEmployeeList() {
        Collections.sort(this.employeeList);
    }

    private void addMembersToEmployeeList() {
        try {
            this.employeeList.add(new Asalariado("Juan", "Martinez", "11/11/2011", 500, 5432345, "Desarrollo"));
            this.employeeList.add(new Contratista("Maria", "Del Campo", "12/12/2012", 400,5434423, new LinkedList<>()));

            this.employeeList.add(new Asalariado("Paco", "Martinez", "11/11/2011", 500, 5432345, "Desarrollo"));
            this.employeeList.add(new Contratista("Alejandro", "Velasco", "12/12/2012", 400,5434423, new LinkedList<>()));

            this.employeeList.add(new Asalariado("Laura", "Garcia", "11/11/2011", 500, 5432345, "Desarrollo"));
            this.employeeList.add(new Contratista("Juan", "Fernandez", "12/12/2012", 400,5434423, new LinkedList<>()));

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void addMembersToPayableList(){
        try {

            this.payableArrayList.add(new EmpresaServicio("Fontanero Paco", "Fontaneria", 600, 43345));
            this.payableArrayList.add(new Asalariado("Juan", "Martinez", "11/11/2011", 500, 5432345, "Desarrollo"));
            this.payableArrayList.add(new Contratista("Maria", "Del Campo", "12/12/2012", 400,5434423, new LinkedList<>()));

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void iterateOverPayableList() {
        System.out.println("---- Lista de Empresas y Empleados ---- ");
        for (Payable p : this.payableArrayList) {
            System.out.println(p.toString());
        }
    }

    public void saveArrayListToFile(ArrayList array)
    {
        try {
            FileOutputStream fos = new FileOutputStream("array_list.txt");
            ObjectOutputStream out = new ObjectOutputStream(fos);

            out.writeObject(array);
            out.flush();
            out.close();

            System.out.println("ArrayList guardada a fichero array_list.txt con exito");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveLinkedList(LinkedList list)
    {
       try {
           FileOutputStream fout = new FileOutputStream("linked_list.txt");
           ObjectOutputStream out = new ObjectOutputStream(fout);

           out.writeObject(list);
           out.flush();
           out.close();

           System.out.println("LinkedList guardada a fichero linked_list.txt con exito");
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
    }

}
