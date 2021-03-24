public class Resta {
    private int primerNumero;
    private int segundoNumero;

    public Resta(int numero1, int numero2) {
        this.primerNumero = numero1;
        this.segundoNumero = numero2;
    }

    public int restar() {
        int resta = this.primerNumero - this.segundoNumero;
        return resta;
    }
}
