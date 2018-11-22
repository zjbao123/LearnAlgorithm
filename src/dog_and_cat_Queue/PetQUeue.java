package dog_and_cat_Queue;

/**
 * Created by zjbao on 2018/11/22.
 */
public class PetQUeue {
    private long count;
    private Pet pet;
    public PetQUeue(long count, Pet pet){
        this.count = count;
        this.pet = pet;
    }

    public long getCount() {
        return count;
    }

    public Pet getPet() {
        return pet;
    }
    public String getPetType(){
        return this.pet.getPetType();
    }

}
