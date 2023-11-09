import java.util.ArrayList;

public class Disciplina {
	private String nombre;
	private int numeroDeParticipantes;
	private String recordMundial;
	private ArrayList<Equipo> equipos = new ArrayList<Equipo>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroDeParticipantes() {
		return this.numeroDeParticipantes;
	}

	public void setNumeroDeParticipantes(int numeroDeParticipantes) {
		this.numeroDeParticipantes = numeroDeParticipantes;
	}

	public String getRecordMundial() {
		return this.recordMundial;
	}

	public void setRecordMundial(String recordMundial) {
		this.recordMundial = recordMundial;
	}

	public void mostrarInformacion() {
		System.out.println("Nombre disciplina: " + nombre);
		System.out.println("Número participantes: " + numeroDeParticipantes);
		System.out.println("Récord mundial: " + recordMundial);
		System.out.println("Equipos que participan:");
		for (Equipo equipo : equipos) {
			System.out.println("- " + equipo.getNombre());
		}
	}

}