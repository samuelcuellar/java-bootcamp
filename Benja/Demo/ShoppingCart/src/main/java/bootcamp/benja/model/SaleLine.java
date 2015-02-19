package bootcamp.benja.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "sale_line")
public class SaleLine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "line_id")
	private long id;

	// //////relaciones
	@ManyToOne
	@JoinColumn(name = "sale_number")
	private Sale sale;

	@ManyToOne
	@JoinColumn(name = "item_code")
	private Item item;

	// //////attributes
	@NotNull
	@Column(name = "quantity")
	private int quantity;

	@Column(name = "subtotal")
	private double subtotal;

	// /////////constructores

	public SaleLine() {
		// TODO Auto-generated constructor stub
	}

	public SaleLine(long id) {
		this.id = id;
	}

	// //////////// aqui el constructor especifico

	// ////////getters y setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Sale getSale() {
		return sale;
	}

	public void setSale(Sale sale) {
		this.sale = sale;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

}
