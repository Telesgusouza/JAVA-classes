package entities;

public class ItemCar {

	private String name;
	private Double price;
	private Integer quantityOfItems;
	
	public ItemCar(String name, Double price, Integer quantityOfItems) {
		this.name = name;
		this.price = price;
		this.quantityOfItems = quantityOfItems;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getQuantityOfItems() {
		return quantityOfItems;
	}
	
	public double totalValue() {
		return this.price * this.quantityOfItems;
	}
	
	@Override
	public String toString() {
		return name + "," + totalValue();
	}
	
}
