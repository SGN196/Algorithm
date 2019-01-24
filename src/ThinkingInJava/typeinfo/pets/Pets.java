package ThinkingInJava.typeinfo.pets;

import java.util.ArrayList;

/**
 * @author SGN196
 * @date 2019/1/16 18:03
 */

public class Pets {
    public static final PetCreator creator = new LiteralPetCreator();
    public static Pet randomPet(){
        return creator.randomPet();
    }
    public static Pet[] createArray(int size){
        return creator.createArray(size);
    }
    public static ArrayList<Pet> arrayList(int size){
        return creator.arrayList(size);
    }
}
