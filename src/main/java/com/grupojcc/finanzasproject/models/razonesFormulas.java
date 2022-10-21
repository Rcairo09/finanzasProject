/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupojcc.finanzasproject.models;

/**
 *
 * @author lenovo
 */
public class razonesFormulas {
    private static double activoCirc;
    private double pasivoCirc;
    private double capitalTrabajoNeto; ////
    private double razonCirculante; ////
    private double inventario;
    private double razonRapida; ////
    private double costoVentas; 
    private double rotacionInventario; ///
    private double ventasNetasCredito;
    private double cuentasPorCobrar;
    private double rCuentasPorCobrar; ////
    private double ventas;
    private double pPromedioCobro; /////
    private double cuentasPorPagar;
    private double pPromedioPago; ////
    private double comprasAnuales;
    private double activoFijoNeto;
    private double rActivosFijos; ////
    private double activosTotales;
    private double rActivosTotales; ////
    private double pasivosTotales;
    private double rDeudaTotal; //////
    private double pasivoLargoP;
    private double capitalSocial;
    private double rPasivoCapital; /////
    private double utilidadBruta;
    private double utilidadAntImpuestos;
    private double impuestos;
    private double rInteresesUtilidades; /////
    private double mUtilidadBruta; /////
    private double utilidadOperativa;
    private double mUtilidadOperativa; ////
    private double utilidadNeta;
    private double mUtilidadNeta; /////

    public razonesFormulas(double activoCirc, double pasivoCirc, double inventario, double costoArticulosV, double ventasNetasCredito, double impuestos, double cuentasPorCobrar, double ventas, double cuentasPorPagar, double comprasAnueles, double activoFijoNeto, double activosTotales, double pasivosTotales, double pasivoLargoP, double capitalSocial, double utilidadBruta, double utilidadAntImpuestos, double utilidadOperativa, double utilidadNeta) {
        this.activoCirc = activoCirc;
        this.pasivoCirc = pasivoCirc;
        this.inventario = inventario;
        this.costoVentas = costoArticulosV;
        this.ventasNetasCredito = ventasNetasCredito;
        this.cuentasPorCobrar = cuentasPorCobrar;
        this.ventas = ventas;
        this.cuentasPorPagar = cuentasPorPagar;
        this.comprasAnuales = comprasAnueles;
        this.activoFijoNeto = activoFijoNeto;
        this.activosTotales = activosTotales;
        this.pasivosTotales = pasivosTotales;
        this.pasivoLargoP = pasivoLargoP;
        this.capitalSocial = capitalSocial;
        this.utilidadBruta = utilidadBruta;
        this.impuestos = impuestos;
        this.utilidadAntImpuestos = utilidadAntImpuestos;
        this.utilidadOperativa = utilidadOperativa;
        this.utilidadNeta = utilidadNeta;
    }

    public razonesFormulas() {
        
    }

    /////////////DATOS ////////////////
    
    public double getActivoCirc() {
        return activoCirc;
    }

    public void setActivoCirc(double activoCirc) {
        this.activoCirc = activoCirc;
    }

    public double getPasivoCirc() {
        return pasivoCirc;
    }

    public void setPasivoCirc(double pasivoCirc) {
        this.pasivoCirc = pasivoCirc;
    }

    public double getInventario() {
        return inventario;
    }

    public void setInventario(double inventario) {
        this.inventario = inventario;
    }

    public double getCostoVentas() {
        return costoVentas;
    }

    public void setCostoVentas(double costoVentas) {
        this.costoVentas = costoVentas;
        
    }

    public double getVentasNetasCredito() {
        return ventasNetasCredito;
    }

    public void setVentasNetasCredito(double ventasNetasCredito) {
        this.ventasNetasCredito = ventasNetasCredito;
    }

    public double getCuentasPorCobrar() {
        return cuentasPorCobrar;
    }

    public void setCuentasPorCobrar(double cuentasPorCobrar) {
        this.cuentasPorCobrar = cuentasPorCobrar;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public double getCuentasPorPagar() {
        return cuentasPorPagar;
    }

    public void setCuentasPorPagar(double cuentasPorPagar) {
        this.cuentasPorPagar = cuentasPorPagar;
    }

    public double getComprasAnuales() {
        return comprasAnuales;
    }

    public void setComprasAnuales(double comprasAnuales) {
        this.comprasAnuales = comprasAnuales;
    }

    public double getActivoFijoNeto() {
        return activoFijoNeto;
    }

    public void setActivoFijoNeto(double activoFijoNeto) {
        this.activoFijoNeto = activoFijoNeto;
    }

    public double getActivosTotales() {
        return activosTotales;
    }

    public void setActivosTotales(double activosTotales) {
        this.activosTotales = activosTotales;
    }

    public double getPasivosTotales() {
        return pasivosTotales;
    }

    public void setPasivosTotales(double pasivosTotales) {
        this.pasivosTotales = pasivosTotales;
    }

    public double getPasivoLargoP() {
        return pasivoLargoP;
    }

    public void setPasivoLargoP(double pasivoLargoP) {
        this.pasivoLargoP = pasivoLargoP;
    }

    public double getCapitalSocial() {
        return capitalSocial;
    }

    public void setCapitalSocial(double capitalSocial) {
        this.capitalSocial = capitalSocial;
    }

    public double getUtilidadBruta() {
        return utilidadBruta;
    }

    public void setUtilidadBruta(double utilidadBruta) {
        this.utilidadBruta = utilidadBruta;
    }

    public double getUtilidadAntImpuestos() {
        return utilidadAntImpuestos;
    }

    public void setUtilidadAntImpuestos(double utilidadAntImpuestos) {
        this.utilidadAntImpuestos = utilidadAntImpuestos;
    }

    public double getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(double impuestos) {
        this.impuestos = impuestos;
    }

    public double getUtilidadOperativa() {
        return utilidadOperativa;
    }

    public void setUtilidadOperativa(double utilidadOperativa) {
        this.utilidadOperativa = utilidadOperativa;
    }

    public double getUtilidadNeta() {
        return utilidadNeta;
    }

    public void setUtilidadNeta(double utilidadNeta) {
        this.utilidadNeta = utilidadNeta;
    }
    
    ///////////// RAZONES LIQUIDEZ//////////////////

    public double getCapitalTrabajoNeto() {
        capitalTrabajoNeto = activoCirc-pasivoCirc;
        return capitalTrabajoNeto;
    }

    public void setCapitalTrabajoNeto(double activoCirc, double pasivoCirc) {
        this.activoCirc = activoCirc;
        this.pasivoCirc = pasivoCirc;
    }

    public double getRazonCirculante() {
        razonCirculante = activoCirc/pasivoCirc;
        return razonCirculante;
    }

    public void setRazonCirculante(double activoCirc, double pasivoCirc) {
        this.activoCirc = activoCirc;
        this.pasivoCirc = pasivoCirc;
    }

    public double getRazonRapida() {
        razonRapida = (activoCirc-inventario)/pasivoCirc;
        return razonRapida;
    }

    public void setRazonRapida(double activoCirc, double pasivoCirc, double inventario) {
        this.activoCirc = activoCirc;
        this.pasivoCirc = pasivoCirc;
        this.inventario = inventario;
    }
    
    ////////// RAZONES ACTIVIDAD ///////////

    public double getRotacionInventario() {
        rotacionInventario = costoVentas / inventario;
        return rotacionInventario;
    }

    public void setRotacionInventario(double costoVentas, double inventario) {
        this.costoVentas = costoVentas;
        this.inventario = inventario;
    }

    public double getrCuentasPorCobrar() {
        rCuentasPorCobrar = ventasNetasCredito/cuentasPorCobrar;
        return rCuentasPorCobrar;
    }

    public void setrCuentasPorCobrar(double ventasNetasCredito, double cuentasPorCobrar) {
        this.ventasNetasCredito = ventasNetasCredito;
        this.cuentasPorCobrar = cuentasPorCobrar;
    }

    public double getpPromedioCobro() {
        pPromedioCobro = cuentasPorCobrar / (ventas/360);
        return pPromedioCobro;
    }

    public void setpPromedioCobro(double cuentasPorCobrar, double ventas) {
        this.cuentasPorCobrar = cuentasPorCobrar;
        this.ventas = ventas;
    }

    public double getpPromedioPago() {
        pPromedioPago = cuentasPorPagar / (ventas/360);
        return pPromedioPago;
    }

    public void setpPromedioPago(double cuentasPorPagar, double ventas) {
        this.cuentasPorPagar = cuentasPorPagar;
        this.ventas = ventas;
    }

    public double getrActivosFijos() {
        rActivosFijos = ventas /rActivosFijos;
        return rActivosFijos;
    }

    public void setrActivosFijos(double ventas, double activosFijos) {
        this.ventas = ventas;
        this.rActivosFijos = activosFijos;
    }

    public double getrActivosTotales() {
        rActivosTotales = ventas / activosTotales;
        return rActivosTotales;
    }

    public void setrActivosTotales(double ventas, double activosTotales) {
        this.ventas = ventas;
        this.rActivosTotales = activosTotales;
    }
    
    /////////// RAZONES ENDEUDAMIENTO //////////////

    public double getrDeudaTotal() {
        rDeudaTotal = pasivosTotales/activosTotales;
        return rDeudaTotal;
    }

    public void setrDeudaTotal(double pasivosTotales, double activosTotales) {
        this.pasivosTotales = pasivosTotales;
        this.activosTotales = activosTotales;
    }

    public double getrPasivoCapital() {
        rPasivoCapital = pasivoLargoP / capitalSocial;
        return rPasivoCapital;
    }

    public void setrPasivoCapital(double pasivoLargoP, double capitalSocial) {
        this.pasivoLargoP = pasivoLargoP;
        this.capitalSocial = capitalSocial;
    }

    public double getrInteresesUtilidades() {
        rInteresesUtilidades = utilidadAntImpuestos / impuestos;
        return rInteresesUtilidades;
    }

    public void setrInteresesUtilidades(double utilidadAntImpuestos, double impuestos) {
        this.utilidadAntImpuestos = utilidadAntImpuestos;
        this.impuestos = impuestos;
    }
    
    ////////////// RAZONES RENTABILIDAD ////////////

    public double getmUtilidadBruta() {
        mUtilidadBruta = utilidadBruta/ventas;
        return mUtilidadBruta;
    }

    public void setmUtilidadBruta(double utilidadBruta, double ventas) {
        this.utilidadBruta = utilidadBruta;
        this.ventas = ventas;
    }

    public double getmUtilidadOperativa() {
        mUtilidadOperativa = utilidadOperativa/ventas;
        return mUtilidadOperativa;
    }

    public void setmUtilidadOperativa(double utilidadOperativa, double ventas) {
        this.mUtilidadOperativa = utilidadOperativa;
        this.ventas = ventas;
    }

    public double getmUtilidadNeta() {
        mUtilidadNeta = utilidadNeta / ventas;
        return mUtilidadNeta;
    }

    public void setmUtilidadNeta(double utilidadNeta, double ventas) {
        this.utilidadNeta = utilidadNeta;
        this.ventas = ventas;
    }
    
    
    
}


