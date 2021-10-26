package com.bridgelabz.hotelreservationsystems;

import static org.junit.Assert.*;

import java.util.ArrayList;

import java.util.List;
import org.junit.Test;

public class HotelReservationTest {
	@Test
	public void addHotels() {
		Hotel hotel = new Hotel("Lakewood", 3, 110, 90, 80, 80);
		List<Hotel> hotelList = new ArrayList<Hotel>();
		hotelList.add(hotel);
		HotelReservation hotelReservation = new HotelReservation();
		List<Hotel> listofhotel = hotelReservation.addHotel("Lakewood", 3, 110, 90, 80, 80);
		List<Hotel> result = hotelReservation.getHotelList();
		assertEquals(listofhotel, result);
	}

	@Test
	public void addHotelsForNegtiverating() {
		Hotel hotel = new Hotel("Lakewood", -3, 110, 90, 80, 80);
		List<Hotel> hotelList = new ArrayList<Hotel>();
		hotelList.add(hotel);
		HotelReservation hotelReservation = new HotelReservation();
		List<Hotel> result = hotelReservation.getHotelList();
		assertNotEquals(null, result);
	}
}
