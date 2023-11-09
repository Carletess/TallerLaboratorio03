import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JuegosPanamericanosTest {

    @Test
    void getListaEventos() {
        JuegosPanamericanos juegos = new JuegosPanamericanos();
        assertNotNull(juegos.getListaEventos(), "La lista de eventos no debería ser nula inicialmente");
    }

    @Test
    void agregarEvento() {
        JuegosPanamericanos juegos = new JuegosPanamericanos();
        Evento evento = new Evento();
        juegos.agregarEvento(evento);
        assertTrue(juegos.getListaEventos().contains(evento), "La lista de eventos debería contener el evento agregado");
    }

    @Test
    void eliminarEvento() {
        JuegosPanamericanos juegos = new JuegosPanamericanos();
        Evento evento = new Evento();
        juegos.agregarEvento(evento);
        juegos.eliminarEvento(evento);
        assertFalse(juegos.getListaEventos().contains(evento), "La lista de eventos no debería contener el evento eliminado");
    }

    @Test
    void getListaDisciplinas() {
        JuegosPanamericanos juegos = new JuegosPanamericanos();
        assertNotNull(juegos.getListaDisciplinas(), "La lista de disciplinas no debería ser nula inicialmente");
    }

    @Test
    void agregarDisciplina() {
        JuegosPanamericanos juegos = new JuegosPanamericanos();
        Disciplina disciplina = new Disciplina();
        juegos.agregarDisciplina(disciplina);
        assertTrue(juegos.getListaDisciplinas().contains(disciplina), "La lista de disciplinas debería contener la disciplina agregada");
    }

    @Test
    void eliminarDisciplina() {
        JuegosPanamericanos juegos = new JuegosPanamericanos();
        Disciplina disciplina = new Disciplina();
        juegos.agregarDisciplina(disciplina);
        juegos.eliminarDisciplina(disciplina);
        assertFalse(juegos.getListaDisciplinas().contains(disciplina), "La lista de disciplinas no debería contener la disciplina eliminada");
    }
    @Test
    void mostrarInformacion() {
    }

    @Test
    void mostrarEventos() {
    }
}