package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addTest(){
        //Given
        Dog expectedDog = new Dog(null, null, 302);
        DogHouse.add(expectedDog);


        //When
        Integer id = expectedDog.getId();
        Dog actualDog = DogHouse.getDogById(id);

        //Then
        Assert.assertEquals(expectedDog, actualDog);


    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeByIdTest(){
        //Given
        Dog expectedDog = new Dog(null, null, 303);
        DogHouse.add(expectedDog);

        //When
        Integer id = expectedDog.getId();
        DogHouse.remove(id);
        Dog actualDog = DogHouse.getDogById(id);

        //Then
        Assert.assertNull(actualDog);

    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeByObjectTest(){
        //Given
        Dog expectedDog = new Dog(null, null, 304);
        DogHouse.add(expectedDog);
        Integer id = expectedDog.getId();

        //When
        DogHouse.remove(expectedDog);
        Dog actualDog = DogHouse.getDogById(id);

        //Then
        Assert.assertNull(actualDog);
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogByIdTest(){
        //Given
        Dog expectedDog = new Dog(null, null, 305);;
        DogHouse.add(expectedDog);
        Integer id = expectedDog.getId();

        //When
        Dog actualDog = DogHouse.getDogById(id);

        //Then
        Assert.assertEquals(expectedDog, actualDog);
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        int expectedNumDogs = DogHouse.getNumberOfDogs() + 1;

        // When
        DogHouse.add(animal);
        int actualNumDogs = DogHouse.getNumberOfDogs();


        // Then
        Assert.assertEquals(expectedNumDogs, actualNumDogs);
    }
}
