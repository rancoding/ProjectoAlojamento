/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilizador;

import java.util.Date;
import java.util.List;
import utilizador.contacto.Departamento;
import utilizador.contacto.Messagem;

/**
 *
 * @author Rafael
 */
public class Administrador extends Utilizador {
    
    private Departamento departamento;

    public Administrador(Departamento departamento, String username, String password, String nome, String cartaoCidadao, int nFiscal, String morada, String localidade, Date dataCriacao, List<Messagem> mensagem, boolean perfilPrivado){
        super(username, password,nome, cartaoCidadao,  nFiscal, morada, localidade,dataCriacao, mensagem, perfilPrivado);
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    
    
}
