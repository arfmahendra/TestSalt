package SaltIndonesia.TestSalt.service;

import java.util.List;

import SaltIndonesia.TestSalt.model.Konsumen;

public interface KonsumenService {
	Iterable<Konsumen> getAllKonsumen();
	public Konsumen getKonsumenById(Integer id);
}

