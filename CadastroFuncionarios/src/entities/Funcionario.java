package entities;

public class Funcionario extends Pessoa{

    private String idFirma;
    private double salario;

    public Funcionario(String nome, String RG, String idFirma,double salario) {
        super(nome, RG);
        this.idFirma = idFirma;
        this.salario=salario;
    }

    public String getIdFirma() {
        return idFirma;
    }

    public void setIdFirma(String idFirma) {
        this.idFirma = idFirma;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString(){
        return "A pessoa "+getNome()+", RG:"+getRG()+", ID:"+getIdFirma()+", tem salário "+ String.format("%.2f", getSalario());
    }
}
