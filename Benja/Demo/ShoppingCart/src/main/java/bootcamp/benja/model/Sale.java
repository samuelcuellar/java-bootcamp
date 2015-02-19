package bootcamp.benja.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "sale")
public class Sale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sale_number")
	private long number;

	// //////relaciones
	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;

	@OneToMany(mappedBy = "sale")
	private List<SaleLine> lines;

	// /////atributos
	@NotNull
	@Column(name = "holder")
	private String holder;

	@NotNull
	@Column(name = "card_number")
	private long cardNumber;

	@NotNull
	@Column(name = "security")
	private int security;

	@NotNull
	@Column(name = "total")
	private double total;

	// ////// constructores
	public Sale() {
		// TODO Auto-generated constructor stub
	}

	public Sale(long number) {
		this.number = number;
	}

	public Sale(String holder, long cardNumber, int security) {
		this.holder = holder;
		this.cardNumber = cardNumber;
		this.security = security;
		this.lines = new ArrayList<SaleLine>();
	}

	// /////getters y setters
	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<SaleLine> getLines() {
		return lines;
	}

	public void setLines(List<SaleLine> lines) {
		this.lines = lines;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getSecurity() {
		return security;
	}

	public void setSecurity(int security) {
		this.security = security;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}
