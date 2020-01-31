package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World I am Here now for good today!");

        NumberBase nb = new NumberBase();

        nb.addPropertyChangeListener(new BinaryObserver());
        nb.addPropertyChangeListener(new OctalObserver());
        nb.addPropertyChangeListener(new HexObserver());

        System.out.println("First state change: 15");
        nb.setValue(15);
        System.out.println("First state change: 10");
        nb.setValue(10);

    }
}
