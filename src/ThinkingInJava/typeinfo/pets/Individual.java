package ThinkingInJava.typeinfo.pets;

/**
 * @author SGN196
 * @date 2019/1/13 13:10
 */

public class Individual {
    public int id;
    public String name;

    public Individual(){

    }
    public Individual(String name){
        this.name = name;
    }
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        if(name == null)
            return this.getClass().toString();
        return "Individual{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
