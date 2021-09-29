package DAO;

import Animals.EndangeredAnimals;

import java.util.List;

public interface EDao {
   void add(EndangeredAnimals endangeredAnimals);
    List<EndangeredAnimals> getAll();
}
