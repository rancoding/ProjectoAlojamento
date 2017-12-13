/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alojamento;

import java.util.Date;
import utilizador.Cliente;

/**
 *
 * @author Rafael
 */
public class Avaliacao {
    private String titulo;
    private String descricao;
    private float pontos;
    private Date dataAvaliacao;
    private Cliente cliente;

    public Avaliacao(String titulo, String descricao, float pontos, Date dataAvaliacao, Cliente cliente) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.pontos = pontos;
        this.dataAvaliacao = dataAvaliacao;
        this.cliente = cliente;
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

    public float getPontos() {
        return pontos;
    }

    public void setPontos(float pontos) {
        this.pontos = pontos;
    }

    public Date getDataAvaliacao() {
        return dataAvaliacao;
    }

    public void setDataAvaliacao(Date dataAvaliacao) {
        this.dataAvaliacao = dataAvaliacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
