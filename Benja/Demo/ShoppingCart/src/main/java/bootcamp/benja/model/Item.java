package bootcamp.benja.model;

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
@Table(name = "item")
public class Item {

	// ////////// attributes /////////////////

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "item_code")
	private long code;

	@NotNull
	@Column(name = "item_desc")
	private String description;

	@NotNull
	@Column(name = "item_price")
	private double price;

	@NotNull
	@Column(name = "item_category")
	private String category;

	@OneToMany(mappedBy = "item")
	private List<CartLine> line;

	// /////// constructors (default, only id, all attributes except id)
	public Item() {
	}

	public Item(long code) {
		this.code = code;
	}

	public Item(String description, double price, String category) {
		this.description = description;
		this.price = price;
		this.category = category;
	}

	// /////////////// getter y setter //////////////////////
	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<CartLine> getLine() {
		return line;
	}

	public void setLine(List<CartLine> line) {
		this.line = line;
	}

}
