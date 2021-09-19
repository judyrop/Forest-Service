package DAO;

import Animals.Animals;

public interface Dao {
    void add(Animals animals);
    void find();
    void update();
    void delete();
}
