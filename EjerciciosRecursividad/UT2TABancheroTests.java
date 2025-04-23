import org.junit.Test;
import static org.junit.Assert.*;

public class EjemplosRecursividadTest {
    
    @Test
    public void testTodosPares() {
        assertTrue(EjemplosRecursividad.todosPares(2468));
        assertFalse(EjemplosRecursividad.todosPares(13579));
        assertTrue(EjemplosRecursividad.todosPares(0));
    }
    
    @Test
    public void testSumDigits() {
        assertEquals(6, EjemplosRecursividad.sumDigits(123));
        assertEquals(0, EjemplosRecursividad.sumDigits(0));
        assertEquals(15, EjemplosRecursividad.sumDigits(12345));
    }
    
    @Test
    public void testImprimirInverso() {
        EjemplosRecursividad.imprimirInverso("Hola");
        // Add assertion here to check the output
    }
    
    @Test
    public void testFactorial() {
        assertEquals(1, EjemplosRecursividad.factorial(0));
        assertEquals(1, EjemplosRecursividad.factorial(1));
        assertEquals(120, EjemplosRecursividad.factorial(5));
    }
    
    @Test
    public void testSumaNumeros() {
        assertEquals(0, EjemplosRecursividad.sumaNumeros(0));
        assertEquals(15, EjemplosRecursividad.sumaNumeros(5));
        assertEquals(55, EjemplosRecursividad.sumaNumeros(10));
    }
    
    @Test
    public void testPrintNumeros() {
        EjemplosRecursividad.printNumeros(5);
        // Add assertion here to check the output
    }
    
    @Test
    public void testSumBinaryDigits() {
        assertEquals(3, EjemplosRecursividad.sumBinaryDigits("1011"));
        assertEquals(0, EjemplosRecursividad.sumBinaryDigits("0"));
        assertEquals(1, EjemplosRecursividad.sumBinaryDigits("1"));
    }
    
    @Test
    public void testGenerarPermutaciones() {
        EjemplosRecursividad.generarPermutaciones("abc", "");
        // Add assertion here to check the output
    }
}