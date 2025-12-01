package entities;

public class Gerente extends Funcionario{

    private String cargo;

    public Gerente(String nome, String RG, String idFirma, String cargo) {
        super(nome, RG, idFirma);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString(){
        return "A pessoa "+getNome()+", RG:"+getRG()+", ID:"+getIdFirma()+", tem cargo de "+getCargo();
    }
}
