package globant.bruno.topic7.model;

//import java.util.Date;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="teacher")
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idTeacher;
	
	@NotNull
	private String firstName;
	
	@NotNull
	private String lastName;

	@NotNull
	@Temporal(TemporalType.DATE)
	private Date date_of_Birth;
	
	public Teacher(){
		
	}

	public Teacher(int idTeacher){
		this.idTeacher=idTeacher;
	}

	public int getIdTeacher() {
		return idTeacher;
	}

	public void setIdTeacher(int idTeacher) {
		this.idTeacher = idTeacher;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDate_of_Birth() {
		return date_of_Birth;
	}

	public void setDate_of_Birth(Date date_of_Birth) {
		this.date_of_Birth = date_of_Birth;
	}
		
}
