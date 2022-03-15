package ni.edu.uca.ConexionBD.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ni.edu.uca.ConexionBD.models.Idioma;
import ni.edu.uca.ConexionBD.repositories.IdiomaDRepository;
import ni.edu.uca.ConexionBD.repositories.IdiomaIRepository;

@Service
public class IdiomaService implements IdiomaIRepository{

	@Autowired
	IdiomaDRepository idi;
	@Override
	public List<Map<String, Object>> ListarRegistro() {
		// TODO Auto-generated method stub
		return idi.ListarRegistro();
	}

	@Override
	public int GuardarRegistro(Idioma i) {
		// TODO Auto-generated method stub
		return idi.GuardarRegistro(i);
	}

	@Override
	public int EditarRegistro(Idioma i) {
		// TODO Auto-generated method stub
		return idi.EditarRegistro(i);
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		return idi.EliminarRegistro(id);
	}

	
}
