package academy.pocu.comp2500.assignment1;

import academy.pocu.comp2500.assignment1.registry.Registry;

import java.util.Collection;

import static java.lang.Thread.sleep;

public class Program {

    public static void main(String[] args) throws InterruptedException {
	    // write your code here
       Registry registry = new Registry();
       App app = new App(registry);
       registry.validate();
    }
}
