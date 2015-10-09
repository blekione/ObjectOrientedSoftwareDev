package customer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private enum PaymentStatus { PAID, UNPAID };
	
	private LocalDate date;
	private PaymentStatus status;
	private List<OrderDetail> lineItems; 
	private Payment payment;
	private Customer customer;
	
	public Order(OrderDetail item, Customer customer, Payment payment) {
		lineItems = new ArrayList<>();
		this.date = LocalDate.now();
		this.status = PaymentStatus.UNPAID;
		this.lineItems.add(item);
		item.setOrder(this);
		this.customer = customer;
		this.payment = payment;
	}
	
	public void addLineItem(OrderDetail item) {
		this.lineItems.add(item);
	}
	
	public double calcSubTotal() {
		double subTotal = 0.0;
		for (OrderDetail item : lineItems) {
			subTotal += item.calcSubTotal();
		}
		return subTotal;
	}
	
	public double calcTax() {
		double tax = 0.0;
		for (OrderDetail item : lineItems) {
			tax += item.calcTax();
		}
		return tax;
		
	}
	
	public double calcTotal(){
		return calcTax() + calcSubTotal();
	}
	
	public double calcTotalWeight() {
		double totalWeight = 0.0;
		for (OrderDetail item : lineItems) {
			totalWeight += item.calcWeight();
		}
		return totalWeight;
	}

	public PaymentStatus getStatus() {
		return status;
	}
}
