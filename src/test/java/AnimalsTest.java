import Animals.Animals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalsTest {
@Test
public void animals_instantiatesCorrectly_true(){
        Animals testAnimals = setupAnimals();
        assertEquals(true, testAnimals instanceof Animals);
        }


    @Test
public void animals_instantiatesWithName_name(){
        Animals testAnimals = setupAnimals();
        assertEquals("Lion", testAnimals.getName());
        }

@Test
public void animals_instantiatesWithRangerName_rangerName() throws Exception{
        Animals testAnimals = setupAnimals();
        assertEquals("John", testAnimals.getRangerName());
        }

@Test
public void animals_instantiatesWithCorrectLocation() throws Exception{
        Animals testAnimals = setupAnimals();
        assertEquals("zone A", testAnimals.getLocation());
        }

//@Test
//public void animals_instantiatesWithId_2(){
//        Animals testAnimals = setupAnimals();
//        assertEquals(2, testAnimals.setId(2));
//        }
    public Animals setupAnimals() {
        return new Animals("Lion", "John", "zone A");
    }

}