import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnimalsTest {
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
    void save_insertsObjectIntoDatabase_Animals() {
        Animals testAnimals = new Animals(1,"lion");
        testAnimals.save();
        assertTrue(Animals.all().get(0).equals(testAnimals));
    }
}