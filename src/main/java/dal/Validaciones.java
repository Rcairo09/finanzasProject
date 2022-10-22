/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.Scanner;

/**
 *
 * @author Camilo Castro
 */
public class Validaciones {

    //private BufferedReader reader;
    private Scanner reader;

    public Validaciones(Scanner lec) {
        this.reader = lec;
    }

    private boolean isNumericDouble(String cadena) {
        try {
            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException n) {
            return false;
        }
    }

    private boolean isNumericInteger(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException n) {
            return false;
        }
    }

    public double ValidaDouble(String mensaje) {
        String cadena = null;
        Double eleccion;
        do {
            System.out.print(mensaje);
            eleccion = (isNumericDouble(cadena = reader.nextLine())) ? Double.parseDouble(cadena) : null;
            System.out.print(eleccion == null ? " >> Expresion no valida (Ingresa un valor Numerico) << " : "");

        } while (eleccion == null);
        return eleccion;
    }

    public int ValidaInt(String mensaje) {
        String cadena = null;
        Integer eleccion;
        do {
            System.out.print(mensaje);
            eleccion = (isNumericInteger(cadena = reader.nextLine())) ? Integer.parseInt(cadena) : null;
            System.out.print(
                    eleccion == null ? " >> Expresion no valida (Ingresa un valor Numerico o un Entero) << " : "");
        } while (eleccion == null);
        return eleccion;
    }

}
