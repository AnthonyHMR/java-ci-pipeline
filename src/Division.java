public class Division {
    private int primerNumero;
    private int segundoNumero;

    public Division(int numero1, int numero2) {
        this.primerNumero = numero1;
        this.segundoNumero = numero2;
    }

    public double dividir() {
        double division = (double)this.primerNumero / (double)this.segundoNumero;
        return division;
    }
}
