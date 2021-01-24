package AZ_0124;


public class FourPetEnterQueue {
    private Pet pet;  //原有的实例
    private long count; //这个实例的时间戳

    public FourPetEnterQueue(Pet pet, long count) {
        this.pet = pet;
        this.count = count;
    }

    public Pet getPet() {
        return pet;
    }

    public long getCount() {
        return count;
    }

    public String getEnterPetType() {
        return this.pet.getType();
    }
}
