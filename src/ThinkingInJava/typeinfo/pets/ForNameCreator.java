package ThinkingInJava.typeinfo.pets;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SGN196
 * @date 2019/1/13 18:42
 */

public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
    private static String[] typeNames = {
            "ThinkingInJava.typeinfo.pets.Mutt",
            "ThinkingInJava.typeinfo.pets.Pug",
            "ThinkingInJava.typeinfo.pets.EgyptianMau",
            "ThinkingInJava.typeinfo.pets.Manx",
            "ThinkingInJava.typeinfo.pets.Cymric",
            "ThinkingInJava.typeinfo.pets.Rat",
            "ThinkingInJava.typeinfo.pets.Mouse",
            "ThinkingInJava.typeinfo.pets.Hamster"
    };

    private static void loader(){
        for(String str : typeNames){
            try {
                types.add((Class<? extends Pet>)Class.forName(str));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
    static {loader();}
    public List<Class<? extends  Pet>> types(){
        return types;
    }
}
