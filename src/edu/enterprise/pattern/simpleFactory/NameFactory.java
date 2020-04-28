package edu.enterprise.pattern.simpleFactory;

public class NameFactory {

    public NameFactory() {
    }

    public Namer getName(String name){
        if (name.equalsIgnoreCase("first")){
            return new FirstFirst(name);
        } else if (name.equalsIgnoreCase("last")){
            return new FirstLast(name);
        } else {
            throw new IllegalStateException();
        }
    }
}
