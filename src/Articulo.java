import java.util.List;

public class Articulo {
	private String titulo, periodista, texto;
	private List<String> temas;
	private int palabras;
	private long idArticulo;

	public Articulo(String titulo, String periodista, long idArticulo, int palabras, String texto){
	this.titulo= titulo;
	this.periodista= periodista;
	this.idArticulo= idArticulo;
	this.palabras= palabras;
	this.texto= texto;
	}

	public boolean addTema(String tema){
	return temas.add(tema);
	}

	public String getPeriodista(){
	return periodista;
	}

	public void setPeriodista(String periodista){
	this.periodista= periodista;
	}

	public int getPalabras(){
	return palabras;
	}

	public void setPalabras(int palabras){
	this.palabras= palabras;
	}

	public long getIdArticulo(){
	return idArticulo;
	}

	public boolean contieneTema(String tema){
	return temas.contains(tema);
	}
}
