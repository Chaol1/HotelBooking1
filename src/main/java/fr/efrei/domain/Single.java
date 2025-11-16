package fr.efrei.domain;

public class Single extends Room{
    private String bedType;

    public Single(Builder builder){}

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

        public Builder copy(Single single){
            this.roomNumber = single.roomNumber;
            this.pricePerNight = single.pricePerNight;
            this.isAvailable = single.isAvailable;
            this.floor = single.floor;
            this.bedType = single.bedType;
            return this;
        }

        public Single copy(){
            return new Single(this);
        }
    }
}
