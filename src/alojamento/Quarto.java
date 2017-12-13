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
public class Quarto {
    private int nCamas;
    private List<TipoCama> tipoCama;

    public Quarto(int nCamas) {
        this.nCamas = nCamas;
        tipoCama = new ArrayList<>();
    }

    public int getnCamas() {
        return nCamas;
    }

    public void setnCamas(int nCamas) {
        this.nCamas = nCamas;
    }

    public List<TipoCama> getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(List<TipoCama> tipoCama) {
        this.tipoCama = tipoCama;
    }
}
