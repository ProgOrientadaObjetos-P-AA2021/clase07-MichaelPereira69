
package paquete6;

public class Hospital {

    private String nombre;
    private int numeroCamas;
    private double presupuesto;

    public Hospital(String nom, int num, double precio) {
        nombre = nom;
        numeroCamas = num;
        presupuesto = precio;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerNumeroCamas(int num) {
        numeroCamas = num;
    }

    public void establecerPresupuesto(double precio) {
        presupuesto = precio;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerNumeroCamas() {
        return numeroCamas;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }

}