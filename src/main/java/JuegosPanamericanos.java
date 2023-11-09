import java.util.ArrayList;

public class JuegosPanamericanos {
	private ArrayList<Evento> listaEventos;
	private ArrayList<Disciplina> listaDisciplinas;

	public JuegosPanamericanos() {
		this.listaEventos = new ArrayList<>();
		this.listaDisciplinas = new ArrayList<>();
	}

	public ArrayList<Evento> getListaEventos() {
		return this.listaEventos;
	}

	public void agregarEvento(Evento evento) {
		this.listaEventos.add(evento);
	}

	public void eliminarEvento(Evento evento) {
		this.listaEventos.remove(evento);
	}

	public ArrayList<Disciplina> getListaDisciplinas() {
		return this.listaDisciplinas;
	}

	public void agregarDisciplina(Disciplina disciplina) {
		this.listaDisciplinas.add(disciplina);
	}

	public void eliminarDisciplina(Disciplina disciplina) {
		this.listaDisciplinas.remove(disciplina);
	}

	public void mostrarInformacion() {
		System.out.println("Información Juegos Panamericanos");
		System.out.println("Disciplinas:");
		for (Disciplina disciplina : listaDisciplinas) {
			System.out.println("- " + disciplina.getNombre());
		}
		System.out.println("Eventos:");
		for (Evento evento : listaEventos) {
			System.out.println("- " + evento.getDisciplina().getNombre() + " - Fecha: " + evento.getFecha());
		}
	}

	public void mostrarEventos() {
		System.out.println("Lista Eventos:");
		for (Evento evento : listaEventos) {
			System.out.println("- " + evento.getDisciplina().getNombre() + " - Fecha: " + evento.getFecha());
		}
	}
}
