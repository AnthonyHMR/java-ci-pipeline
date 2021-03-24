public class Calculadora{
    private int primerNumero;
    private int segundoNumero;

    public Calculadora(int numero1, int numero2) {
        this.primerNumero = numero1;
        this.segundoNumero = numero2;
    }

    public void printSuma(){
        Suma suma = new Suma(primerNumero, segundoNumero);
        int resultado = suma.sumar();
        System.out.println(resultado);
    }

    public void printResta(){
        Resta resta = new Resta(primerNumero, segundoNumero);
        int resultado = resta.restar();
        System.out.println(resultado);
    }

    public void printMultiplicacion(){
        Multiplicacion multiplicacion = new Multiplicacion(primerNumero, segundoNumero);
        int resultado = multiplicacion.multiplicar();
        System.out.println(resultado);
    }

    public void printDivision(){
        Division division = new Division(primerNumero, segundoNumero);
        double resultado = division.dividir();
        System.out.println(resultado);
    }
}
