package com.bridgelabz.hotelreservationsystems;

import java.util.ArrayList;
import java.util.List;

/**
 * Hotel HotelReservation
 * 
 */
public class HotelReservation {
	private static HotelReservation hotelReservation = new HotelReservation();
	private List<Hotel> hotelList = new ArrayList<Hotel>();
	private Hotel hotel = new Hotel();

	public List<Hotel> getHotelList() {
		return hotelList;
	}

	public void setHotelList(List<Hotel> hotelList) {
		this.hotelList = hotelList;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	/**
	 * To Create the Hotel we are passing Hotels names and the details
	 * */
	public static void main(String[] args) {

		System.out.println("Hotel Reservation System");
		hotelReservation.addHotel("Lakewood", 3, 110, 90, 80, 80);
		hotelReservation.addHotel("Bidgewood", 4, 160, 110, 60, 50);
		hotelReservation.addHotel("Ridgewood", 5, 220, 100, 150, 40);
	}

	/**
	 * @param hotelName
	 * @param rating
	 * @param weekdayRateRegular
	 * @param weekdayRateReward
	 * @param weekendRateRegular
	 * @param weekendRateReward
	 * 
	 */
	public List<Hotel> addHotel(String hotelName, int rating, int weekdayRateRegular, int weekdayRateReward,
			int weekendRateRegular, int weekendRateReward) {
		if (rating > 0 && weekdayRateRegular > 0 && weekdayRateReward > 0 && weekendRateRegular > 00
				&& weekendRateReward > 0 && !hotelName.isEmpty()) {
			hotel.setHotelName(hotelName);
			hotel.setRating(rating);
			hotel.setWeekdayRegularCustomerCost(weekdayRateRegular);
			hotel.setWeekdayRewardCustomerCost(weekdayRateReward);
			hotel.setWeekendRegularCustomerCost(weekendRateRegular);
			hotel.setWeekendRewardCustomerCost(weekendRateReward);
			hotelList.add(hotel);
			return hotelList;
		}
		return null;
	}

}
