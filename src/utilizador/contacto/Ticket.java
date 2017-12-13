/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilizador.contacto;

import utilizador.Utilizador;

/**
 *
 * @author Rafael
 */
public class Ticket {
    private int nReferencia;
    private TipoTicket tipoTicket;
    private String titulo;
    private String descricao;
    private Departamento departamento;
    private boolean finalizado;
    private Utilizador remetente;
    private Estado estado;

    public Ticket(TipoTicket tipoTicket, String titulo, String descricao, Departamento departamento, boolean finalizado, Estado estado) {
        this.tipoTicket = tipoTicket;
        this.titulo = titulo;
        this.descricao = descricao;
        this.departamento = departamento;
        this.finalizado = finalizado;
        this.estado = estado;
    }
    
    public int getnReferencia() {
        return nReferencia;
    }

    public TipoTicket getTipoTicket() {
        return tipoTicket;
    }

    public void setTipoTicket(TipoTicket tipoTicket) {
        this.tipoTicket = tipoTicket;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public Utilizador getRemetente() {
        return remetente;
    }

    public void setRemetente(Utilizador remetente) {
        this.remetente = remetente;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    
}
