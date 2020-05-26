package ejercicio2;

import java.util.Set;

public class SociedadAnonima {
    private String Name;
    private Set<String> TrabajosPermitidos;

    public SociedadAnonima(String Name, Set<String> TrabajosPermitidos) {
        this.Name = Name;
        this.TrabajosPermitidos = TrabajosPermitidos;
    }

    public String getName() {
        return this.Name;
    }

    public Set<String> getTrabajosPermitidos() {
        return this.TrabajosPermitidos;
    }

    public void añadirTrabajoPermitido(String trabajo) {
        try {
            TrabajosPermitidos.add(trabajo);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void eliminarTrabajoPermitido(String trabajo) {
        try {
            TrabajosPermitidos.remove(trabajo);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    @Override
    public String toString() {
        return "Empresa: " + this.Name + " Trabajos: " + this.TrabajosPermitidos.size();
    }
}
