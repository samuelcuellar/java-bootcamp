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
@Table(name = "category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idCategory")
	private long idCategory;

	@NotNull
	@Column(name = "name")
	private String name;

	@OneToMany(mappedBy = "category")
	private List<Line> lineList;

	@OneToMany(mappedBy = "category")
	private List<Product> productList;

	public Category() {

	}

	public Category(String name) {
		super();
		this.name = name;
	}

	public long getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(long idCategory) {
		this.idCategory = idCategory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
