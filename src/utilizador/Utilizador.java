package utilizador;

import java.util.Date;
import java.util.List;
import utilizador.contacto.Messagem;


public class Utilizador {
    private String username;
    private String password;
    private String nome;
    private String cartaoCidadao;
    private int nFiscal;
    private int telefone;
    private String morada;
    private String localidade;
    private Date dataCriacao;
    private List<Messagem> mensagem;
    private boolean perfilPrivado;

    
    
    public Utilizador(String username, String password, String nome, String cartaoCidadao, int nFiscal, String morada, String localidade, Date dataCriacao, List<Messagem> mensagem, boolean perfilPrivado) {
        this.username = username;
        this.password = password;
        this.nome = nome;
        this.cartaoCidadao = cartaoCidadao;
        this.nFiscal = nFiscal;
        this.morada = morada;
        this.localidade = localidade;
        this.dataCriacao = dataCriacao;
        this.mensagem = mensagem;
        this.perfilPrivado = perfilPrivado;
    }

    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCartaoCidadao() {
        return cartaoCidadao;
    }

    public void setCartaoCidadao(String cartaoCidadao) {
        this.cartaoCidadao = cartaoCidadao;
    }

    public int getnFiscal() {
        return nFiscal;
    }

    public void setnFiscal(int nFiscal) {
        this.nFiscal = nFiscal;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public List<Messagem> getMensagem() {
        return mensagem;
    }

    public void setMensagem(List<Messagem> mensagem) {
        this.mensagem = mensagem;
    }

    public boolean isPerfilPrivado() {
        return perfilPrivado;
    }

    public void setPerfilPrivado(boolean perfilPrivado) {
        this.perfilPrivado = perfilPrivado;
    }
    
    
    
}
