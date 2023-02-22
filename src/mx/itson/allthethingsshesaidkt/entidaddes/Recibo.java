/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.allthethingsshesaidkt.entidaddes;

import java.util.Date;
import java.util.List;

/**
 *
 * @author shiri
 */
public class Recibo {
    
    private int id;
    private Cliente cliente;
    private String numeroServicio;
    private String medidor;
    private int tarifa;
    private Date periodoFacturadoInicio;
    private Date periodoFacturadoFin;
    private Date fechaCorte;
    private Date limiteDePago;
    private List<DesgloseImporte> totalAPagar;
    private String totalAPagarLetra;

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
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the numeroServicio
     */
    public String getNumeroServicio() {
        return numeroServicio;
    }

    /**
     * @param numeroServicio the numeroServicio to set
     */
    public void setNumeroServicio(String numeroServicio) {
        this.numeroServicio = numeroServicio;
    }

    /**
     * @return the medidor
     */
    public String getMedidor() {
        return medidor;
    }

    /**
     * @param medidor the medidor to set
     */
    public void setMedidor(String medidor) {
        this.medidor = medidor;
    }

    /**
     * @return the tarifa
     */
    public int getTarifa() {
        return tarifa;
    }

    /**
     * @param tarifa the tarifa to set
     */
    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    /**
     * @return the periodoFacturadoInicio
     */
    public Date getPeriodoFacturadoInicio() {
        return periodoFacturadoInicio;
    }

    /**
     * @param periodoFacturadoInicio the periodoFacturadoInicio to set
     */
    public void setPeriodoFacturadoInicio(Date periodoFacturadoInicio) {
        this.periodoFacturadoInicio = periodoFacturadoInicio;
    }

    /**
     * @return the periodoFacturadoFin
     */
    public Date getPeriodoFacturadoFin() {
        return periodoFacturadoFin;
    }

    /**
     * @param periodoFacturadoFin the periodoFacturadoFin to set
     */
    public void setPeriodoFacturadoFin(Date periodoFacturadoFin) {
        this.periodoFacturadoFin = periodoFacturadoFin;
    }

    /**
     * @return the fechaCorte
     */
    public Date getFechaCorte() {
        return fechaCorte;
    }

    /**
     * @param fechaCorte the fechaCorte to set
     */
    public void setFechaCorte(Date fechaCorte) {
        this.fechaCorte = fechaCorte;
    }

    /**
     * @return the limiteDePago
     */
    public Date getLimiteDePago() {
        return limiteDePago;
    }

    /**
     * @param limiteDePago the limiteDePago to set
     */
    public void setLimiteDePago(Date limiteDePago) {
        this.limiteDePago = limiteDePago;
    }

    /**
     * @return the totalAPagar
     */
    public List<DesgloseImporte> getTotalAPagar() {
        return totalAPagar;
    }

    /**
     * @param totalAPagar the totalAPagar to set
     */
    public void setTotalAPagar(List<DesgloseImporte> totalAPagar) {
        this.totalAPagar = totalAPagar;
    }

    /**
     * @return the totalAPagarLetra
     */
    public String getTotalAPagarLetra() {
        return totalAPagarLetra;
    }

    /**
     * @param totalAPagarLetra the totalAPagarLetra to set
     */
    public void setTotalAPagarLetra(String totalAPagarLetra) {
        this.totalAPagarLetra = totalAPagarLetra;
    }
    
}
