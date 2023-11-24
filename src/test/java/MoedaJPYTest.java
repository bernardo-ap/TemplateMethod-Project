import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoedaJPYTest {

    @Test
    void deveRetornarMoedaBarata() {
        MoedaJPY moeda = new MoedaJPY();
        moeda.setValorMoeda(5);
        assertEquals("Moeda barata", moeda.verificiarViabilidadeMoeda());
    }

    @Test
    void deveRetornarMoedaCara() {
        MoedaJPY moeda = new MoedaJPY();
        moeda.setValorMoeda(20);
        assertEquals("Moeda cara", moeda.verificiarViabilidadeMoeda());
    }

    @Test
    void deveRetornarInformacoes() {
        MoedaJPY moeda = new MoedaJPY();
        moeda.setValorMoeda(20);
        moeda.setPaisMoeda("Japao");
        moeda.setSigla("JP");
        assertEquals("MoedaJPY{sigla=JP, paisMoeda='Japao', resultado=Moeda cara}", moeda.getInfo());
    }

}