package fabio.demo.cadastro;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Ordens")
public class Ordem {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String endereco_cliente;
    private String telefone_cliente;
    private String email_cliente;
    private String tipo_equipamento;
    private String marca_equipamento;
    private String problema_equipamento;
    private String order_status;
    private String observacoes;


    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getEndereco_cliente() {
        return endereco_cliente;
    }

    public void setEndereco_cliente(String endereco_cliente) {
        this.endereco_cliente = endereco_cliente;
    }

    public String getTelefone_cliente() {
        return telefone_cliente;
    }

    public void setTelefone_cliente(String telefone_cliente) {
        this.telefone_cliente = telefone_cliente;
    }

    public String getEmail_cliente() {
        return email_cliente;
    }

    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }

    public String getTipo_equipamento() {
        return tipo_equipamento;
    }

    public void setTipo_equipamento(String tipo_equipamento) {
        this.tipo_equipamento = tipo_equipamento;
    }

    public String getMarca_equipamento() {
        return marca_equipamento;
    }

    public void setMarca_equipamento(String marca_equipamento) {
        this.marca_equipamento = marca_equipamento;
    }

    public String getProblema_equipamento() {
        return problema_equipamento;
    }

    public void setProblema_equipamento(String problema_equipamento) {
        this.problema_equipamento = problema_equipamento;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

}
