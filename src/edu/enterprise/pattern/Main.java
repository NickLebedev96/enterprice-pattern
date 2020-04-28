package edu.enterprise.pattern;

import edu.enterprise.pattern.simpleFactory.NameFactory;
import edu.enterprise.pattern.simpleFactory.Namer;

public class Main {

    public static void main(String[] args) {

        final NameFactory nameFactory = new NameFactory();
        final Namer first = nameFactory.getName("first");
        System.out.println(first.getFrname());

        final Namer last = nameFactory.getName("last");
        System.out.println(last.getLname());
    }
}
