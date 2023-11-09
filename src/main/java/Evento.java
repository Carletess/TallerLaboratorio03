import java.util.ArrayList;

public class Evento {
	private Disclipina discliplina;
	private ArrayList<Atleta> listaAtletas;
	private ArrayList<Equipo> listaEquipo;
	private Disciplina disciplina;
	private ArrayList<Equipo> equipos = new ArrayList<Equipo>();

	public Disclipina getDiscliplina() {
		return this.discliplina;
	}

	public void setDiscliplina(Disclipina discliplina) {
		this.discliplina = discliplina;
	}

	public ArrayList<Atleta> getListaAtletas() {
		throw new UnsupportedOperationException();
	}

	public void setListaAtletas(ArrayList<Atleta> listaAtletas) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Equipo> getListaEquipo() {
		throw new UnsupportedOperationException();
	}

	public void setListaEquipo(ArrayList<Equipo> listaEquipo) {
		throw new UnsupportedOperationException();
	}
}