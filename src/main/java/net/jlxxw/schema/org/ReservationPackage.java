package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReservationPackage extends Reservation {
    public ReservationPackage() {
    }

    /**
     * The individual reservations included in the package. Typically a repeated property.
     */
    @JsonProperty("subReservation")
    private Reservation subReservation;

    public Reservation getSubReservation() {
        return subReservation;
    }

    public void setSubReservation(Reservation subReservation) {
        this.subReservation = subReservation;
    }
}