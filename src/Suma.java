public class Suma {
    private int primerNumero;
    private int segundoNumero;

    public Suma(int numero1, int numero2) {
        this.primerNumero = numero1;
        this.segundoNumero = numero2;
    }

    public int sumar() {
        int suma = this.primerNumero + this.segundoNumero;
        return suma;
    }
}
