package AZ_0124;

import java.util.LinkedList;
import java.util.Queue;

public class DogCatQueue {
    private Queue<FourPetEnterQueue> dogQ = new LinkedList<>();
    private Queue<FourPetEnterQueue> catQ = new LinkedList<>();
    private long count;

    public DogCatQueue(Queue<FourPetEnterQueue> dogQ, Queue<FourPetEnterQueue> catQ, long count) {
        this.dogQ = dogQ;
        this.catQ = catQ;
        this.count = 0;
    }

    public void add(Pet pet) {
        if (pet.getType().equals("dog")) {
            this.dogQ.add(new FourPetEnterQueue(pet,this.count++));
        } else if (pet.getType().equals("cat")) {
            this.catQ.add(new FourPetEnterQueue(pet,this.count++));
        } else {
            throw new RuntimeException("err,not dog or cat");
        }
    }

    public Pet pollAll() {
        if (!this.dogQ.isEmpty() && !this.catQ.isEmpty()) {
            if (this.dogQ.peek().getCount() < this.catQ.peek().getCount()) {
                return this.dogQ.poll().getPet();
            } else {
                return this.catQ.poll().getPet();
            }
        } else if (!this.dogQ.isEmpty()) {
            return this.dogQ.poll().getPet();
        } else if (!this.catQ.isEmpty()) {
            return this.catQ.poll().getPet();
        } else {
            throw new RuntimeException("err,queue is empty");
        }
    }

    public Dog pollDog() {
        if (!this.isDogQueueEmpty()) {
            return (Dog) this.catQ.poll().getPet();
        } else {
            throw new RuntimeException("cat is empty");
        }
    }

    public Cat pollCat() {
        if (!this.isCatQueueEmpty()) {
            return (Cat) this.dogQ.poll().getPet();
        } else {
            throw new RuntimeException("dog is empty");
        }
    }
    public boolean isEmpty() {
        return this.dogQ.isEmpty() && this.catQ.isEmpty();
    }

    private boolean isCatQueueEmpty() {
        return this.catQ.isEmpty();
    }

    private boolean isDogQueueEmpty() {
        return this.dogQ.isEmpty();
    }
}
