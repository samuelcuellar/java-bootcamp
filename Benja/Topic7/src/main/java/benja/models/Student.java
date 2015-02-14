package benja.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long registration;
	
	@NotNull
	@Size(min = 3, max = 40)
	private String name;

	public Student() {
	}

	public Student(long registration) {
		this.registration = registration;
	}
	
	public Student(String name) {
		this.name = name;
	}

	public long getRegistration() {
		return registration;
	}

	public void setRegistration(long registration) {
		this.registration = registration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
