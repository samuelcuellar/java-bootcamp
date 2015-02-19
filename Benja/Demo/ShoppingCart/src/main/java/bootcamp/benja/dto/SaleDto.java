package bootcamp.benja.dto;

import java.util.ArrayList;
import java.util.List;

public class SaleDto {

	private long number;
	private String holder;
	private long cardNumber;
	private int security;
	private double total;
	private List<SaleLineDto> lines;

	public SaleDto() {
		// TODO Auto-generated constructor stub
		this.lines = new ArrayList<SaleLineDto>();
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
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

	public List<SaleLineDto> getLines() {
		return lines;
	}

	public void setLines(List<SaleLineDto> lines) {
		this.lines = lines;
	}

}
