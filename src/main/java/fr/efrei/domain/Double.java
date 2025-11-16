package fr.efrei.domain;

public class Double extends Room{
    private String bedType;

    public Double(Builder builder){}

    public static class Builder{
        private int roomNumber;
        private double pricePerNight;
        private boolean isAvailable;
        private int floor;
        private String bedType;

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

        public Builder setBedType(String bedType){
            this.bedType = bedType;
            return this;
        }

        public Builder copy(Double doubleRoom){
            this.roomNumber = doubleRoom.roomNumber;
            this.pricePerNight = doubleRoom.pricePerNight;
            this.isAvailable = doubleRoom.isAvailable;
            this.floor = doubleRoom.floor;
            this.bedType = doubleRoom.bedType;
            return this;
        }

        public Double copy(){
            return new Double(this);
        }
    }
}
