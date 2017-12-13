/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilizador;

import alojamento.Alojamento;
import java.util.Date;
import java.util.List;
import utilizador.contacto.Messagem;

/**
 *
 * @author Rafael
 */
public class Cliente extends Utilizador {
    
    private boolean banido;
    private List<Alojamento> favorito;

    public Cliente(boolean banido,List<Alojamento> favorito, String username, String password, String nome, String cartaoCidadao, int nFiscal, String morada, String localidade, Date dataCriacao, List<Messagem> mensagem, boolean perfilPrivado){
        super(username, password,nome, cartaoCidadao,  nFiscal, morada, localidade,dataCriacao, mensagem, perfilPrivado);
        this.banido = false;
    }

    public boolean isBanido() {
        return banido;
    }

    public void setBanido(boolean banido) {
        this.banido = banido;
    }

    public List<Alojamento> getFavorito() {
        return favorito;
    }

    public void setFavorito(List<Alojamento> favorito) {
        this.favorito = favorito;
    }
    
    
    
}
