public class Multiplicacion {
    private int primerNumero;
    private int segundoNumero;

    public Multiplicacion(int numero1, int numero2) {
        this.primerNumero = numero1;
        this.segundoNumero = numero2;
    }

    public int multiplicar() {
        int multiplicación = this.primerNumero * this.segundoNumero;
        return multiplicación;
    }
}
