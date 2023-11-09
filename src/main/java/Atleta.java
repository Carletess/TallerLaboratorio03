import java.util.ArrayList;

public class Atleta {
	private String nombre;
	private String pais;
	private int edad;
	private ArrayList<Disciplina> listaDisciplinas;
	private Equipo equipo;
	private ArrayList<Equipo> equipos = new ArrayList<Equipo>();
	private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		if (edad < 0) {
			throw new IllegalArgumentException("La edad no puede ser negativa");
		}
		this.edad = edad;
	}

	public ArrayList<Disciplina> getListaDisciplinas() {
		return this.listaDisciplinas;
	}

	public void agregarDisciplina(Disciplina disciplina) {
		disciplinas.add(disciplina);
	}

	public void eliminarDisciplina(Disciplina disciplina) {
		disciplinas.remove(disciplina);
	}

	public Equipo getEquipo() {
		return this.equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("País: " + pais);
		System.out.println("Edad: " + (edad >= 0 ? edad : "Edad no especificada"));
		System.out.println("Equipo: " + (equipo != null ? equipo.getNombre() : "N/A"));
		System.out.println("Disciplinas:");

		if (disciplinas.isEmpty()) {
			System.out.println("No hay disciplinas asociadas");
		} else {
			for (Disciplina disciplina : disciplinas) {
				System.out.println("- " + disciplina.getNombre());
			}
		}
	}
}