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
        if (getRendaAnual() < 20000.0) {
            return getRendaAnual() * 0.15 - getGastosSaude() * 0.5;
        }
        else {
            return getRendaAnual() * 0.25 - getGastosSaude() * 0.5;
        }

    }
}
