package fr.efrei.factory;

import fr.efrei.domain.HotelManager;

public class HotelManagerFactory {
    public static HotelManager createHotelManager(String id, String name){
        if (id == null || id.length() <10 || !id.matches("[A-Z0-9]+") ||
        name == null || name.isEmpty() || !name.matches("[a-zA-Z]+")){
            return null;
        }

        return new HotelManager.Builder()
                .setId(id)
                .setName(name)
                .build();
    }

}
