import java.util.ArrayList;

public class Equipo {
	private String nombre;
	private ArrayList<Atleta> listaAtletas;
	private Disciplina disciplina;
	private ArrayList<Atleta> atletas = new ArrayList<Atleta>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Atleta> getListaAtletas() {
		return this.atletas;
	}

	public void setListaAtletas(ArrayList<Atleta> listaAtletas) {
		this.atletas = listaAtletas;
	}

	public void agregarAtleta(Atleta atleta) {
		atletas.add(atleta);
	}

	public void eliminarAtleta(Atleta atleta) {
		atletas.remove(atleta);
	}

	public Disciplina getDisciplina() {
		return this.disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public void mostrarInformacion() {
		System.out.println("Nombre equipo: " + nombre);
		System.out.println("Disciplina: " + (disciplina != null ? disciplina.getNombre() : "N/A"));
		System.out.println("Atletas en equipo:");
		for (Atleta atleta : atletas) {
			System.out.println("- " + atleta.getNombre());
		}
	}
}