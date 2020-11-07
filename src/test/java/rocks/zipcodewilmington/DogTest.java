package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    private Dog dog;

    @Before
    public void setup(){this.dog = new Dog();}
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void newDogTest(){
        //given
        String expectedName = "Otis";
        Date expectedBirthDate = new Date();
        Integer expectedId = 0;

        //when
        Dog dog = new Dog(expectedName, expectedBirthDate, expectedId);
        String actualName = dog.getName();
        Date actualBirthDate = dog.getBirthDate();
        Integer actualId = dog.getId();

        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
        Assert.assertEquals(expectedId, actualId);

    }
    // TODO - Create tests for `speak`
    @Test
    public void testSpeak(){
        //Given
        String expectedResponse = "bark!";

        //When
        Dog dog = new Dog("Otis", new Date(), 0);
        String actualResponse = dog.speak();

        //Then
        Assert.assertEquals(expectedResponse, actualResponse);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthDate(){
        //Given
        Date expectedDate = new Date(1996, 1, 5);

        //When
        Dog dog = new Dog("Otis", expectedDate, 0);
        Date actualDate = dog.getBirthDate();

        //Then
        Assert.assertEquals(expectedDate, actualDate);

    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest(){
        //Given
        Food food = new Food();
        int initialMealsEaten = dog.getNumberOfMealsEaten();
        int expectedMealsEaten = initialMealsEaten + 1;

        //When
        dog.eat(food);
        int actualMealsEaten = dog.getNumberOfMealsEaten();

        //Then
        Assert.assertEquals(expectedMealsEaten, actualMealsEaten);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest(){
        //Given
        int expectedId = 302;
        Dog newDog = new Dog(null, null, 302);

        //When
        int actualId = newDog.getId();

        //Then
        Assert.assertEquals(expectedId, actualId);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritanceTest(){
        //Given
        Dog dog = new Dog();

        //When
        Boolean actual = dog instanceof Animal;

        //Then
        Assert.assertTrue(actual);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritanceTest(){
        //Given
        Dog dog = new Dog();

        //When
        Boolean actual = dog instanceof Mammal;

        //Then
        Assert.assertTrue(actual);
    }
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
