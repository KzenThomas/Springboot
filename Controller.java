package SpringBoot;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import SpringBoot.PoliceHeadquartersRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class Controller {
	

	@Autowired
	private PoliceHeadquartersRepository PHQRep;
	
	@GetMapping("/")
    public Iterable<PoliceHeadquarters> index() {
        return PHQRep.findAll();
    }

	@PostMapping("/addhq ")
	public void addhq(@RequestBody PoliceHeadquarters PoliceHeadquarters) {
		System.out.println(PoliceHeadquarters);
		
		PoliceHeadquarters.setstad("test");
		PoliceHeadquarters.setid(0);
		PHQRep.save(PoliceHeadquarters);
	}
	
	@GetMapping("/personel")
    public PoliceHeadquarters byId(@RequestParam int id) {
		return PHQRep.findByid(id);
    }
	
	@GetMapping("/personel?stad")
    public Iterable<PoliceHeadquarters> bystad(@RequestParam String stad) {
		System.out.println("Name: " + stad);
        return PHQRep.findBystadContains(stad);
    }
	
	@GetMapping("/tophd ")
    public Iterable<PoliceHeadquarters> PoliceHeadquarters() {
        return PHQRep.getAllPoliceHeadquarters();
    }
	
	

}
