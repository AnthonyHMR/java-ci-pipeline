public class Calculadora{
    private int primerNumero;
    private int segundoNumero;

    public Calculadora(int numero1, int numero2) {
        this.primerNumero = numero1;
        this.segundoNumero = numero2;
    }

    public int sumar() {
        int suma = this.primerNumero + this.segundoNumero;
        return suma;
    }

    public int restar() {
        int resta = this.primerNumero - this.segundoNumero;
        return resta;
    }

    public int multiplicar() {
        int multiplicación = this.primerNumero * this.segundoNumero;
        return multiplicación;
    }

    public int dividir() {
        int division = this.primerNumero / this.segundoNumero;
        return division;
    }
}
