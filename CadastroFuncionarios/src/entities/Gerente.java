package entities;

public class Gerente extends Funcionario{

    private String cargo;

    public Gerente(String nome, String RG, String idFirma, double salario, String cargo) {
        super(nome, RG, idFirma, salario);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double calcularBonus(){
        return getSalario()*1.1;
    }

    @Override
    public String toString(){
        return "A pessoa "+getNome()+", RG:"+getRG()+", ID:"+getIdFirma()+", tem cargo de "+getCargo()+"/n O salário com bônus de gerente de 10% vale"+String.format("%.2f",calcularBonus());
    }
}
