public abstract class Moeda {

    private String sigla;
    private String paisMoeda;
    private float valorMoeda;

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getPaisMoeda() {
        return paisMoeda;
    }

    public void setPaisMoeda(String paisMoeda) {
        this.paisMoeda = paisMoeda;
    }

    public float getValorMoeda() {
        return valorMoeda;
    }

    public void setValorMoeda(float valorMoeda) {
        this.valorMoeda = valorMoeda;
    }

    public float calcularPrecoBRL() {
        return this.valorMoeda / 2;
    }

    public abstract String verificiarViabilidadeMoeda();

    public String getTipo() {
        return "Moeda";
    }

    public String getInfo() {
        return getTipo() + "{" +
                            "sigla=" + this.sigla +
                            ", paisMoeda='" + this.paisMoeda + '\'' +
                            ", resultado=" + this.verificiarViabilidadeMoeda() +
                            '}';
    }
}
