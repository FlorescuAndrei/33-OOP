package com.andrei.interface_abstract_nested.interfaces;

public interface ITelephone {
    //CAN - magic word for interface
    //public is redundant
    public void powerOn();
    void dial(int number);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
