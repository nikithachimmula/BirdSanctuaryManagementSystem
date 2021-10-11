
import java.util.ArrayList;
import java.util.HashSet;

public class UserInterface {
	public void print(HashSet<Bird> birdList) {
		for (Bird bird : birdList) {
			System.out.println(bird);
		}
	}
}