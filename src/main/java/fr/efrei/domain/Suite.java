package fr.efrei.domain;

public class Suite extends Room{
    private int nbRooms;
    private int nbGuests;

    public Suite(Builder builder){}

    public static class Builder{
        private int roomNumber;
        private double pricePerNight;
        private boolean isAvailable;
        private int floor;
        private int nbRooms;
        private int nbGuests;

        public Builder setRoomNumber(int roomNumber){
            this.roomNumber = roomNumber;
            return this;
        }

        public Builder setPricePerNight(double pricePerNight){
            this.pricePerNight = pricePerNight;
            return this;
        }

        public Builder setIsAvailable(boolean isAvailable){
            this.isAvailable = isAvailable;
            return this;
        }

        public Builder setFloor(int floor){
            this.floor = floor;
            return this;
        }

        public Builder setNbRooms(int nbRooms){
            this.nbRooms = nbRooms;
            return this;
        }

        public Builder setNbGuests(int nbGuests){
            this.nbGuests = nbGuests;
            return this;
        }

        public Builder copy(Suite suite){
            this.roomNumber = suite.roomNumber;
            this.pricePerNight = suite.pricePerNight;
            this.isAvailable = suite.isAvailable;
            this.floor = suite.floor;
            this.nbRooms = suite.nbRooms;
            this.nbGuests = suite.nbGuests;
            return this;
        }

        public Suite copy(){
            return new Suite(this);
        }
    }
}
