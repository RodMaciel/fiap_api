package kraft.heinz.api.produto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Table (name = "produtos")
@Entity (name = "produto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Produto {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @Enumerated(EnumType.STRING)
    private Tipo tipo;
    private String marca;
    private String peso;
    private BigDecimal preco;
    private String descricao;
    private BigDecimal porcentagem;

    private String ingredientes;

    private Boolean ativo;

    public Produto(DadosCadastroProduto dados) {
        this.ativo = true;
        this.nome = dados.nome();
        this.porcentagem = dados.porcentagem();
        this.tipo = dados.tipo();
        this.marca = dados.marca();
        this.peso = dados.peso();
        this.preco = dados.preco();
        this.descricao = dados.descricao();
        this.ingredientes = dados.ingredientes();

    }


    public void atualizarInformacoes(DadosAtualizacaoProduto dados) {
        if(dados.nome()!= null ) {
            this.nome = dados.nome();
        }
        if(dados.porcentagem()!= null ) {
            this.porcentagem = dados.porcentagem();
        }
        if(dados.tipo() != null ) {
            this.tipo = dados.tipo();
        }
        if(dados.preco() != null ) {
            this.preco  = dados.preco();
        }
        if(dados.descricao() != null ){
            this.descricao = dados.descricao();
        }

    }

    public void excluir() {
        this.ativo = false;
    }
}
