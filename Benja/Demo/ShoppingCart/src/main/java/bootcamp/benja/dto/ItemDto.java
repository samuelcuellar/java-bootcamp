package bootcamp.benja.dto;

public class ItemDto {

	private long code;
	private String description;
	private double price;

	public ItemDto() {
	}

	public ItemDto(long code, String description, double price) {
		this.code = code;
		this.description = description;
		this.price = price;
	}

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
}
