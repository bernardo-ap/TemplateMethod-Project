public class MoedaUS extends Moeda{

    public String verificiarViabilidadeMoeda() {
        if (this.calcularPrecoBRL() >= 5){
            return "Moeda cara";
        }else{
            return "Moeda barata";
        }
    }

    @Override
    public String getTipo() {
        return "MoedaUS";
    }
}
