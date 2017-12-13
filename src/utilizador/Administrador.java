/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilizador;

import java.util.Date;
import java.util.List;
import utilizador.contacto.Departamento;

/**
 *
 * @author Rafael
 */
public class Administrador extends Utilizador {
    
    private Departamento departamento;

    public Administrador(String username, String password, String nome, String cartaoCidadao, int nFiscal, int telefone, String morada, String localidade, Date dataCriacao, boolean perfilPrivado){
        super(username, password,nome, cartaoCidadao,  nFiscal, telefone, morada, localidade,dataCriacao, perfilPrivado);
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    
    
}
