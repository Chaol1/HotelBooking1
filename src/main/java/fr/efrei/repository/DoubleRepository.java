package fr.efrei.repository;

import fr.efrei.domain.DoubleRoom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DoubleRepository implements IDoubleRepository {
    private Map<Integer, DoubleRoom> doubles = new HashMap<>();
    private static IDoubleRepository repository = null;

    private DoubleRepository() {
        doubles = new HashMap<>();
    }

    public static IDoubleRepository getRepository() {
        if (repository == null) {
            repository = new DoubleRepository();
        }
        return repository;
    }

    @Override
    public DoubleRoom create(DoubleRoom doubleRoom) {
        if (doubleRoom == null) return null;
        doubles.put(doubleRoom.getRoomNumber(), doubleRoom);
        return doubleRoom;
    }

    @Override
    public DoubleRoom read(Integer id) {
        return doubles.get(id);
    }

    @Override
    public DoubleRoom update(DoubleRoom doubleRoom) {
        if (doubleRoom == null) return null;
        doubles.put(doubleRoom.getRoomNumber(), doubleRoom);
        return doubleRoom;
    }

    @Override
    public boolean delete(Integer id) {
        return doubles.remove(id) != null;
    }

    @Override
    public List<DoubleRoom> getAll() {
        return new ArrayList<>(doubles.values());
    }
}