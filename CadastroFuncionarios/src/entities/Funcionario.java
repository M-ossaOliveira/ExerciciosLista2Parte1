package entities;

public class Funcionario extends Pessoa{

    private String idFirma;

    public Funcionario(String nome, String RG, String idFirma) {
        super(nome, RG);
        this.idFirma = idFirma;
    }

    public String getIdFirma() {
        return idFirma;
    }

    public void setIdFirma(String idFirma) {
        this.idFirma = idFirma;
    }
}
