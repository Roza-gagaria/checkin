package com.search.checkin.integration;

import org.springframework.web.bind.annotation.RequestBody;

import com.search.checkin.integration.dto.Reservation;
import com.search.checkin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestfulClient {

	public Reservation findReservation(Long id);
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request);
}
