package es.jalbarracinq.library;

public class LibrarySingleton {

    private static LibrarySingleton instance;

    private LibrarySingleton() {}

    public static LibrarySingleton getInstance() {
        if (instance == null) instance = new LibrarySingleton();
        return instance;
    }

    public void printHello() {
        System.out.println("Hello World!");
    }

}
