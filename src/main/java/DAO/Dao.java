package DAO;

import Animals.Animals;

import java.util.List;

public interface Dao {
    void add(Animals animals);

    List<Animals> getAll();

    List<Animals> findById(int id);

    void update();
    void delete();
}
