public class Lampada {

    private boolean onOff;

    public Lampada(boolean onOff) {
        this.onOff = onOff;
    }

    public boolean isOnOff() {
        return onOff;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    public boolean alternarEstado(boolean onOff){
        return !onOff;
    }

}
