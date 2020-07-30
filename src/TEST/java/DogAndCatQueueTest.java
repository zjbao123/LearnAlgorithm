import dog_and_cat_Queue.Cat;
import dog_and_cat_Queue.Dog;
import dog_and_cat_Queue.DogAndCatQueue;
import org.junit.Test;

/**
 * Created by zjbao on 2018/11/22.
 */
public class DogAndCatQueueTest {
    @Test
    public void add() throws Exception {
        Cat cat =new Cat();
        Dog dog =new Dog();
        DogAndCatQueue queue = new DogAndCatQueue();
        queue.add(cat);
        queue.add(dog);

    }

    @Test
    public void pollall() throws Exception {
        Cat cat =new Cat();
        Dog dog =new Dog();
        DogAndCatQueue queue = new DogAndCatQueue();
        queue.add(cat);
        queue.add(dog);
        System.out.println(queue.pollall());
        System.out.println(queue.pollall());
    }

    @Test
    public void pollDog() throws Exception {
        Cat cat =new Cat();
        Dog dog =new Dog();
        DogAndCatQueue queue = new DogAndCatQueue();
        queue.add(cat);
        queue.add(dog);
        System.out.println(queue.pollDog());
    }

    @Test
    public void pollCat() throws Exception {
        Cat cat =new Cat();
        Dog dog =new Dog();
        DogAndCatQueue queue = new DogAndCatQueue();
        queue.add(cat);
        queue.add(dog);
        System.out.println(queue.pollCat());
    }

    @Test
    public void isempty() throws Exception {
        Cat cat =new Cat();
        Dog dog =new Dog();
        DogAndCatQueue queue = new DogAndCatQueue();
        queue.add(cat);
        queue.add(dog);
        System.out.println(queue.isempty());
    }

    @Test
    public void isDogempty() throws Exception {
        Cat cat =new Cat();
        Dog dog =new Dog();
        DogAndCatQueue queue = new DogAndCatQueue();
        queue.add(cat);
        queue.add(dog);
        System.out.println(queue.isDogempty());
    }

    @Test
    public void isCatempty() throws Exception {
        Cat cat =new Cat();
        Dog dog =new Dog();
        DogAndCatQueue queue = new DogAndCatQueue();
        queue.add(cat);
        queue.add(dog);
        System.out.println(queue.isCatempty());
    }

}