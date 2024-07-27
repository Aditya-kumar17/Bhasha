package org.Learn;

public class LearnException {
    public static void main(String[] args) throws MyException {
        try {
            throw new MyException("Custom Exception");
        }
        catch(MyException e){
            System.out.println("Catching: " +  e);
        }
        finally{
            
        }
    }
}

class MyException extends Exception{

    public MyException(String s) {
        super(s);
    }

}