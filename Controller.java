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

import SpringBoot.PoliceheadquartersRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class Controller {
	

	@Autowired
	private PoliceheadquartersRepository PHQRep;
	
	@GetMapping("/")
    public Iterable<Policeheadquarters> index() {
        return PHQRep.findAll();
    }

	@PostMapping("/addhq ")
	public void addhq(@RequestBody Policeheadquarters Policeheadquarters) {
		System.out.println(Policeheadquarters);
		
		Policeheadquarters.setstad("test");
		Policeheadquarters.setid(0);
		PHQRep.save(Policeheadquarters);
	}
	
	//@GetMapping("/personel")
    //public Policeheadquarters byId(@RequestParam int id) {
		//return PHQRep.findByid(id);
    //}
	
	//@GetMapping("/personel?stad")
//    public Iterable<Policeheadquarters> bystad(@RequestParam String stad) {
		//System.out.println("Name: " + stad);
     //   return PHQRep.findBystadContains(stad);
   // }
	
	@GetMapping("/tophd ")
    public Iterable<Policeheadquarters> Policeheadquarters() {
        return PHQRep.getAllPoliceheadquarters();
    }
	
	

}
