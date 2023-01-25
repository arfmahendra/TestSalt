package SaltIndonesia.TestSalt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import SaltIndonesia.TestSalt.model.Konsumen;
import SaltIndonesia.TestSalt.repositories.KonsumenRepository;

@Service("konsumenService")
public class KonsumenServiceImpl implements KonsumenService {
	
	@Autowired
	private KonsumenRepository konsumenRepository;
	
	@Override
	public Iterable<Konsumen> getAllKonsumen() {
		return konsumenRepository.findAll();
	}
	
    @Autowired
    public void setProductRepository(KonsumenRepository konsumenRepository) {
        this.konsumenRepository = konsumenRepository;
    }

	@Override
	public Konsumen getKonsumenById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
    
//	@Override
//	public Konsumen getKonsumenById(Integer id) {
//		// TODO Auto-generated method stub
//		return konsumenRepository.findById(id);
//	}
}

