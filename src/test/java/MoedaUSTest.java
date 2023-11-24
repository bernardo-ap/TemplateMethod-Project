import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoedaUSTest {

    @Test
    void deveRetornarMoedaBarata() {
        MoedaUS moeda = new MoedaUS();
        moeda.setValorMoeda(9);
        assertEquals("Moeda barata", moeda.verificiarViabilidadeMoeda());
    }

    @Test
    void deveRetornarMoedaCara() {
        MoedaUS moeda = new MoedaUS();
        moeda.setValorMoeda(10);
        assertEquals("Moeda cara", moeda.verificiarViabilidadeMoeda());
    }

    @Test
    void deveRetornarInformacoes() {
        MoedaUS moeda = new MoedaUS();
        moeda.setValorMoeda(10);
        moeda.setPaisMoeda("Estados Unidos");
        moeda.setSigla("US");
        assertEquals("MoedaUS{sigla=US, paisMoeda='Estados Unidos', resultado=Moeda cara}", moeda.getInfo());
    }
}