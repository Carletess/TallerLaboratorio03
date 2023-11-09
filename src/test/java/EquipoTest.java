import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class EquipoTest {

    @Test
    void agregarAtleta() {
        // Crear una instancia de Equipo
        Equipo equipo = new Equipo();
        equipo.setNombre("Equipo A");

        // Crear una instancia de Atleta
        Atleta atleta = new Atleta();
        atleta.setNombre("Atleta 1");

        // Agregar el atleta al equipo
        equipo.agregarAtleta(atleta);

        // Verificar que el atleta se haya agregado correctamente al equipo
        assertTrue(equipo.getListaAtletas().contains(atleta));
    }

    @Test
    void eliminarAtleta() {
        // Crear una instancia de Equipo
        Equipo equipo = new Equipo();
        equipo.setNombre("Equipo B");

        // Crear una instancia de Atleta
        Atleta atleta = new Atleta();
        atleta.setNombre("Atleta 2");

        // Agregar el atleta al equipo
        equipo.agregarAtleta(atleta);

        // Eliminar el atleta del equipo
        equipo.eliminarAtleta(atleta);

        // Verificar que el atleta se haya eliminado correctamente del equipo
        assertFalse(equipo.getListaAtletas().contains(atleta));
    }
}
