/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author USUARIO
 */
public class Ejecutor {

    public static void main(String[] args) {
        String nombreArchivo = "Hospitales.txt";
        
        Hospital hop1 = new Hospital("Hospital Isidro Ayora", 10, 23.2);
        Hospital hop2 = new Hospital("Hospital General Manuel Ygnacio Monteros", 12, 55.5);
        Hospital hop3 = new Hospital("Hospital Dia Loja", 60, 180.00);
        
        ArchivoEscritura archivo = new ArchivoEscritura(nombreArchivo);

        archivo.establecerRegistro(hop1);
        archivo.establecerSalida();

        archivo.establecerRegistro(hop2);
        archivo.establecerSalida();

        archivo.establecerRegistro(hop3);
        archivo.establecerSalida();

        archivo.cerrarArchivo();
        
        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        lectura.establecerLista();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }

}