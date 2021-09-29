import Animals.EndangeredAnimals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EndangeredAnimalsTest {
    @Test
    public void endangered_instantiatesCorrectly_true(){
        EndangeredAnimals testEndangered = setupEndangeredAnimals();
        assertEquals(true, testEndangered instanceof EndangeredAnimals);
    }

    @Test
    public void endangered_instantiatesWithName_elephant(){
        EndangeredAnimals testEndangered = setupEndangeredAnimals();
        assertEquals("elephant", testEndangered.getName());
    }

//    @Test
//    public void endangered_instantiatesWithId_5(){
//        EndangeredAnimals testEndangered = setupEndangeredAnimals();
//        assertEquals(5, testEndangered.setId(5));
//    }

    @Test
    public void endangered_instantiatesWithHealth_healthy(){
        EndangeredAnimals testEndangered = setupEndangeredAnimals();
        assertEquals("healthy", testEndangered.getHealth());
    }

    @Test
    public void endangered_instantiatesWithAge_young(){
        EndangeredAnimals testEndangered = setupEndangeredAnimals();
        assertEquals("young", testEndangered.getAge());
    }

    @Test
    public void endangeredAnimals_instantiatesWithRanger_ranger() throws Exception{
        EndangeredAnimals testEndangered = setupEndangeredAnimals();
        assertEquals("John", testEndangered.getRangerName());
    }

    @Test
    public void endangeredAnimals_instantiatesWithCorrectLocation() throws Exception{
        EndangeredAnimals testEndangered = setupEndangeredAnimals();
        assertEquals("zone A", testEndangered.getLocation());
    }

    // helper methods
    public EndangeredAnimals setupEndangeredAnimals(){
        return new EndangeredAnimals("white rhino", "healthy", "young", "John","zone A");
    }
}