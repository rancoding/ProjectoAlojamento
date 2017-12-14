/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoalojamento;

import alojamento.Alojamento;
import alojamento.CaracteristicasAlojamento;
import alojamento.TipoAlojamento;
import alojamento.TipoCama;
import alojamento.localidade.Concelho;
import alojamento.localidade.Localidade;
import alojamento.reserva.TipoPagamento;
import alojamento.reserva.TipoReserva;
import java.util.List;
import java.util.Map;
import utilizador.Utilizador;
import utilizador.contacto.Categoria;
import utilizador.contacto.Departamento;
import utilizador.contacto.Estado;
import utilizador.contacto.Ticket;
import utilizador.contacto.TipoTicket;

/**
 *
 * @author Rafael
 */
public class Repositorio {
    private Map<Alojamento, Concelho> alojamentos;
    private List<CaracteristicasAlojamento> caracteristicas;
    private List<TipoAlojamento> tipoAlojamento;
    private List<TipoCama> tipoCama;
    private List<Localidade> localidades;
    private List<TipoPagamento> tipoPagamento;
    private List<TipoReserva> tipoReserva;
    private List<Utilizador> utilizadores;
    private List<Ticket> tickets;
    private List<Categoria> categoriasTicket;
    private List<Estado> estadosTicket;
    private List<TipoTicket> tiposTicket;
    private List<Departamento> departamentos;
}
