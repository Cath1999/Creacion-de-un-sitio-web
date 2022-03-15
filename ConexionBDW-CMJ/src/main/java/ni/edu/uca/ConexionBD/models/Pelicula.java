package ni.edu.uca.ConexionBD.models;

public class Pelicula {
	private int idPelicula;
	private String titulo;
	private String tipoMetraje;
	private int idClasificacion;
	private int idNacionalidad;
	private String duracion;
	private String sinopsis;

	public Pelicula() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pelicula(int idPelicula, String titulo, String tipoMetraje, int idClasificacion,
			int idNacionalidad, String duracion, String sinopsis) {
		super();
		this.idPelicula = idPelicula;
		this.titulo = titulo;
		this.tipoMetraje = tipoMetraje;
		this.idClasificacion = idClasificacion;
		this.idNacionalidad = idNacionalidad;
		this.duracion = duracion;
		this.sinopsis = sinopsis;
	}
	
	public int getIdPelicula() {
		return idPelicula;
	}
	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTipoMetraje() {
		return tipoMetraje;
	}
	public void setTipoMetraje(String tipoMetraje) {
		this.tipoMetraje = tipoMetraje;
	}
	public int getIdClasificacion() {
		return idClasificacion;
	}
	public void setIdClasificacion(int idClasificacion) {
		this.idClasificacion = idClasificacion;
	}
	public int getIdNacionalidad() {
		return idNacionalidad;
	}
	public void setIdNacionalidad(int idNacionalidad) {
		this.idNacionalidad = idNacionalidad;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	@Override
	public String toString() {
		return "Pelicula [idPelicula=" + idPelicula + ", titulo=" + titulo + ", tipoMetraje="
				+ tipoMetraje + ", idClasificacion=" + idClasificacion + ","
						+ " idNacionalidad=" + idNacionalidad + ", duracion=" + duracion + 
				", sinopsis=" + sinopsis + "]";
	}
	
	

}
