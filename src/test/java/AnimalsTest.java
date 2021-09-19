
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnimalsTest {
     @Rule
  public DatabaseRule database = new DatabaseRule();
    @Test
   public void animals_instantiatesInstanceofAnimalCorrectly_true() {
        Animals testAnimals = new Animals(1,"lion");
        assertEquals(true,testAnimals instanceof Animals );
    }

    @Test
   public void animals_instantiatesWithId_int() {
        Animals testAnimals = new Animals(1,"lion");
        assertEquals(1,testAnimals.getId());
    }
    @Test
    public void animals_instantiatesWithName_String() {
        Animals testAnimals = new Animals(1,"lion");
        assertEquals("lion",testAnimals.getName());
    }

    @Test
    public void animals_returnsTrueIfNameAndEmailAreSame_true() {
        Animals firstAnimal = new Animals(1,"lion");
        Animals otherAnimal = new Animals(1,"lion");
        assertTrue(firstAnimal.equals(otherAnimal));
    }

    @Test
    public void save_insertsObjectIntoDatabase_Animals() {
        Animals testAnimals = new Animals(1,"lion");
        testAnimals.save();
        assertTrue(Animals.all().get(0).equals(testAnimals));
    }

    @Test
    void all_returnsAllInstancesOfAnimals_true() {
        Animals firstAnimal = new Animals(1,"lion");
        firstAnimal.save();
        Animals otherAnimal = new Animals(1,"lion");
        otherAnimal.save();
        assertEquals(true,Animals.all().get(0).equals(firstAnimal));
        assertEquals(true,Animals.all().get(0).equals(otherAnimal));

    }
    @Test
    public void find_returnsAnimalsSameId_otherAnimal() {
       Animals firstAnimal = new Animals(1, "lion");
        firstAnimal.save();
        Animals otherAnimal = new Animals(1, "lion");
        otherAnimal.save();
        assertEquals(Animals.find(otherAnimal.getId()), otherAnimal);
    }

    @Test
    public void update_updateObjectIntoAnimal() {
        Animals testAnimals = new Animals(2,"buffalo");
        testAnimals.save();
        testAnimals.update(Animals.class);
    }
}