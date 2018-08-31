package es.jalbarracinq.library;

//@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {
//		SpringApplication.run(LibraryApplication.class, args);

		LibrarySingleton.getInstance().printHello();
	}
}
