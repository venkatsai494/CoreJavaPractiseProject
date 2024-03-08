package com.venkat.java.part.four;

public interface USBank {//there is no main method in interface

    int min_bal = 100;

    public void credit();

//	public void test(){ //This is leading to an error Abstract methods do not have a body\
//	which means in interfaces all the methods are by default abstract.
//
//	}

//	In interfaces you cannot give the method body/implementation. So only declaration of method will be there but no definition

    public void debit();

    public void transferMoney();
    //*IMP* points about interface
    //Only method declaration or no method body on only method prototype is allowed in interfaces
    //In interfaces we can declare the variables which are by default STATIC
    //variable value cannot be changed. Its final/Constant by nature
    //no static method is allowed in Interface
    //we cannot create object of interface which means they are abstract by nature



}
