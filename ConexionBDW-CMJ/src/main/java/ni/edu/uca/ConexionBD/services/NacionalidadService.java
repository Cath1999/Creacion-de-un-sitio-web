package ni.edu.uca.ConexionBD.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ni.edu.uca.ConexionBD.models.Nacionalidad;
import ni.edu.uca.ConexionBD.repositories.NacionalidadDRepository;
import ni.edu.uca.ConexionBD.repositories.NacionalidadIRepository;

@Service
public class NacionalidadService implements NacionalidadIRepository{

	@Autowired
	NacionalidadDRepository Nac;
	@Override
	public List<Map<String, Object>> ListarRegistro() {
		// TODO Auto-generated method stub
		return Nac.ListarRegistro();
	}

	@Override
	public int GuardarRegistro(Nacionalidad n) {
		// TODO Auto-generated method stub
		return Nac.GuardarRegistro(n);
	}

	@Override
	public int EditarRegistro(Nacionalidad n) {
		// TODO Auto-generated method stub
		return Nac.EditarRegistro(n);
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		return Nac.EliminarRegistro(id);
	}

	
}
