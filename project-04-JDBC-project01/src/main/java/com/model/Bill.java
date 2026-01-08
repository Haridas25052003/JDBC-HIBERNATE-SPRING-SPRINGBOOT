package com.model;

public class Bill {
	
	private int billId;
	private int orderId;
	private double totalAmount;
	private String paymentMode;
	private String paymentStatus;
	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", orderId=" + orderId + ", totalAmount=" + totalAmount + ", paymentMode="
				+ paymentMode + ", paymentStatus=" + paymentStatus + "]";
	}
	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
}
