package SaltIndonesia.TestSalt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import SaltIndonesia.TestSalt.model.Konsumen;
import SaltIndonesia.TestSalt.service.KonsumenService;

@RestController
public class KonsumenRestController {
	 @Autowired
	    private KonsumenService konsumenService;
	   
	    @RequestMapping(path="/api/konsumen", method=RequestMethod.GET)
	    public Iterable <Konsumen> getAllKonsumen() {
	        return konsumenService.getAllKonsumen();
	    }
	   
	    @RequestMapping(path="/api/konsumen/{id}", method=RequestMethod.GET)
	    public Konsumen getKonsumenById(@PathVariable("id") Integer id) {
	        return konsumenService.getKonsumenById(id);
	    }
}
