import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testCalculadora {

    private Calculadora calculadora;

    @Test
    public void SumaPositivos() throws Exception{
        calculadora = new Calculadora(10, 5);
        assertEquals(15, calculadora.sumar());
    }

    @Test
    public void SumaNegativos() throws Exception{
        calculadora = new Calculadora(-15, -5);
        assertEquals(-20, calculadora.sumar());
    }

    @Test
    public void RestaPositivos() throws Exception{
        calculadora = new Calculadora(10, 5);
        assertEquals(5, calculadora.restar());
    }

    @Test
    public void RestaNegativos() throws Exception{
        calculadora = new Calculadora(-15, -5);
        assertEquals(-10, calculadora.restar());
    }

    @Test
    public void MultiplicaPositivos() throws Exception{
        calculadora = new Calculadora(10, 5);
        assertEquals(50, calculadora.multiplicar());
    }

    @Test
    public void MultiplicaNegativos() throws Exception{
        calculadora = new Calculadora(-15, -5);
        assertEquals(75, calculadora.multiplicar());
    }

    @Test
    public void DividePositivos() throws Exception{
        calculadora = new Calculadora(10, 5);
        assertEquals(2, calculadora.dividir());
    }

    @Test
    public void DivideNegativos() throws Exception{
        calculadora = new Calculadora(-15, -5);
        assertEquals(3, calculadora.dividir());
    }
}
