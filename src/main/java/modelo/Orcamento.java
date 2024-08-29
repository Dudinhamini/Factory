package modelo;

import java.math.BigDecimal;

public class Orcamento {
    public BigDecimal valorOrcamento;
    public String IcmsRegiao;

    public Orcamento(BigDecimal valorOrcamento, String icmsRegiao) {
        this.valorOrcamento = valorOrcamento;
        IcmsRegiao = icmsRegiao;
    }

}
