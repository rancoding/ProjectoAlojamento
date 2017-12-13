/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilizador;

import java.util.Date;
import java.util.List;
import utilizador.contacto.Messagem;

/**
 *
 * @author Rafael
 */
public class Dono extends Utilizador {
    private boolean banido;

    public Dono(boolean banido, String username, String password, String nome, String cartaoCidadao, int nFiscal, String morada, String localidade, Date dataCriacao, List<Messagem> mensagem, boolean perfilPrivado){
        super(username, password,nome, cartaoCidadao,  nFiscal, morada, localidade,dataCriacao, mensagem, perfilPrivado);
        this.banido = false;
    }

    public boolean isBanido() {
        return banido;
    }

    public void setBanido(boolean banido) {
        this.banido = banido;
    }
    
    
}
