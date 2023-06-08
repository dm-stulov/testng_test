import org.example.Animal;
import org.example.Cat;
import org.example.Dog;
import org.example.Main;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {
    @Test
    public void equalse(){
        Animal[] animals = new Animal[2];

        animals[0] = new Dog("Gav");
        animals[1] = new Cat("Mars");

        Assert.assertFalse(Main.compare(animals));
    }
}
