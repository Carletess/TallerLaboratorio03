import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DisciplinaTest {

    @Test
    void getNombre() {
        // Crear una instancia de Disciplina
        Disciplina disciplina = new Disciplina();
        disciplina.setNombre("Natación");

        // Verificar que el método getNombre devuelva el valor esperado
        assertEquals("Natación", disciplina.getNombre());
    }

    @Test
    void getNumeroDeParticipantes() {
        // Crear una instancia de Disciplina
        Disciplina disciplina = new Disciplina();
        disciplina.setNumeroDeParticipantes(10);

        // Verificar que el método getNumeroDeParticipantes devuelva el valor esperado
        assertEquals(10, disciplina.getNumeroDeParticipantes());
    }
}
