package kraft.heinz.api.produto;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record DadosAtualizacaoProduto(
        @NotNull
        Long id,
        BigDecimal porcentagem,
        Tipo tipo,
        BigDecimal preco,
        String nome,
        String descricao) {
}
