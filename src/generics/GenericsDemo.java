package generics;

public class GenericsDemo<T> {
    T name;

    public GenericsDemo(T name){
        this.name = name;
    }


    T getName(){
        return name;
    }

     void setName(T name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student info: {" +
                "name=" + name +
                '}';
    }
}
