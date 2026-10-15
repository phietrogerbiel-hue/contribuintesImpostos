package entities;

public class PessoaFisica extends Contribuintes{
    private Double gastosSaude;

    public PessoaFisica(){
        super();
    }

    public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
        super(name, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    @Override
    public Double valorImposto() {
        if(getRendaAnual() < 20000.0){
            return getRendaAnual() * 15 / 100;
        } else if(getRendaAnual() < 20000.0 && getGastosSaude() >= 0){
            return (getRendaAnual() * 15 / 100) - (getGastosSaude() * 50 / 100);
        } else if (getRendaAnual() > 20000.0) {
            return getRendaAnual() * 25 / 100;
        } else {
            return (getRendaAnual() * 25 / 100) - (getGastosSaude() * 50 / 100);
        }

    }
}
