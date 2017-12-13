/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alojamento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class CaracteristicasAlojamento {
    private int nMinimoPessoas;
    private int nMaximoPessoas;
    private int nQuartos;
    private int nQuartosBanho;
    private List<Quarto> quartos;
    private boolean animaisEstimacao;
    private boolean cozinha;
    private boolean maquinaLavar;
    private boolean pequenoAlmoco;
    private boolean piscina;
    private boolean wifi;

    public CaracteristicasAlojamento(int nMinimoPessoas, int nMaximoPessoas, int nQuartos, int nQuartosBanho, boolean animaisEstimacao, boolean cozinha, boolean maquinaLavar, boolean pequenoAlmoco, boolean piscina, boolean wifi) {
        this.nMinimoPessoas = nMinimoPessoas;
        this.nMaximoPessoas = nMaximoPessoas;
        this.nQuartos = nQuartos;
        this.nQuartosBanho = nQuartosBanho;
        this.quartos = new ArrayList<>();
        this.animaisEstimacao = animaisEstimacao;
        this.cozinha = cozinha;
        this.maquinaLavar = maquinaLavar;
        this.pequenoAlmoco = pequenoAlmoco;
        this.piscina = piscina;
        this.wifi = wifi;
    }

    public int getnMinimoPessoas() {
        return nMinimoPessoas;
    }

    public void setnMinimoPessoas(int nMinimoPessoas) {
        this.nMinimoPessoas = nMinimoPessoas;
    }

    public int getnMaximoPessoas() {
        return nMaximoPessoas;
    }

    public void setnMaximoPessoas(int nMaximoPessoas) {
        this.nMaximoPessoas = nMaximoPessoas;
    }

    public int getnQuartos() {
        return nQuartos;
    }

    public void setnQuartos(int nQuartos) {
        this.nQuartos = nQuartos;
    }

    public int getnQuartosBanho() {
        return nQuartosBanho;
    }

    public void setnQuartosBanho(int nQuartosBanho) {
        this.nQuartosBanho = nQuartosBanho;
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos(List<Quarto> quartos) {
        this.quartos = quartos;
    }

    public boolean isAnimaisEstimacao() {
        return animaisEstimacao;
    }

    public void setAnimaisEstimacao(boolean animaisEstimacao) {
        this.animaisEstimacao = animaisEstimacao;
    }

    public boolean isCozinha() {
        return cozinha;
    }

    public void setCozinha(boolean cozinha) {
        this.cozinha = cozinha;
    }

    public boolean isMaquinaLavar() {
        return maquinaLavar;
    }

    public void setMaquinaLavar(boolean maquinaLavar) {
        this.maquinaLavar = maquinaLavar;
    }

    public boolean isPequenoAlmoco() {
        return pequenoAlmoco;
    }

    public void setPequenoAlmoco(boolean pequenoAlmoco) {
        this.pequenoAlmoco = pequenoAlmoco;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }
    
}
