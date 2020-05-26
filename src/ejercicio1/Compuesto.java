package ejercicio1;

public class Compuesto implements  Comparable {
    private String Nombre;
    private String Formula;

    public Compuesto(String nombre, String formula) {
        Nombre = nombre;
        Formula = formula;
    }


    @Override
    public int compareTo(Object o) {
        Compuesto c = (Compuesto) o;
        int result = this.Nombre.compareTo(c.Nombre);
        return result == 0? this.Formula.compareTo(c.Formula) : result;
    }

    @Override
    public String toString() {
        return this.Nombre + " - " + this.Formula;
    }
}
