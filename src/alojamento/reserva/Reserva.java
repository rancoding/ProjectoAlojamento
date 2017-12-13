/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alojamento.reserva;

import java.util.Date;
import utilizador.Cliente;

/**
 *
 * @author Rafael
 */
public class Reserva {
    private int nReferencia;
    private int nPessoas;
    private double precoTotal;
    private boolean confirmada;
    private boolean anulada;
    private boolean paga;
    private Date dataInicio;
    private Date dataFim;
    private TipoReserva tipoReserva;
    private TipoPagamento tipoPagamento;
    private Cliente cliente;
    private static int cont;

    public Reserva(int nPessoas, double precoTotal, Date dataInicio, Date dataFim, TipoReserva tipoReserva, TipoPagamento tipoPagamento, Cliente cliente) {
        this.nReferencia = cont;
        this.nPessoas = nPessoas;
        this.precoTotal = precoTotal;
        this.confirmada = false;
        this.anulada = false;
        this.paga = false;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.tipoReserva = tipoReserva;
        this.tipoPagamento = tipoPagamento;
        this.cliente = cliente;
        cont++;
    }
    
    
    
    public int getnReferencia() {
        return nReferencia;
    }
    
    public int getnPessoas() {
        return nPessoas;
    }

    public void setnPessoas(int nPessoas) {
        this.nPessoas = nPessoas;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public boolean isConfirmada() {
        return confirmada;
    }

    public void setConfirmada(boolean confirmada) {
        this.confirmada = confirmada;
    }

    public boolean isAnulada() {
        return anulada;
    }

    public void setAnulada(boolean anulada) {
        this.anulada = anulada;
    }

    public boolean isPaga() {
        return paga;
    }

    public void setPaga(boolean paga) {
        this.paga = paga;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public TipoReserva getTipoReserva() {
        return tipoReserva;
    }

    public void setTipoReserva(TipoReserva tipoReserva) {
        this.tipoReserva = tipoReserva;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
