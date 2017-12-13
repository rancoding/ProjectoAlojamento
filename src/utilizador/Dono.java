/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilizador;

import java.util.Date;

/**
 *
 * @author Rafael
 */
public class Dono extends Utilizador {
    private boolean banido;

    public Dono(String username, String password, String nome, String cartaoCidadao, int nFiscal, int telefone, String morada, String localidade, Date dataCriacao, boolean perfilPrivado){
        super(username, password,nome, cartaoCidadao,  nFiscal, telefone, morada, localidade,dataCriacao, perfilPrivado);
        this.banido = false;
    }

    public boolean isBanido() {
        return banido;
    }

    public void setBanido(boolean banido) {
        this.banido = banido;
    }
    
    
}
