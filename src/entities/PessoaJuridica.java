package entities;

public class PessoaJuridica extends Contribuintes{

    private Integer numerosFuncionarios;

    public PessoaJuridica(){
        super();
    }

    public PessoaJuridica(String name, Double rendaAnual, Integer numerosFuncionarios) {
        super(name, rendaAnual);
        this.numerosFuncionarios = numerosFuncionarios;
    }

    public Integer getNumerosFuncionarios() {
        return numerosFuncionarios;
    }

    @Override
    public Double valorImposto() {
        if(numerosFuncionarios <= 10){
            return getRendaAnual() * 16 / 100;
        } else
            return getRendaAnual() * 14 / 100;
    }
}
