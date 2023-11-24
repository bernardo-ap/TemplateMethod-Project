public class MoedaJPY extends Moeda{

    public String verificiarViabilidadeMoeda() {
        if (this.calcularPrecoBRL() >= 3){
            return "Moeda cara";
        }else{
            return "Moeda barata";
        }
    }

    @Override
    public String getTipo() {
        return "MoedaJPY";
    }
}
