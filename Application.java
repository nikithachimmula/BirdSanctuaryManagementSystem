
public class Application {

	public static void main(String[] args) {
		System.out.println("Welcome to bird Sanctury");

		Crow crow = new Crow();
		crow.id = "p001";
		Parrot parrot = new Parrot();
		parrot.id = "p002";
		Ostrich ostrich = new Ostrich();
		ostrich.id = "p003";
		Penguin penguin = new Penguin();
		penguin.id = "p004";
		Duck duck = new Duck();
		duck.id = "p005";
		Ostrich2 ostrich2=new Ostrich2();
		ostrich2.id="OS002";

		BirdRepository birdRepo = new BirdRepository();
		birdRepo.add(parrot);
		birdRepo.add(crow);
		birdRepo.add(duck);
		birdRepo.add(penguin);
		birdRepo.add(ostrich);
        birdRepo.add(ostrich2);
        
		UserInterface userInterface = new UserInterface();
		userInterface.print(birdRepo.get());
		
		birdRepo.remove(parrot);
		System.out.println("List after removing the bird");
		userInterface.print(birdRepo.get());

	}

}
