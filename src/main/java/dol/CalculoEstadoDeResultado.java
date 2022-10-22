/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dol;

/**
 *
 * @author Camilo Castro
 */
public class CalculoEstadoDeResultado {

    public double ventas = 0;
    public double costoDeVentas = 0;
    public double GastoDeVenta = 0;
    public double GastoAdministracion = 0;
    public double GastoFinanciero = 0;
    public double OtrosGastos = 0;
    public double OtrosProductos = 0;

    //Calculo de Utilidad o Perdidad del estado de resultado
    public double UtilidadOPerdidaBruta(double Ventas, double CV) {
        ventas = Ventas;
        costoDeVentas = CV;
        return Ventas - CV;
    }

    public double UtilidadDeOperacion(double UtilidadBruta, double GV, double GA, double GF) {
        GastoDeVenta = GV;
        GastoAdministracion = GA;
        GastoFinanciero = GF;
        return UtilidadBruta - (GV+GA+GF);
    }
    public double UNantesDeImpuesto(double UO, double OG, double OP)
    {
        OtrosGastos = OG;
        OtrosProductos = OP;
        return UO - OG + OP;
    }
    public double UNdespuesDeImpuestos(double UNAI)
    {
        return UNAI - (UNAI * 0.3);
    }
}
