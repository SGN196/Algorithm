package test.ZuoPractice.Junior;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author SGN196
 * @date 2018/12/23 17:10
 *
 * 要求
 */

class Pet{
    private String type;
    public Pet(String type){
        this.type = type;
    }
    public String getPetType(){
        return this.type;
    }
}

class Dog extends Pet{
    public Dog(){
        super("dog");
    }
}
class Cat extends Pet{
    public Cat(){
        super("cat");
    }
}
class PetEnterQueue{
    private Pet pet;
    private long count;
    public PetEnterQueue(Pet pet, long count){
        this.pet = pet;
        this.count = count;
    }
    public Pet getPet(){
        return this.pet;
    }
    public long getCount(){
        return this.count;
    }
    public String getEnterPetType(){
        return this.pet.getPetType();
    }
}


public class DogCatQueue {
    private Queue<PetEnterQueue> dogQ;
    private Queue<PetEnterQueue> catQ;
    private long count;
    public DogCatQueue(){
        dogQ = new LinkedList<>();
        catQ = new LinkedList<>();
        count = 0;
    }
    public void offer(Pet pet){
        if(pet == null)
            return;
        PetEnterQueue petEnterQueue = new PetEnterQueue(pet, count++);
        if(petEnterQueue.getPet().getPetType().equals("dog")){
            dogQ.offer(petEnterQueue);
        }else if(petEnterQueue.getPet().getPetType().equals("cat")){
            catQ.offer(petEnterQueue);
        }else
            throw new RuntimeException("error, no cat or dog");
    }
    public PetEnterQueue pollAll(){
        if(this.isEmpty()){
            return null;
        }
        if(dogQ.isEmpty()){
            return catQ.poll();
        }
        if(catQ.isEmpty()){
            return dogQ.poll();
        }
        if(dogQ.peek().getCount() < catQ.peek().getCount()){
            return dogQ.poll();
        }else{
            return catQ.poll();
        }
    }
    public PetEnterQueue pollDog(){
        if(dogQ.isEmpty()){
            return null;
        }
        return dogQ.poll();
    }
    public PetEnterQueue pollCat(){
        if(catQ.isEmpty()){
            return null;
        }
        return catQ.poll();
    }
    public boolean isEmpty(){
        if(dogQ.isEmpty() && catQ.isEmpty())
            return true;
        else
            return false;
    }
    public boolean isDogEmpty(){
        if(dogQ.isEmpty())
            return true;
        else
            return false;
    }
    public boolean isCatEmpty(){
        if(catQ.isEmpty())
            return true;
        else
            return false;
    }





}
