package SpringBoot;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import SpringBoot.PoliceheadquartersRepository;

@Repository
public interface PoliceheadquartersRepository extends CrudRepository<Policeheadquarters, Integer>{
	
	@Query(value = "Select * from Policeheadquarters", nativeQuery = true)
	Iterable<Policeheadquarters> getAllPoliceheadquarters();
	

//	Policeheadquarters findByid(int id);


	//@Query("select a from Policeheadquarters a where a.stad like %?1%")
//	Iterable<Policeheadquarters> findBystadContains(@Param("stad") String stad);//
}