package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addTest() {
        // given
        Cat expected = new Cat(null, null, 302);
        Integer id = expected.getId();

        // when
        CatHouse.add(expected);
        Cat actual = CatHouse.getCatById(id);

        // then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeTest() {
        // given
        Cat catToBeAdded = new Cat(null, null, 303);
        CatHouse.add(catToBeAdded);
        Integer id = catToBeAdded.getId();

        // when
        CatHouse.remove(id);
        Cat retrievedCat = CatHouse.getCatById(id);

        // then
        Assert.assertNull(retrievedCat);
    }


    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeByCatTest() {
        // given
        Cat catToBeAdded = new Cat(null, null, 304);
        CatHouse.add(catToBeAdded);
        Integer id = catToBeAdded.getId();

        // when
        CatHouse.remove(catToBeAdded);
        Cat retrievedCat = CatHouse.getCatById(id);

        // then
        Assert.assertNull(retrievedCat);
    }

    @Test
    public void getCatByIdTest(){
        //Given
        Cat expectedCat = new Cat("ferb", null, 305);
        CatHouse.add(expectedCat);
        Integer id = expectedCat.getId();

        //When
        Cat actualCat = CatHouse.getCatById(id);

        //Then
        Assert.assertEquals(expectedCat, actualCat);


    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest() {
        // given there is a cat to be added
        Cat cat = new Cat("Felix", new Date(), 306);
        //NOTE: this was originally just a cat with a null ID! d

        // given that I count number of cats before add
        int numberOfCatsBeforeAdd = CatHouse.getNumberOfCats();

        // given that I add one cat, my expected should be numberOfCatsBeforeAdd + 1
        int expected = numberOfCatsBeforeAdd + 1;

        // given that I have added a cat
        CatHouse.add(cat);

        // when I get the number of cats after the add
        int actual = CatHouse.getNumberOfCats();

        // then
        Assert.assertEquals(expected, actual);




    }
}