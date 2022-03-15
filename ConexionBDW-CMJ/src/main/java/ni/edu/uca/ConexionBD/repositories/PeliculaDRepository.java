package ni.edu.uca.ConexionBD.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ni.edu.uca.ConexionBD.models.Pelicula;

@Repository
public class PeliculaDRepository implements PeliculaIRepository {

	@Autowired
	JdbcTemplate operacion;
	
	@Override
	public List<Map<String, Object>> ListarRegistro() {
		// TODO Auto-generated method stub
		List<Map<String, Object>> lista = operacion.queryForList("Select * from Pelicula");
		return lista;
	}

	@Override
	public int GuardarRegistro(Pelicula p) {
		// TODO Auto-generated method stub
		int b = 0;
		b = operacion.update("Insert into Pelicula( titulo, tipoMetraje, duracion, sinopsis) values(?, ?, ? ,?)",
				 p.getTitulo(), p.getTipoMetraje(), p.getDuracion(), p.getSinopsis());
		return b;
	}

	@Override
	public int EditarRegistro(Pelicula p) {
		// TODO Auto-generated method stub
		int b = 0;
		b = operacion.update("Update Idioma set  titulo = ?, tipoMetraje = ?, duracion = ?, sinopsis = ? where idPelicula = ?",
				p.getTitulo(), p.getTipoMetraje(), p.getDuracion(), p.getSinopsis(), p.getIdPelicula());
		return b;
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		int b = 0;
		b = operacion.update("Delete from Pelicula where idPelicula = ?", id);
		return b;
	}


}
