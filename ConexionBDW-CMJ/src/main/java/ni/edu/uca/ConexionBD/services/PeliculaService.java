package ni.edu.uca.ConexionBD.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ni.edu.uca.ConexionBD.models.Pelicula;
import ni.edu.uca.ConexionBD.repositories.PeliculaDRepository;
import ni.edu.uca.ConexionBD.repositories.PeliculaIRepository;

@Service
public class PeliculaService implements PeliculaIRepository{

	@Autowired
	PeliculaDRepository Pelis;
	@Override
	public List<Map<String, Object>> ListarRegistro() {
		// TODO Auto-generated method stub
		return Pelis.ListarRegistro();
	}

	@Override
	public int GuardarRegistro(Pelicula p) {
		// TODO Auto-generated method stub
		return Pelis.GuardarRegistro(p);
	}

	@Override
	public int EditarRegistro(Pelicula p) {
		// TODO Auto-generated method stub
		return Pelis.EditarRegistro(p);
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		return Pelis.EliminarRegistro(id);
	}
	
}
