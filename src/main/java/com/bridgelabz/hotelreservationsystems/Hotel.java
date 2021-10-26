package com.bridgelabz.hotelreservationsystems;

public class Hotel {

	private String hotelName;
	private int rating;
	private int weekdayRegularCustomerCost;
	private int weekdayRewardCustomerCost;
	private int weekendRegularCustomerCost;
	private int weekendRewardCustomerCost;

	public Hotel() {
	}

	public Hotel(String hotelName, int rating, int weekdayRegularCustomerCost, int weekdayRewardCustomerCost,
			int weekendRegularCustomerCost, int weekendRewardCustomerCost) {

		this.hotelName = hotelName;
		this.rating = rating;
		this.weekdayRegularCustomerCost = weekdayRegularCustomerCost;
		this.weekdayRewardCustomerCost = weekdayRewardCustomerCost;
		this.weekendRegularCustomerCost = weekendRegularCustomerCost;
		this.weekendRewardCustomerCost = weekendRewardCustomerCost;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getWeekdayRegularCustomerCost() {
		return weekdayRegularCustomerCost;
	}

	public void setWeekdayRegularCustomerCost(int weekdayRegularCustomerCost) {
		this.weekdayRegularCustomerCost = weekdayRegularCustomerCost;
	}

	public int getWeekdayRewardCustomerCost() {
		return weekdayRewardCustomerCost;
	}

	public void setWeekdayRewardCustomerCost(int weekdayRewardCustomerCost) {
		this.weekdayRewardCustomerCost = weekdayRewardCustomerCost;
	}

	public int getWeekendRegularCustomerCost() {
		return weekendRegularCustomerCost;
	}

	public void setWeekendRegularCustomerCost(int weekendRegularCustomerCost) {
		this.weekendRegularCustomerCost = weekendRegularCustomerCost;
	}

	public int getWeekendRewardCustomerCost() {
		return weekendRewardCustomerCost;
	}

	public void setWeekendRewardCustomerCost(int weekendRewardCustomerCost) {
		this.weekendRewardCustomerCost = weekendRewardCustomerCost;
	}
}
