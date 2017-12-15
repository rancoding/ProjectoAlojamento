/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alojamento;

import alojamento.reserva.Reserva;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import utilizador.Dono;

/**
 *
 * @author Rafael
 */
public class Alojamento implements Serializable{
    private final int nReferencia;
    private double precoNoite;
    private String descricao;
    private TipoAlojamento tipoAlojamento;
    private Dono dono;
    private CaracteristicasAlojamento caracteristicas;
    private List<Avaliacao> avaliacoes;
    private List<Foto> fotos;
    private List<Promocao> promocoes;
    private List<Promocao> extras;
    private List<Reserva> reservas;
    private static int cont;

    public Alojamento(double precoNoite, String descricao, TipoAlojamento tipoAlojamento, Dono dono, CaracteristicasAlojamento caracteristicas) {
        this.nReferencia = cont;
        this.precoNoite = precoNoite;
        this.descricao = descricao;
        this.tipoAlojamento = tipoAlojamento;
        this.dono = dono;
        this.caracteristicas = caracteristicas;
        this.avaliacoes = new ArrayList<>();
        this.fotos = new ArrayList<>();
        this.promocoes = new ArrayList<>();
        this.extras = new ArrayList<>();
        this.reservas = new ArrayList<>();
        cont++;
    }
    
    public int getnReferencia() {
        return nReferencia;
    }

    public double getPrecoNoite() {
        return precoNoite;
    }

    public void setPrecoNoite(double precoNoite) {
        this.precoNoite = precoNoite;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoAlojamento getTipoAlojamento() {
        return tipoAlojamento;
    }

    public void setTipoAlojamento(TipoAlojamento tipoAlojamento) {
        this.tipoAlojamento = tipoAlojamento;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public CaracteristicasAlojamento getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(CaracteristicasAlojamento caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public List<Foto> getFotos() {
        return fotos;
    }

    public void setFotos(List<Foto> fotos) {
        this.fotos = fotos;
    }

    public List<Promocao> getPromocoes() {
        return promocoes;
    }

    public void setPromocoes(List<Promocao> promocoes) {
        this.promocoes = promocoes;
    }

    public List<Promocao> getExtras() {
        return extras;
    }

    public void setExtras(List<Promocao> extras) {
        this.extras = extras;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
}
