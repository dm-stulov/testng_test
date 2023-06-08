import org.example.Animal;
import org.example.Cat;
import org.example.Dog;
import org.example.Main;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FunctionTests {
    @Test(
            description = "different name, different classes"
    )
    public void differentNamesAndClassesTest() {
        Animal[] animals = new Animal[2];

        animals[0] = new Dog("Gav");
        animals[1] = new Cat("Mars");

        Assert.assertFalse(Main.compare(animals));
    }

    @Test(
            description = "same names, different classes"
    )

    public void sameNamesAndDifferentClassesTest() {
        Animal[] animals = new Animal[2];

        animals[0] = new Dog("Gav");
        animals[1] = new Cat("Gav");

        Assert.assertFalse(Main.compare(animals));
    }

    @Test(
            description = "different names, same classes"
    )
    public void differentNamesAndSameClassesTest() {
        Animal[] animals = new Animal[2];

        animals[0] = new Dog("Gav");
        animals[1] = new Dog("Wow");

        Assert.assertFalse(Main.compare(animals));
    }

    @Test(
            description = "same names, same classes"
    )
    public void sameNamesAndSameClassesTest() {
        Animal[] animals = new Animal[2];

        animals[0] = new Dog("Gav");
        animals[1] = new Dog("Gav");

        Assert.assertTrue(Main.compare(animals));
    }

}
