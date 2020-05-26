package ejercicio1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Ejercicio1 {
    private static String FILENAME = "/src/compuestos.txt";

    private LinkedList<Compuesto> listaCompuestos;
    public Ejercicio1()
    {
        // Cargar Compuestos
        listaCompuestos = new LinkedList<Compuesto>();
        cargarCompuestos();
        Collections.sort(listaCompuestos);

        // Iterar sobre compuestos
        simpleForIteration();
        iteratorIteration();
        advancedForLoop();

        // Elementos unicos
    }

    public void cargarCompuestos()
    {
        try {
            String path = System.getProperty("user.dir");
            List<String> lines = Files.readAllLines(Paths.get(path + FILENAME));
            for (String line : lines ) {
                String[] partes = line.split(":");
                listaCompuestos.add(new Compuesto(partes[0], partes[1]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void simpleForIteration() {
        System.out.println(" ---- BUCLE FOR ----- ");
        for (int i = 0; i < this.listaCompuestos.size(); i++) {
            System.out.println(this.listaCompuestos.get(i).toString());
        }
    }

    private void iteratorIteration() {
        System.out.println(" ---- ITERATOR ----- ");
        Iterator i = this.listaCompuestos.iterator();

        while (i.hasNext()) {
            System.out.println(i.next().toString());
        }
    }

    private void advancedForLoop()
    {
        System.out.println(" ---- FOR MODERNO ----- ");
        for (Compuesto c : this.listaCompuestos)
        {
            System.out.println(c.toString());
        }
    }

}
