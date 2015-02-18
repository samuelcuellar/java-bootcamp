package lastProject.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idUser")
	private long idUser;

	@NotNull
	@Column(name = "name")
	private String name;

	@NotNull
	@Column(name = "lastName")
	private String lastName;

	@NotNull
	@Column(name = "email")
	private String email;

	@NotNull
	@Column(name = "pass")
	private String pass;

	@OneToMany(mappedBy = "user")
	private List<Shop> shopList;

	@OneToMany(mappedBy = "user")
	private List<Line> lineList;

	public User() {

	}

	public User(String name, String lastName, String email, String pass) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.pass = pass;
	}

	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
}
