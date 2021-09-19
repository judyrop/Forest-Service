//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//public class AnimalsTest {
////     @Rule
////  public DatabaseRule database = new DatabaseRule();
//    @Test
//   public void animals_instantiatesInstanceofAnimalCorrectly_true() {
//        Animals.Animals testAnimals = new Animals.Animals(1,"lion");
//        assertEquals(true,testAnimals instanceof Animals.Animals );
//    }
//
//    @Test
//   public void animals_instantiatesWithId_int() {
//        Animals.Animals testAnimals = new Animals.Animals("lion");
//        assertEquals(1,testAnimals.getId());
//    }
//    @Test
//    public void animals_instantiatesWithName_String() {
//        Animals.Animals testAnimals = new Animals.Animals(1,"lion");
//        assertEquals("lion",testAnimals.getName());
//    }
//
//    @Test
//    public void animals_returnsTrueIfNameAndEmailAreSame_true() {
//        Animals.Animals firstAnimal = new Animals.Animals(1,"lion");
//        Animals.Animals otherAnimal = new Animals.Animals(1,"lion");
//        assertTrue(firstAnimal.equals(otherAnimal));
//    }
//
//    @Test
//    public void save_insertsObjectIntoDatabase_Animals() {
//        Animals.Animals testAnimals = new Animals.Animals(1,"lion");
//        testAnimals.save();
//        assertTrue(Animals.Animals.all().get(0).equals(testAnimals));
//    }
//
//    @Test
//    void all_returnsAllInstancesOfAnimals_true() {
//        Animals.Animals firstAnimal = new Animals.Animals(1,"lion");
//        firstAnimal.save();
//        Animals.Animals otherAnimal = new Animals.Animals(1,"lion");
//        otherAnimal.save();
//        assertEquals(true,Animals.Animals.all().get(0).equals(firstAnimal));
//        assertEquals(true,Animals.Animals.all().get(0).equals(otherAnimal));
//
//    }
//    @Test
//    public void find_returnsAnimalsSameId_otherAnimal() {
//       Animals.Animals firstAnimal = new Animals.Animals(1, "lion");
//        firstAnimal.save();
//        Animals.Animals otherAnimal = new Animals.Animals(1, "lion");
//        otherAnimal.save();
//        assertEquals(Animals.Animals.find(otherAnimal.getId()), otherAnimal);
//    }
//
////    @Test
////    public void update_updateObjectIntoAnimal() {
////        Animals.Animals testAnimals = new Animals.Animals(2,"buffalo");
////        testAnimals.save();
////        testAnimals.update(Animals.Animals.class);
////    }
//}