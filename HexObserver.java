package com.company;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class HexObserver implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        int val = (int)evt.getNewValue();
        String output = Integer.toHexString(val);
        System.out.println("Hex String: " + output);
    }

}
