import java.util.ArrayList;

public class Atleta {
	private String nombre;
	private String pais;
	private int edad;
	private ArrayList<Discliplina> listaDisciplinas;
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
		this.edad = edad;
	}

	public ArrayList<Discliplina> getListaDisciplinas() {
		throw new UnsupportedOperationException();
	}

	public Equipo getEquipo() {
		return this.equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
}