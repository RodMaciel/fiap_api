package kraft.heinz.api.produto;

import java.math.BigDecimal;

public record DadosListagemProduto(Long id, String nome, Tipo tipo, BigDecimal preco, BigDecimal porcentagem, String descricao) {

    public DadosListagemProduto(Produto produto){
        this(produto.getId(),produto.getNome(),produto.getTipo(),produto.getPreco(),produto.getPorcentagem(),produto.getDescricao());
    }
}
