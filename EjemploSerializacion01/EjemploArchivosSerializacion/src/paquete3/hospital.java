
package paquete3;

/**
 *
 * @author USUARIO
 */
public class hospital {
    

    String nombre;
    int numCamas;
    double presu;

    public hospital(String nom, int numCam, double pre) {
        nombre = nom;
        numCamas = numCam;
        presu = pre;

    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerNumCamas(int numCam) {
        numCamas = numCam;
    }

    public void establecerPresupuesto(double pre) {
        presu = pre;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerNumCamas() {
        return numCamas;
    }

    public double obtenerPresupuesto() {
        return presu;
    }

}

