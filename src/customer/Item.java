package customer;

public class Item {

	private double shippingWeight;
	private String description;
	private double pricePerShippingWeight;
	private double tax;
	
	public Item(double shippingWeight, String description, double price, double tax) {
		this.description = description;
		this.shippingWeight = shippingWeight;
		this.pricePerShippingWeight = price;
		this.tax = tax;		
	}
	
	public double getPriceForQuantity(double quantity) {
		return quantity * pricePerShippingWeight;
	}

	public double getShippingWeight() {
		return shippingWeight;
	}

	public double getTax() {
		return tax;
	}

}
