/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilizador;

import alojamento.Alojamento;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class Cliente extends Utilizador {
    
    private boolean banido;
    private List<Alojamento> favorito;

    public Cliente(boolean banido, List<Alojamento> favorito) {
        this.banido = banido;
        this.favorito = favorito;
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
