package lastProject.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "shop")
public class Shop {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long idShop;

	@NotNull
	@Column(name = "pay")
	private String pay;

	@ManyToOne
	@JoinColumn(name = "idUser")
	private User user;

	@OneToMany(mappedBy = "shop")
	private List<Line> lineList;

	public Shop() {

	}

	public Shop(String pay, User user) {
		super();
		this.pay = pay;
		this.user = user;
	}

	public long getIdShop() {
		return idShop;
	}

	public void setIdShop(long idShop) {
		this.idShop = idShop;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}
}
