package fr.efrei.repository;

import fr.efrei.domain.DoubleRoom;
import java.util.List;

public interface IDoubleRepository extends IRepository<DoubleRoom, Integer> {
    List<DoubleRoom> getAll();
}