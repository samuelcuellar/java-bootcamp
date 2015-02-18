package lastProject.model;

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
@Table(name = "line")
public class Line {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idLine")
	private long idLine;

	@NotNull
	@Column(name = "cantidad")
	private int cantidad;

	@ManyToOne
	@JoinColumn(name = "idUser")
	private User user;

	@ManyToOne
	@JoinColumn(name = "idShop")
	private Shop shop;

	@ManyToOne
	@JoinColumn(name = "idProduct")
	private Product product;

	@ManyToOne
	@JoinColumn(name = "idCategory")
	private Category category;

	public Line() {

	}

	public Line(User user, Shop shop, Product product, Category category) {
		super();
		this.user = user;
		this.shop = shop;
		this.product = product;
		this.category = category;
	}

	public long getIdLine() {
		return idLine;
	}

	public void setIdLine(long idLine) {
		this.idLine = idLine;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public long getIdCategory() {
		return this.category.getIdCategory();
	}

	public long getIdShop() {
		return this.shop.getIdShop();
	}
}
