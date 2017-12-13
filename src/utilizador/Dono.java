/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilizador;

/**
 *
 * @author Rafael
 */
public class Dono extends Utilizador {
    private boolean banido;

    public Dono(boolean banido) {
        this.banido = banido;
    }

    public boolean isBanido() {
        return banido;
    }

    public void setBanido(boolean banido) {
        this.banido = banido;
    }
    
    
}
