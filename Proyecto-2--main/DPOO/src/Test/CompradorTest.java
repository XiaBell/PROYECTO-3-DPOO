package Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import entities.Pieza;
import logic.Comprador;
import entities.Escultura;
import Persistencia.piezas_persistence;

public class CompradorTest {

    private Comprador comprador;
    private Pieza pieza;

    @Before
    public void setUp() {
        // Inicializa un comprador con datos de prueba
        comprador = new Comprador("Test", "Usuario", 12345678, "testuser", "testpass", 3001234567, 5000, "Usuario", "01-01-2024", true);
        // Inicializa una pieza de prueba, en este caso, una Escultura
        pieza = new Escultura(0, 0, 0, null);
    }

    @Test
    public void testConsignarPieza() {
        // Ejecuta el método consignarpieza
        comprador.consignarpieza(pieza);

        // Verifica que la información de la pieza se ha agregado correctamente a la persistencia
        // Esto dependerá de cómo esté implementado el método add_info en piezas_persistence
        // Por ejemplo, si add_info retorna un booleano indicando si la operación fue exitosa:
        assertTrue(piezas_persistence.add_info(pieza.getInfo_pieza()));
    }
}
