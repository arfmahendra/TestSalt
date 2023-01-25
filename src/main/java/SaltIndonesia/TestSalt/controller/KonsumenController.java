package SaltIndonesia.TestSalt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import SaltIndonesia.TestSalt.model.Konsumen;
import SaltIndonesia.TestSalt.service.KonsumenService;

@RestController
@RequestMapping("/api")
public class KonsumenController {
	
	@Autowired
	private KonsumenService konsumenService;
	
    @Autowired
    public void setProductService(KonsumenService konsumenService) {
        this.konsumenService = konsumenService;
    }
    
    @RequestMapping(path="/konsumen", method=RequestMethod.GET)
    public String goKonsumen() {
        return "index";
    }
}