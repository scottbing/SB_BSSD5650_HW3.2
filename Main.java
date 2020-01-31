package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World I am Here now for good today!");

        NumberBase nb = new NumberBase();

        nb.addPropertyChangeListener(new BinaryObserver());
        nb.addPropertyChangeListener(new OctalObserver());
        nb.addPropertyChangeListener(new HexObserver());
        nb.addPropertyChangeListener(new AsciiObserver());

        System.out.println("First state change: 107");
        nb.setValue(107);
        System.out.println("First state change: 99");
        nb.setValue(99);
        System.out.println("First state change: 111");
        nb.setValue(111);

    }
}
