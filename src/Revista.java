import java.util.ArrayList;
import java.util.List;

public class Revista {
	private List<Articulo> elementos;
	private String titulo;
	private int ejemplar;

	public Revista(String titulo, int ejemplar){
	this.titulo= titulo;
	this.ejemplar= ejemplar;
	this.elementos= new ArrayList<Articulo>();
	}

	public boolean addElemento(Articulo articulo){
	return elementos.add(articulo);
	}

	public Articulo getArticuloEnPosicion(int posicion){
	int posicion;
	for(int i=0; i<elementos.size(); i++){ 
	if(i==posicion-1)
	return elementos.get(i);
	}
	return null;
	}

	public int getCantidadArticulosDeTema(String tema){
	int cantidad=0;
	for(Articulo a: elementos){
	if(a.contieneTema(tema)){
	cantidad++;
	}
	}
	return cantidad;
	}

}
