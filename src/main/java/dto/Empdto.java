package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Empdto 
{
	@Id
	private String email;
	private String name;
	private int psw;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPsw() {
		return psw;
	}
	public void setPsw(int psw) {
		this.psw = psw;
	}

}