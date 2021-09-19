//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class EndangeredAnimalsTest {
//    @Test
//    public void endangeredAnimals_instantiatesInstanceofEndangeredAnimalCorrectly_true() {
//        EndangeredAnimals testEndangeredAnimals = new EndangeredAnimals("lion","healthy","young");
//        assertEquals(true,testEndangeredAnimals instanceof EndangeredAnimals);
//    }
//
//    @Test
//    public void endangeredAnimals_instantiatesWithId_int() {
//        EndangeredAnimals testEndangeredAnimals = new EndangeredAnimals("lion","healthy","young");
//        assertEquals(1,testEndangeredAnimals.getId());
//    }
//    @Test
//    public void endangeredAnimals_instantiatesWithName_String() {
//        EndangeredAnimals testEndangeredAnimals = new EndangeredAnimals("lion","healthy","young");
//        assertEquals("lion",testEndangeredAnimals.getName());
//    }
//    @Test
//    public void endangeredAnimals_instantiatesWithHealth_String() {
//        EndangeredAnimals testEndangeredAnimals = new EndangeredAnimals("lion","healthy","young");
//        assertEquals("healthy",testEndangeredAnimals.getHealth());
//    }
//    @Test
//    public void endangeredAnimals_instantiatesWithAge_String() {
//        EndangeredAnimals testEndangeredAnimals = new EndangeredAnimals("lion","healthy","young");
//        assertEquals("young",testEndangeredAnimals.getAge());
//    }
//}