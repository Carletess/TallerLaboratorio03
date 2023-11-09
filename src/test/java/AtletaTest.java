import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtletaTest {

    @Test
    void getEdad() {
        // Caso normal
        Atleta atleta = new Atleta();
        atleta.setEdad(25);
        assertEquals(25, atleta.getEdad(), "La edad debería ser 25");

        // Otros casos inusuales que puedas pensar
    }

    @Test
    void setEdad() {
        // Caso normal
        Atleta atleta = new Atleta();
        atleta.setEdad(30);
        assertEquals(30, atleta.getEdad(), "La edad debería ser 30");

        // Caso con edad negativa (considera cómo debería manejarlo tu aplicación)
        assertThrows(IllegalArgumentException.class, () -> atleta.setEdad(-10),
                "La edad no puede ser negativa");

        // Caso con edad cero
        atleta.setEdad(0);
        assertEquals(0, atleta.getEdad(), "La edad debería ser 0");

        // Otros casos inusuales que puedas pensar
    }
}
