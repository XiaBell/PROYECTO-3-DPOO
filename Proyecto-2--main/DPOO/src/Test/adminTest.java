package interfaces;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import entities.Galeria;
import logic.Comprador;

public class adminTest {

    private final InputStream originalIn = System.in;
    private ByteArrayInputStream inContent;
    private Comprador comprador;

    @Test
    public void testConsignarPieza() {
        // Ejecuta la consola con un usuario y contraseña de prueba
        buyer_main.consola("usuario_prueba", "contraseña_prueba");

        // Verifica que la pieza ha sido consignada correctamente
        // Esto dependerá de cómo esté implementado el método infoconsignarpieza
        // y qué es lo que retorna o cómo cambia el estado del objeto comprador
        // Por ejemplo, si infoconsignarpieza cambia un atributo del comprador:
        assertEquals("Escultura", comprador.getPiezaConsignada());
    }

    @After
    public void restoreStreams() {
        // Restaura la entrada estándar original
        System.setIn(originalIn);
    }
}
