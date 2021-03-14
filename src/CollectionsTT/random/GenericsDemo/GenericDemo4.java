package CollectionsTT.random.GenericsDemo;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo4 {
    public static void main(String[] args) {
        List<Child> children = new ArrayList<>();

        processElement(children);

        Child child = children.get(0);
        child.childSpecificMethod();

        List<Parent> parents = new ArrayList<>();

        List<Child> children2 = new ArrayList<>();

        processElement2(children);
        processElement2(children2);

        Child child2 = children.get(0);
        child.childSpecificMethod();




    }
    public static void processParentElement(List<Parent> parents){}

    public static void processElement(List<? extends Parent> elements){
        Parent parent = elements.get(0);

        elements.add(null);
    }
    public static void processElement2(List<? super Child> elements){
        Object element = elements.get(0);

        elements.add(new Child());
        elements.add(new GrandChild());
        elements.add(null);
    }

}
class Parent{}
class Child extends Parent{
    public void childSpecificMethod(){}
}
class GrandChild extends Child{}


