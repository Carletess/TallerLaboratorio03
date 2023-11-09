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
		throw new UnsupportedOperationException();
	}

	public void setListaAtletas(ArrayList<Atleta> listaAtletas) {
		throw new UnsupportedOperationException();
	}

	public Disciplina getDisciplina() {
		return this.disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
}