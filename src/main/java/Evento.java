import java.util.ArrayList;
import java.util.Date;

public class Evento {
	private Disciplina disciplina;
	private ArrayList<Atleta> listaAtletas;
	private ArrayList<Equipo> listaEquipos;
	private Date fecha;

	public Disciplina getDisciplina() {
		return this.disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public ArrayList<Atleta> getListaAtletas() {
		return this.listaAtletas;
	}

	public void setListaAtletas(ArrayList<Atleta> listaAtletas) {
		this.listaAtletas = listaAtletas;
	}

	public void agregarAtleta(Atleta atleta) {
		this.listaAtletas.add(atleta);
	}

	public void eliminarAtleta(Atleta atleta) {
		this.listaAtletas.remove(atleta);
	}

	public ArrayList<Equipo> getListaEquipos() {
		return this.listaEquipos;
	}

	public void setListaEquipos(ArrayList<Equipo> listaEquipos) {
		this.listaEquipos = listaEquipos;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public void mostrarInformacion() {
		System.out.println("Disciplina del evento: " + (disciplina != null ? disciplina.getNombre() : "N/A"));
		System.out.println("Fecha del evento: " + fecha);
		System.out.println("Atletas participantes:");
		for (Atleta atleta : listaAtletas) {
			System.out.println("- " + atleta.getNombre());
		}
		System.out.println("Equipos participantes:");
		for (Equipo equipo : listaEquipos) {
			System.out.println("- " + equipo.getNombre());
		}
	}
}
