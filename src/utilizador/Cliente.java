/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilizador;

import alojamento.Alojamento;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class Cliente extends Utilizador {
    
    private boolean banido;
    private List<Alojamento> favoritos;

    public Cliente(String username, String password, String nome, String cartaoCidadao, int nFiscal, int telefone, String morada, String localidade, Date dataCriacao, boolean perfilPrivado){
        super(username, password,nome, cartaoCidadao,  nFiscal, telefone, morada, localidade,dataCriacao, perfilPrivado);
        this.banido = false;
        favoritos = new ArrayList<>();
    }

    public boolean isBanido() {
        return banido;
    }

    public void setBanido(boolean banido) {
        this.banido = banido;
    }

    public List<Alojamento> getFavorito() {
        return favoritos;
    }

    public void setFavorito(List<Alojamento> favorito) {
        this.favoritos = favorito;
    }
    
    
    
}
