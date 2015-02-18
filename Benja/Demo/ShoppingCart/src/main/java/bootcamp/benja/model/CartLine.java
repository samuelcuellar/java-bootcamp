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
@Table(name = "cart_line")
public class CartLine {

	@ManyToOne
	@JoinColumn(name = "cart_id")
	private Cart cart;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "line_id")
	private long id;

	@ManyToOne	
	@JoinColumn(name = "item_code")
	private Item item;

	@NotNull
	@Column(name = "quantity")
	private int quantity;
	
	// /////////// constructores
	public CartLine() {
	}

	public CartLine(long id) {
		this.id = id;
	}

	public CartLine(Item item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}

	// //////////// getters y setters

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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

}
