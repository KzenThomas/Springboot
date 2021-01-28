package SpringBoot;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import SpringBoot.PoliceHeadquartersRepository;

@Repository
public interface PoliceHeadquartersRepository extends CrudRepository<PoliceHeadquarters, Integer>{
	
	@Query(value = "Select * from PoliceHeadquarters", nativeQuery = true)
	Iterable<PoliceHeadquarters> getAllPoliceHeadquarters();
	

	PoliceHeadquarters findByid(int id);


	@Query("select a from PoliceHeadquarters a where a.stad like %?1%")
	Iterable<PoliceHeadquarters> findBystadContains(@Param("stad") String stad);
}