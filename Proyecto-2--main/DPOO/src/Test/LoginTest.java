package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.BeforeClass;
import login.login; // Asegúrate de que el nombre de la clase 'Login' tenga la primera letra en mayúscula si así está definida.

public class LoginTest { // La clase debe ser pública para que JUnit pueda ejecutarla.
	
    @BeforeClass
    public static void setUp() { // El método debe ser público y estático.
        // Configura los datos de prueba o inicializa mocks si es necesario.
        // Por ejemplo, podrías inicializar una lista de usuarios aquí si fuera necesario.
    }

    @Test
    public void testCreateUser() { // Los métodos de prueba deben ser públicos.
        // Aquí puedes probar el método createuser().
        // Por ejemplo, puedes verificar si el usuario se crea correctamente.
        login.createuser("Juan", "Perez", "12345678", "juanperez", "contraseña", "3001234567", 5000, "Usuario", "01-01-2024");
        assertNotNull(login.verifyUser("juanperez", "12345678")); 
    }

    @Test
    public void testVerifyUser() { // Los métodos de prueba deben ser públicos.
        // Aquí puedes probar el método verifyUser().
        // Por ejemplo, puedes verificar si la verificación del usuario funciona correctamente.
        String result = login.verifyUser("juanperez", "contraseña");
        // Asumiendo que esperas un rol específico como resultado, puedes usar assertEquals para verificarlo.
        assertEquals("Usuario", result); // Asegúrate de que el resultado esperado sea el correcto.
    }
}

