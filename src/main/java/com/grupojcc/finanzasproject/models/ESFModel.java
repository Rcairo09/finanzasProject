/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupojcc.finanzasproject.models;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Johnny
 */
public class ESFModel implements Serializable{
    
    
    private double cajaGeneral;
    private double cajaChica;
    private double fondoOportunidades;
    private double Bancos;
    private double inversionesTemporales;
    private double totalActivosDisponibles;
    private double Clientes;
    private double documentosPorCobrar;
    private double deudoresDiversos;
    private double funcionariosYEmpleados;
    private double ivaAcreditable;
    private double Inventarios;
    private double anticipoProveedores;
    private double totalActivosRealizables;
    private double totalActivosCirculantes;
    private double Terrenos;
    private double Edificios;
    private double Maquinarias;
    private double MobiliarioYEquipo;
    private double mueblesYEnseres;
    private double equipoTransporte;
    private double equipoEntregaYReparto;
    private double totalActivosFijos;
    private double derechosAutor;
    private double Patentes;
    private double marcasRegistradas;
    private double nombresComerciales;
    private double creditoComercial;
    private double gastosConstitucion;
    private double gastosOrganizacion;
    private double gastosInstalacion;
    private double papeleriaYUtiles;
    private double propagandaYPublicidad;
    private double primasYSeguros;
    private double rentasAnticipo;
    private double impuestosAnticipo;
    private double totalActivosDiferibles;
    private double fondoAmortizacion;
    private double depositoEnGarantia;
    private double inversionesEnProceso;
    private double terrenosNoUtilizados;
    private double maquinariaNoUtilizada;
    private double totalOtrosActivos;
    private double totalActivosNoCirculantes;
    private double totalActivos;
    private double Proveedores;
    private double documentosPorPagar;
    private double acreedoresDiversos;
    private double dividendosPorPagar;
    private double ivaPorPagar;
    private double impuestosSobreRenta;
    private double interesesPorPagar;
    private double sueldosPorPagar;
    private double gastosPorPagar;
    private double totalPasivosCirculantes;
    private double acreedoresHipotecarios;
    private double documentosPorPagarLP;
    private double obligacionesACirculacion;
    private double bonosPorPagar;
    private double rentasCobradasPorAnticipo;
    private double interesesCobradosPorAnticipo;
    private double totalPasivosNoCirculantes;
    private double totalPasivos;
    private double capitalSocial;
    private double aportacions;
    private double primaVentaAcciones;
    private double donaciones;
    private double totalCapitalContribuido;
    private double utilidadDelEjercicio;
    private double perdidaDelEjercicio;
    private double utilidadesRetenidas;
    private double totalCapitalGanado;
    private double totalPatrimonio;
    private double formula;

    public ESFModel(double cajaGeneral, double cajaChica, double fondoOportunidades, double Bancos, double inversionesTemporales, double Clientes, double documentosPorCobrar, double deudoresDiversos, double funcionariosYEmpleados, double ivaAcreditable, double Inventarios, double anticipoProveedores, double Terrenos, double Edificios, double Maquinarias, double MobiliarioYEquipo, double mueblesYEnseres, double equipoTransporte, double equipoEntregaYReparto, double derechosAutor, double Patentes, double marcasRegistradas, double nombresComerciales, double creditoComercial, double gastosConstitucion, double gastosOrganizacion, double gastosInstalacion, double papeleriaYUtiles, double propagandaYPublicidad, double primasYSeguros, double rentasAnticipo, double impuestosAnticipo, double fondoAmortizacion, double depositoEnGarantia, double inversionesEnProceso, double terrenosNoUtilizados, double maquinariaNoUtilizada, double Proveedores, double documentosPorPagar, double acreedoresDiversos, double dividendosPorPagar, double ivaPorPagar, double impuestosSobreRenta, double interesesPorPagar, double sueldosPorPagar, double gastosPorPagar, double acreedoresHipotecarios, double documentosPorPagarLP, double obligacionesACirculacion, double bonosPorPagar, double rentasCobradasPorAnticipo, double interesesCobradosPorAnticipo, double capitalSocial, double aportacions, double primaVentaAcciones, double donaciones, double utilidadDelEjercicio, double perdidaDelEjercicio, double utilidadesRetenidas) {
    
        this.cajaGeneral = cajaGeneral;
        this.cajaChica = cajaChica;
        this.fondoOportunidades = fondoOportunidades;
        this.Bancos = Bancos;
        this.inversionesTemporales = inversionesTemporales;
        this.Clientes = Clientes;
        this.documentosPorCobrar = documentosPorCobrar;
        this.deudoresDiversos = deudoresDiversos;
        this.funcionariosYEmpleados = funcionariosYEmpleados;
        this.ivaAcreditable = ivaAcreditable;
        this.Inventarios = Inventarios;
        this.anticipoProveedores = anticipoProveedores;
        this.Terrenos = Terrenos;
        this.Edificios = Edificios;
        this.Maquinarias = Maquinarias;
        this.MobiliarioYEquipo = MobiliarioYEquipo;
        this.mueblesYEnseres = mueblesYEnseres;
        this.equipoTransporte = equipoTransporte;
        this.equipoEntregaYReparto = equipoEntregaYReparto;
        this.derechosAutor = derechosAutor;
        this.Patentes = Patentes;
        this.marcasRegistradas = marcasRegistradas;
        this.nombresComerciales = nombresComerciales;
        this.creditoComercial = creditoComercial;
        this.gastosConstitucion = gastosConstitucion;
        this.gastosOrganizacion = gastosOrganizacion;
        this.gastosInstalacion = gastosInstalacion;
        this.papeleriaYUtiles = papeleriaYUtiles;
        this.propagandaYPublicidad = propagandaYPublicidad;
        this.primasYSeguros = primasYSeguros;
        this.rentasAnticipo = rentasAnticipo;
        this.impuestosAnticipo = impuestosAnticipo;
        this.fondoAmortizacion = fondoAmortizacion;
        this.depositoEnGarantia = depositoEnGarantia;
        this.inversionesEnProceso = inversionesEnProceso;
        this.terrenosNoUtilizados = terrenosNoUtilizados;
        this.maquinariaNoUtilizada = maquinariaNoUtilizada;
        this.Proveedores = Proveedores;
        this.documentosPorPagar = documentosPorPagar;
        this.acreedoresDiversos = acreedoresDiversos;
        this.dividendosPorPagar = dividendosPorPagar;
        this.ivaPorPagar = ivaPorPagar;
        this.impuestosSobreRenta = impuestosSobreRenta;
        this.interesesPorPagar = interesesPorPagar;
        this.sueldosPorPagar = sueldosPorPagar;
        this.gastosPorPagar = gastosPorPagar;
        this.acreedoresHipotecarios = acreedoresHipotecarios;
        this.documentosPorPagarLP = documentosPorPagarLP;
        this.obligacionesACirculacion = obligacionesACirculacion;
        this.bonosPorPagar = bonosPorPagar;
        this.rentasCobradasPorAnticipo = rentasCobradasPorAnticipo;
        this.interesesCobradosPorAnticipo = interesesCobradosPorAnticipo;
        this.capitalSocial = capitalSocial;
        this.aportacions = aportacions;
        this.primaVentaAcciones = primaVentaAcciones;
        this.donaciones = donaciones;
        this.utilidadDelEjercicio = utilidadDelEjercicio;
        this.perdidaDelEjercicio = perdidaDelEjercicio;
        this.utilidadesRetenidas = utilidadesRetenidas;

    }

    public ESFModel() {
        
    }

    

   
    
    public double getCajaGeneral() {
        return cajaGeneral;
    }

    public void setCajaGeneral(double cajaGeneral) {
        this.cajaGeneral = cajaGeneral;
    }

    public double getCajaChica() {
        return cajaChica;
    }

    public void setCajaChica(double cajaChica) {
        this.cajaChica = cajaChica;
    }

    public double getFondoOportunidades() {
        return fondoOportunidades;
    }

    public void setFondoOportunidades(double fondoOportunidades) {
        this.fondoOportunidades = fondoOportunidades;
    }

    public double getBancos() {
        return Bancos;
    }

    public void setBancos(double Bancos) {
        this.Bancos = Bancos;
    }

    public double getInversionesTemporales() {
        return inversionesTemporales;
    }

    public void setInversionesTemporales(double inversionesTemporales) {
        this.inversionesTemporales = inversionesTemporales;
    }

    public double getTotalActivosDisponibles() {
        totalActivosDisponibles = (cajaGeneral + cajaChica + fondoOportunidades + Bancos + inversionesTemporales);
        return totalActivosDisponibles;
    }

    public void setTotalActivosDisponibles(double cajaGeneral, double cajaChica, double fondoOportunidades, double Bancos, double inversionesTemporales) {
        this.cajaGeneral = cajaGeneral;
        this.cajaChica = cajaChica;
        this.fondoOportunidades = fondoOportunidades;
        this.Bancos = Bancos;
        this.inversionesTemporales = inversionesTemporales;
    }

    public double getClientes() {
        return Clientes;
    }

    public void setClientes(double Clientes) {
        this.Clientes = Clientes;
    }

    public double getDocumentosPorCobrar() {
        return documentosPorCobrar;
    }

    public void setDocumentosPorCobrar(double documentosPorCobrar) {
        this.documentosPorCobrar = documentosPorCobrar;
    }

    public double getDeudoresDiversos() {
        return deudoresDiversos;
    }

    public void setDeudoresDiversos(double deudoresDiversos) {
        this.deudoresDiversos = deudoresDiversos;
    }

    public double getFuncionariosYEmpleados() {
        return funcionariosYEmpleados;
    }

    public void setFuncionariosYEmpleados(double funcionariosYEmpleados) {
        this.funcionariosYEmpleados = funcionariosYEmpleados;
    }

    public double getIvaAcreditable() {
        return ivaAcreditable;
    }

    public void setIvaAcreditable(double ivaAcreditable) {
        this.ivaAcreditable = ivaAcreditable;
    }

    public double getInventarios() {
        return Inventarios;
    }

    public void setInventarios(double Inventarios) {
        this.Inventarios = Inventarios;
    }

    public double getAnticipoProveedores() {
        return anticipoProveedores;
    }

    public void setAnticipoProveedores(double anticipoProveedores) {
        this.anticipoProveedores = anticipoProveedores;
    }

    public double getTotalActivosRealizables() {
        totalActivosRealizables = (Clientes + documentosPorCobrar + deudoresDiversos + funcionariosYEmpleados + ivaAcreditable + Inventarios + anticipoProveedores);
        return totalActivosRealizables;
    }

    public void setTotalActivosRealizables(double Clientes, double documentosPorCobrar, double deudoresDiversos,double funcionariosYEmpleados, double ivaAcreditable, double Inventarios, double anticipoProveedores) {
        this.Clientes = Clientes;
        this.documentosPorCobrar = documentosPorCobrar;
        this.deudoresDiversos = deudoresDiversos;
        this.funcionariosYEmpleados = funcionariosYEmpleados;
        this.ivaAcreditable = ivaAcreditable;
        this.Inventarios = Inventarios;
        this.anticipoProveedores = anticipoProveedores;
    }

    public double getTotalActivosCirculantes() {
        totalActivosCirculantes = (totalActivosDisponibles + totalActivosRealizables);
        return totalActivosCirculantes;
    }

    public void setTotalActivosCirculantes(double totalActivosDisponibles, double totalActivosRealizables) {
        this.totalActivosDisponibles = totalActivosDisponibles;
        this.totalActivosRealizables = totalActivosRealizables;
    }

    public double getTerrenos() {
        return Terrenos;
    }

    public void setTerrenos(double Terrenos) {
        this.Terrenos = Terrenos;
    }

    public double getEdificios() {
        return Edificios;
    }

    public void setEdificios(double Edificios) {
        this.Edificios = Edificios;
    }

    public double getMaquinarias() {
        return Maquinarias;
    }

    public void setMaquinarias(double Maquinarias) {
        this.Maquinarias = Maquinarias;
    }

    public double getMobiliarioYEquipo() {
        return MobiliarioYEquipo;
    }

    public void setMobiliarioYEquipo(double MobiliarioYEquipo) {
        this.MobiliarioYEquipo = MobiliarioYEquipo;
    }

    public double getMueblesYEnseres() {
        return mueblesYEnseres;
    }

    public void setMueblesYEnseres(double mueblesYEnseres) {
        this.mueblesYEnseres = mueblesYEnseres;
    }

    public double getEquipoTransporte() {
        return equipoTransporte;
    }

    public void setEquipoTransporte(double equipoTransporte) {
        this.equipoTransporte = equipoTransporte;
    }

    public double getEquipoEntregaYReparto() {
        return equipoEntregaYReparto;
    }

    public void setEquipoEntregaYReparto(double equipoEntregaYReparto) {
        this.equipoEntregaYReparto = equipoEntregaYReparto;
    }

    public double getTotalActivosFijos() {
        totalActivosFijos = (Terrenos + Edificios + Maquinarias + mueblesYEnseres + equipoTransporte + equipoEntregaYReparto);
        return totalActivosFijos;
    }

    public void setTotalActivosFijos(double Terrenos, double Edificios, double Maquinarias, double MobiliarioYEquipo, double mueblesYEnseres, double equipoTransporte, double equipoEntregaYReparto) {
        this.Terrenos = Terrenos;
        this.Edificios = Edificios;
        this.Maquinarias = Maquinarias;
        this.MobiliarioYEquipo = MobiliarioYEquipo;
        this.mueblesYEnseres = mueblesYEnseres;
        this.equipoTransporte = equipoTransporte;
        this.equipoEntregaYReparto = equipoEntregaYReparto;
    }

    public double getDerechosAutor() {
        return derechosAutor;
    }

    public void setDerechosAutor(double derechosAutor) {
        this.derechosAutor = derechosAutor;
    }

    public double getPatentes() {
        return Patentes;
    }

    public void setPatentes(double Patentes) {
        this.Patentes = Patentes;
    }

    public double getMarcasRegistradas() {
        return marcasRegistradas;
    }

    public void setMarcasRegistradas(double marcasRegistradas) {
        this.marcasRegistradas = marcasRegistradas;
    }

    public double getNombresComerciales() {
        return nombresComerciales;
    }

    public void setNombresComerciales(double nombresComerciales) {
        this.nombresComerciales = nombresComerciales;
    }

    public double getCreditoComercial() {
        return creditoComercial;
    }

    public void setCreditoComercial(double creditoComercial) {
        this.creditoComercial = creditoComercial;
    }

    public double getGastosConstitucion() {
        return gastosConstitucion;
    }

    public void setGastosConstitucion(double gastosConstitucion) {
        this.gastosConstitucion = gastosConstitucion;
    }

    public double getGastosOrganizacion() {
        return gastosOrganizacion;
    }

    public void setGastosOrganizacion(double gastosOrganizacion) {
        this.gastosOrganizacion = gastosOrganizacion;
    }

    public double getGastosInstalacion() {
        return gastosInstalacion;
    }

    public void setGastosInstalacion(double gastosInstalacion) {
        this.gastosInstalacion = gastosInstalacion;
    }

    public double getPapeleriaYUtiles() {
        return papeleriaYUtiles;
    }

    public void setPapeleriaYUtiles(double papeleriaYUtiles) {
        this.papeleriaYUtiles = papeleriaYUtiles;
    }

    public double getPropagandaYPublicidad() {
        return propagandaYPublicidad;
    }

    public void setPropagandaYPublicidad(double propagandaYPublicidad) {
        this.propagandaYPublicidad = propagandaYPublicidad;
    }

    public double getPrimasYSeguros() {
        return primasYSeguros;
    }

    public void setPrimasYSeguros(double primasYSeguros) {
        this.primasYSeguros = primasYSeguros;
    }

    public double getRentasAnticipo() {
        return rentasAnticipo;
    }

    public void setRentasAnticipo(double rentasAnticipo) {
        this.rentasAnticipo = rentasAnticipo;
    }

    public double getImpuestosAnticipo() {
        return impuestosAnticipo;
    }

    public void setImpuestosAnticipo(double impuestosAnticipo) {
        this.impuestosAnticipo = impuestosAnticipo;
    }

    public double getTotalActivosDiferibles() {
        totalActivosDiferibles = (derechosAutor + Patentes + marcasRegistradas + nombresComerciales + creditoComercial + gastosConstitucion + gastosOrganizacion + gastosInstalacion + papeleriaYUtiles + propagandaYPublicidad + primasYSeguros + rentasAnticipo + impuestosAnticipo);
        return totalActivosDiferibles;
    }

    public void setTotalActivosDiferibles(double derechosAutor, double Patentes, double marcasRegistradas, double nombresComerciales, double creditoComercial, double gastosConstitucion, double gastosOrganizacion, double gastosInstalacion, double papeleriaYUtiles, double propagandaYPublicidad, double primasYSeguros, double rentasAnticipo, double impuestosAnticipo ) {
        this.derechosAutor = derechosAutor;
        this.Patentes = Patentes;
        this.marcasRegistradas = marcasRegistradas;
        this.nombresComerciales = nombresComerciales;
        this.creditoComercial = creditoComercial;
        this.gastosConstitucion = gastosConstitucion;
        this.gastosOrganizacion = gastosOrganizacion;
        this.gastosInstalacion = gastosInstalacion;
        this.papeleriaYUtiles = papeleriaYUtiles;
        this.propagandaYPublicidad = propagandaYPublicidad;
        this.primasYSeguros = primasYSeguros;
        this.rentasAnticipo = rentasAnticipo;
        this.impuestosAnticipo = impuestosAnticipo;
    }

    public double getFondoAmortizacion() {
        return fondoAmortizacion;
    }

    public void setFondoAmortizacion(double fondoAmortizacion) {
        this.fondoAmortizacion = fondoAmortizacion;
    }

    public double getDepositoEnGarantia() {
        return depositoEnGarantia;
    }

    public void setDepositoEnGarantia(double depositoEnGarantia) {
        this.depositoEnGarantia = depositoEnGarantia;
    }

    public double getInversionesEnProceso() {
        return inversionesEnProceso;
    }

    public void setInversionesEnProceso(double inversionesEnProceso) {
        this.inversionesEnProceso = inversionesEnProceso;
    }

    public double getTerrenosNoUtilizados() {
        return terrenosNoUtilizados;
    }

    public void setTerrenosNoUtilizados(double terrenosNoUtilizados) {
        this.terrenosNoUtilizados = terrenosNoUtilizados;
    }

    public double getMaquinariaNoUtilizada() {
        return maquinariaNoUtilizada;
    }

    public void setMaquinariaNoUtilizada(double maquinariaNoUtilizada) {
        this.maquinariaNoUtilizada = maquinariaNoUtilizada;
    }

    public double getTotalOtrosActivos() {
        totalOtrosActivos = (fondoAmortizacion + depositoEnGarantia + inversionesEnProceso + terrenosNoUtilizados + maquinariaNoUtilizada);
        return totalOtrosActivos;
    }

    public void setTotalOtrosActivos(double fondoAmortizacion, double depositoEnGarantia, double inversionesEnProceso, double terrenosNoUtilizados, double maquinariaNoUtilizada) {
        this.fondoAmortizacion = fondoAmortizacion;
        this.depositoEnGarantia = depositoEnGarantia;
        this.inversionesEnProceso = inversionesEnProceso;
        this.terrenosNoUtilizados = terrenosNoUtilizados;
        this.maquinariaNoUtilizada = maquinariaNoUtilizada;
    }

    public double getTotalActivosNoCirculantes() {
        totalActivosNoCirculantes = (totalActivosFijos + totalActivosDiferibles + totalOtrosActivos);
        return totalActivosNoCirculantes;
    }

    public void setTotalActivosNoCirculantes(double totalActivosFijos, double totalActivosDiferibles, double totalOtrosActivos) {
        this.totalActivosFijos = totalActivosFijos;
        this.totalActivosDiferibles = totalActivosDiferibles;
        this.totalOtrosActivos = totalOtrosActivos;
    }

    public double getTotalActivos() {
        totalActivos = (totalActivosCirculantes + totalActivosNoCirculantes);
        return totalActivos;
    }

    public void setTotalActivos(double totalActivosCirculantes, double totalActivosNoCirculantes) {
            this.totalActivosCirculantes = totalActivosCirculantes;
            this.totalActivosNoCirculantes = totalActivosNoCirculantes;
    }

    public double getProveedores() {
        return Proveedores;
    }

    public void setProveedores(double Proveedores) {
        this.Proveedores = Proveedores;
    }

    public double getDocumentosPorPagar() {
        return documentosPorPagar;
    }

    public void setDocumentosPorPagar(double documentosPorPagar) {
        this.documentosPorPagar = documentosPorPagar;
    }

    public double getAcreedoresDiversos() {
        return acreedoresDiversos;
    }

    public void setAcreedoresDiversos(double acreedoresDiversos) {
        this.acreedoresDiversos = acreedoresDiversos;
    }

    public double getDividendosPorPagar() {
        return dividendosPorPagar;
    }

    public void setDividendosPorPagar(double dividendosPorPagar) {
        this.dividendosPorPagar = dividendosPorPagar;
    }

    public double getIvaPorPagar() {
        return ivaPorPagar;
    }

    public void setIvaPorPagar(double ivaPorPagar) {
        this.ivaPorPagar = ivaPorPagar;
    }

    public double getImpuestosSobreRenta() {
        return impuestosSobreRenta;
    }

    public void setImpuestosSobreRenta(double impuestosSobreRenta) {
        this.impuestosSobreRenta = impuestosSobreRenta;
    }

    public double getInteresesPorPagar() {
        return interesesPorPagar;
    }

    public void setInteresesPorPagar(double interesesPorPagar) {
        this.interesesPorPagar = interesesPorPagar;
    }

    public double getSueldosPorPagar() {
        return sueldosPorPagar;
    }

    public void setSueldosPorPagar(double sueldosPorPagar) {
        this.sueldosPorPagar = sueldosPorPagar;
    }

    public double getGastosPorPagar() {
        return gastosPorPagar;
    }

    public void setGastosPorPagar(double gastosPorPagar) {
        this.gastosPorPagar = gastosPorPagar;
    }

    public double getTotalPasivosCirculantes() {
        totalPasivosCirculantes = (Proveedores + documentosPorPagar + acreedoresDiversos + dividendosPorPagar + ivaPorPagar + impuestosSobreRenta + interesesPorPagar + sueldosPorPagar + gastosPorPagar);
        return totalPasivosCirculantes;
    }

    public void setTotalPasivosCirculantes(double Proveedores, double documentosPorPagar, double acreedoresDiversos, double dividendosPorPagar, double ivaPorPagar, double impuestosSobreRenta, double interesesPorPagar, double sueldosPorPagar, double gastosPorPagar) {
        this.Proveedores = Proveedores;
        this.documentosPorPagar = documentosPorPagar;
        this.acreedoresDiversos = acreedoresDiversos;
        this.dividendosPorPagar = dividendosPorPagar;
        this.ivaPorPagar = ivaPorPagar;
        this.impuestosSobreRenta = impuestosSobreRenta;
        this.interesesPorPagar = interesesPorPagar;
        this.sueldosPorPagar = sueldosPorPagar;
        this.gastosPorPagar = gastosPorPagar;
    }

    public double getAcreedoresHipotecarios() {
        return acreedoresHipotecarios;
    }

    public void setAcreedoresHipotecarios(double acreedoresHipotecarios) {
        this.acreedoresHipotecarios = acreedoresHipotecarios;
    }

    public double getDocumentosPorPagarLP() {
        return documentosPorPagarLP;
    }

    public void setDocumentosPorPagarLP(double documentosPorPagarLP) {
        this.documentosPorPagarLP = documentosPorPagarLP;
    }

    public double getObligacionesACirculacion() {
        return obligacionesACirculacion;
    }

    public void setObligacionesACirculacion(double obligacionesACirculacion) {
        this.obligacionesACirculacion = obligacionesACirculacion;
    }

    public double getBonosPorPagar() {
        return bonosPorPagar;
    }

    public void setBonosPorPagar(double bonosPorPagar) {
        this.bonosPorPagar = bonosPorPagar;
    }

    public double getRentasCobradasPorAnticipo() {
        return rentasCobradasPorAnticipo;
    }

    public void setRentasCobradasPorAnticipo(double rentasCobradasPorAnticipo) {
        this.rentasCobradasPorAnticipo = rentasCobradasPorAnticipo;
    }

    public double getInteresesCobradosPorAnticipo() {
        return interesesCobradosPorAnticipo;
    }

    public void setInteresesCobradosPorAnticipo(double interesesCobradosPorAnticipo) {
        this.interesesCobradosPorAnticipo = interesesCobradosPorAnticipo;
    }

    public double getTotalPasivosNoCirculantes() {
        totalPasivosNoCirculantes = (acreedoresHipotecarios + documentosPorPagarLP + obligacionesACirculacion + bonosPorPagar + rentasCobradasPorAnticipo + interesesCobradosPorAnticipo);
        return totalPasivosNoCirculantes;
    }

    public void setTotalPasivosNoCirculantes(double acreedoresHipotecarios, double documentosPorPagarLP, double obligacionesACirculacion, double bonosPorPagar, double rentasCobradasPorAnticipo, double interesesCobradosPorAnticipo) {
        this.acreedoresHipotecarios = acreedoresHipotecarios;
        this.documentosPorPagarLP = documentosPorPagarLP;
        this.obligacionesACirculacion = obligacionesACirculacion;
        this.bonosPorPagar = bonosPorPagar;
        this.rentasCobradasPorAnticipo = rentasCobradasPorAnticipo;
        this.interesesCobradosPorAnticipo = interesesCobradosPorAnticipo;
        
        
    }

    public double getTotalPasivos() {
        totalPasivos = (totalPasivosCirculantes + totalPasivosNoCirculantes);
        return totalPasivos;
    }

    public void setTotalPasivos(double totalPasivosCirculantes, double totalPasivosNoCirculantes) {
        this.totalPasivosCirculantes = totalPasivosCirculantes;
        this.totalPasivosNoCirculantes = totalPasivosNoCirculantes;
    }

    public double getCapitalSocial() {
        return capitalSocial;
    }

    public void setCapitalSocial(double capitalSocial) {
        this.capitalSocial = capitalSocial;
    }

    public double getAportacions() {
        return aportacions;
    }

    public void setAportacions(double aportacions) {
        this.aportacions = aportacions;
    }

    public double getPrimaVentaAcciones() {
        return primaVentaAcciones;
    }

    public void setPrimaVentaAcciones(double primaVentaAcciones) {
        this.primaVentaAcciones = primaVentaAcciones;
    }

    public double getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(double donaciones) {
        this.donaciones = donaciones;
    }

    
    
    
    public double getTotalCapitalContribuido() {
        totalCapitalContribuido = (capitalSocial + aportacions + primaVentaAcciones + donaciones);
        return totalCapitalContribuido;
    }

    public void setTotalCapitalContribuido(double capitalSocial, double aportacions, double primaVentaAcciones, double donaciones) {
        this.capitalSocial = capitalSocial;
        this.aportacions = aportacions;
        this.primaVentaAcciones = primaVentaAcciones;
        this.donaciones = donaciones;
    }

    public double getUtilidadDelEjercicio() {
        return utilidadDelEjercicio;
    }

    public void setUtilidadDelEjercicio(double utilidadDelEjercicio) {
        this.utilidadDelEjercicio = utilidadDelEjercicio;
    }

    public double getPerdidaDelEjercicio() {
        return perdidaDelEjercicio;
    }

    public void setPerdidaDelEjercicio(double perdidaDelEjercicio) {
        this.perdidaDelEjercicio = perdidaDelEjercicio;
    }

    public double getUtilidadesRetenidas() {
        return utilidadesRetenidas;
    }

    public void setUtilidadesRetenidas(double utilidadesRetenidas) {
        this.utilidadesRetenidas = utilidadesRetenidas;
    }

    public double getTotalCapitalGanado() {
            totalCapitalGanado = (utilidadDelEjercicio - perdidaDelEjercicio + utilidadesRetenidas );
        return totalCapitalGanado;
    }

    public void setTotalCapitalGanado(double utilidadDelEjercicio, double perdidaDelEjercicio, double utilidadesRetenidas) {
        this.utilidadDelEjercicio = utilidadDelEjercicio;
        this.perdidaDelEjercicio = perdidaDelEjercicio;
        this.utilidadesRetenidas = utilidadesRetenidas;
    }

    public double getTotalPatrimonio() {
        totalPatrimonio = (totalCapitalContribuido + totalCapitalGanado);
        return totalPatrimonio;
    }

    public void setTotalPatrimonio(double totalCapitalContribuido, double totalCapitalGanado) {
        this.totalCapitalContribuido = totalCapitalContribuido;
        this.totalCapitalGanado = totalCapitalGanado;
    }

    public double getFormula() {
        formula = (totalPasivos + totalPatrimonio);
        return formula;
    }

    public void setFormula(double totalPasivos, double totalPatrimonio) {
        this.totalPasivos = totalPasivos;
        this.totalPatrimonio = totalPatrimonio;
    }
    
    
            
   public void save(File file, BalanceArreglo balance) throws IOException {
        if (file != null) {
            try {
                ObjectOutputStream a = new ObjectOutputStream(new FileOutputStream(file));
                a.writeObject(balance);
                a.flush();
                a.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ESFModel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public BalanceArreglo read(File file) throws IOException {
        BalanceArreglo balance = null;
        try {
            ObjectInputStream j = new ObjectInputStream(new FileInputStream(file));
            try {
                balance = (BalanceArreglo) j.readObject();
                j.close();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ESFModel.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ESFModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return balance;

    }
    
}
