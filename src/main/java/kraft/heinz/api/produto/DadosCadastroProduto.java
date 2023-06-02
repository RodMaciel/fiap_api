package kraft.heinz.api.produto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record DadosCadastroProduto(

        @NotBlank
        String nome,
        @NotBlank
        String marca,
        @NotNull
        Tipo tipo,

        BigDecimal porcentagem,
        @NotBlank
        String peso,

        BigDecimal preco ,
        String descricao,
        String ingredientes) {
}
