/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.allthethingsshesaidkt.entidaddes;

import java.util.List;

/**
 *
 * @author shiri
 */
public class DesgloseImporte {
    
    private int id;
    private double lecturaAnterior;
    private double lecturaActual;
    private String concepto;
    private List<Consumo> precioKiloWatt;
    private double apoyoGubernamental;
    private double importe;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the lecturaAnterior
     */
    public double getLecturaAnterior() {
        return lecturaAnterior;
    }

    /**
     * @param lecturaAnterior the lecturaAnterior to set
     */
    public void setLecturaAnterior(double lecturaAnterior) {
        this.lecturaAnterior = lecturaAnterior;
    }

    /**
     * @return the lecturaActual
     */
    public double getLecturaActual() {
        return lecturaActual;
    }

    /**
     * @param lecturaActual the lecturaActual to set
     */
    public void setLecturaActual(double lecturaActual) {
        this.lecturaActual = lecturaActual;
    }

    /**
     * @return the concepto
     */
    public String getConcepto() {
        return concepto;
    }

    /**
     * @param concepto the concepto to set
     */
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    /**
     * @return the precioKiloWatt
     */
    public List<Consumo> getPrecioKiloWatt() {
        return precioKiloWatt;
    }

    /**
     * @param precioKiloWatt the precioKiloWatt to set
     */
    public void setPrecioKiloWatt(List<Consumo> precioKiloWatt) {
        this.precioKiloWatt = precioKiloWatt;
    }

    /**
     * @return the apoyoGubernamental
     */
    public double getApoyoGubernamental() {
        return apoyoGubernamental;
    }

    /**
     * @param apoyoGubernamental the apoyoGubernamental to set
     */
    public void setApoyoGubernamental(double apoyoGubernamental) {
        this.apoyoGubernamental = apoyoGubernamental;
    }

    /**
     * @return the importe
     */
    public double getImporte() {
        return importe;
    }

    /**
     * @param importe the importe to set
     */
    public void setImporte(double importe) {
        this.importe = importe;
    }
    
}
