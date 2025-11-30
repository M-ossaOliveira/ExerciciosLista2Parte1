package entities;

public class Gato extends entities.Animal {

    private String nome;
    private String tipoSom;

    public Gato(String nome, String tipoSom) {
        this.nome = nome;
        this.tipoSom = tipoSom;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoSom() {
        return tipoSom;
    }

    public void setTipoSom(String tipoSom) {
        this.tipoSom = tipoSom;
    }

    @Override
    public String emitirSom(){
        return tipoSom;
    }
}
