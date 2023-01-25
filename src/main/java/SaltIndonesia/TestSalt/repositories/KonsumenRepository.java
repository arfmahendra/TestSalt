package SaltIndonesia.TestSalt.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import SaltIndonesia.TestSalt.model.Konsumen;

@Repository("konsumenRepository")
public interface KonsumenRepository extends CrudRepository<Konsumen, Integer> {
	
}
