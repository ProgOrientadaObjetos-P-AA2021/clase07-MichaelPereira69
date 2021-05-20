package paquete4;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import paquete3.hospital;

public class LecturaArchivoSecuencial {

    private ObjectInputStream entrada;
    private ArrayList<hospital> hospitales;
    private String nombreArchivo;

    public LecturaArchivoSecuencial(String n) {
        nombreArchivo = n;
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {
            try {
                entrada = new ObjectInputStream(
                        new FileInputStream(n));
            } catch (IOException ioException) {
                System.err.println("Error al abrir el archivo." + ioException);
            }
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerHospitales() {

        hospitales = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    hospital registro = (hospital) entrada.readObject();
                    hospitales.add(registro);
                } catch (EOFException endOfFileException) {

                    return;

                } catch (IOException ex) {
                    System.err.println("Error no se lee el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se puede crear el objeto: " + ex);
                } catch (Exception ex) {
                    System.err.println("No existen datos en el archivo: " + ex);

                }
            }
        }
    }

    public ArrayList<hospital> obtenerHospitales() {
        return hospitales;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    @Override
    public String toString() {
        String cadena = "Lista de Hospitales\n";
        for (int i = 0; i < obtenerHospitales().size(); i++) {
            hospital h = obtenerHospitales().get(i);
            cadena = String.format("%s(%d) %s - Camas: %d - Presupuesto: "
                    + "%f\n", cadena,
                    i + 1,
                    h.obtenerNombre(),
                    h.obtenerNumCamas(),
                    h.obtenerPresupuesto());
        }

        return cadena;
    }

    public void cerrarArchivo() {
        try {
            if (entrada != null) {
                entrada.close();
            }
            System.exit(0);
        } catch (IOException ioException) {
            System.err.println("Error al cerrar  archivo.");
            System.exit(1);
        }
    }

}
