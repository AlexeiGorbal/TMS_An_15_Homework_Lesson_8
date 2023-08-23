package purt1.Exercise2;

import purt1.Exercise2.model.AccountantImpl;
import purt1.Exercise2.model.DirectorImpl;
import purt1.Exercise2.model.WorkerImpl;

/**
 * Implemented an interface with a method that prints the title
 * positions.
 */

public class Main {
    public static void main(String[] args) {
        DirectorImpl personOne=new DirectorImpl();
        WorkerImpl personTwo=new WorkerImpl();
        AccountantImpl personThree=new AccountantImpl();

        personOne.displaysJobTitle();
        personTwo.displaysJobTitle();
        personThree.displaysJobTitle();
    }
}
