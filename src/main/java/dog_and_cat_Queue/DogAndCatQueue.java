package dog_and_cat_Queue;



import dog_and_cat_Queue.Cat;
import dog_and_cat_Queue.Dog;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by zjbao on 2018/11/22.
 */
public class DogAndCatQueue {
    private Queue<PetQUeue> dogQueue;
    private Queue<PetQUeue> catQueue;
    private long count;

    public DogAndCatQueue(){
        this.dogQueue = new LinkedList<>();
        this.catQueue = new LinkedList<>();
        this.count = 0L;
    }

    public void add (Pet pet){
        if(pet.getPetType().equals("cat")){
            catQueue.add(new PetQUeue(count++,pet));
        }else if(pet.getPetType().equals("dog")){
            dogQueue.add(new PetQUeue(count++,pet));
        }else{
            throw new RuntimeException("The pet is wrong");
        }
    }
    public Pet pollall(){
        if(!dogQueue.isEmpty() && !catQueue.isEmpty()){
            if(dogQueue.peek().getCount() < catQueue.peek().getCount()){
                return dogQueue.poll().getPet();
            }else{
                return catQueue.poll().getPet();
            }
        }
        else if(!dogQueue.isEmpty()){
            return dogQueue.poll().getPet();
        }
        else if(!catQueue.isEmpty()){
            return catQueue.poll().getPet();
        }
        else{
            throw new RuntimeException("The queue is empty!");
        }
    }

    public Dog pollDog(){
        if(!dogQueue.isEmpty()){
            return (Dog) dogQueue.poll().getPet();
        }
        else{
            throw new RuntimeException("The queue is empty!");
        }
    }
    public Cat pollCat(){
        if(!catQueue.isEmpty()){
            return (Cat) catQueue.poll().getPet();
        }
        else{
            throw new RuntimeException("The queue is empty!");
        }
    }
    public boolean isempty(){
        return (dogQueue.isEmpty() && catQueue.isEmpty());
    }
    public boolean isDogempty(){
        return (dogQueue.isEmpty());
    }
    public boolean isCatempty(){
        return (catQueue.isEmpty());
    }
}
