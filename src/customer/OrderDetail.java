package customer;

public class OrderDetail {
	
	public enum TaxStatus {TAX_FREE, TAXABLE};
	
	private Order order; // owner of OrderDetail;
	private double quantity;
	private Item item;
	private TaxStatus taxStatus;
	
	public OrderDetail(double quantity, Item item, TaxStatus taxStatus ) {
		this.quantity = quantity;
		this.item = item;
		this.taxStatus = taxStatus;
	}
	
	public double calcSubTotal() {
		return item.getPriceForQuantity(quantity);
	}
	
	public double calcWeight() {
		return quantity * item.getShippingWeight();
	}
	
	public double calcTax() {
		if (taxStatus == TaxStatus.TAX_FREE)
			return 0;
		else 
			return calcSubTotal() * item.getTax();
	}

	public void setTaxStatus(TaxStatus taxStatus) {
		this.taxStatus = taxStatus;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
}
