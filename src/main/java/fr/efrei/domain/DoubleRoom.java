package fr.efrei.domain;

import java.util.List;

public class DoubleRoom extends Room{
    private String bedType;

    public DoubleRoom(Builder builder){
        this.roomNumber = builder.roomNumber;
        this.pricePerNight = builder.pricePerNight;
        this.bedType = builder.bedType;
        this.reservations = builder.reservations;
    }

    public static class Builder{
        private int roomNumber;
        private double pricePerNight;
        private String bedType;
        private List<Reservation> reservations;

        public Builder setRoomNumber(int roomNumber){
            this.roomNumber = roomNumber;
            return this;
        }

        public Builder setPricePerNight(double pricePerNight){
            this.pricePerNight = pricePerNight;
            return this;
        }

        public Builder setBedType(String bedType){
            this.bedType = bedType;
            return this;
        }

        public Builder setReservations(List<Reservation> reservations){
            this.reservations = reservations;
            return this;
        }

        public Builder copy(DoubleRoom doubleRoom){
            this.roomNumber = doubleRoom.roomNumber;
            this.pricePerNight = doubleRoom.pricePerNight;
            this.bedType = doubleRoom.bedType;
            this.reservations = doubleRoom.reservations;
            return this;
        }

        public DoubleRoom build(){
            return new DoubleRoom(this);
        }
    }
}
