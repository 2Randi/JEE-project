package fr.umontpellier.jeeS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.umontpellier.jeeS.model.Composante;

@Repository
public interface ComposanteRepository extends CrudRepository<Composante, String>{

	List<Composante> findByAcronymeAndNomAndResponsable(String acronyme, String nom, String responsable);

	List<Composante> findByNom(String nom);

	List<Composante> findByAcronyme(String acronyme);

	List<Composante> findByNomAndResponsable(String nom, String responsable);

	List<Composante> findByAcronymeAndResponsable(String acronyme, String responsable);

	List<Composante> findByAcronymeAndNom(String acronyme, String nom);

	List<Composante> findByResponsable(String responsable);

	List<Composante> findByBatiments_codeB(String codeB);
	
	

}
