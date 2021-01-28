package SpringBoot;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Policeheadquarters")
public class Policeheadquarters {
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	@Column(name="stad")
	private String stad;
	@Column(name = "personeelaantal")
	private int personeelaantal;
	@Column(name = "provincie")
	private String provincie;
	@Column(name = "straatnaam")
	private String straatnaam;

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getstad() {
		return stad;
	}

	public void setstad(String stad) {
		this.stad = stad;
	}

	public int getpersoneelaantal() {
		return personeelaantal;
	}

	public void setpersoneelaantal(int personeelaantal) {
		this.personeelaantal = personeelaantal;
	}

	public String getprovincie() {
		return provincie;
	}

	public void setprovincie(String provincie) {
		this.provincie = provincie;
	}
	
	public String getstraatnaam() {
		return straatnaam;
	}

	public void setstraatnaam(String straatnaam) {
		this.straatnaam = straatnaam;
	}

}