import java.util.ArrayList;
import java.util.HashSet;

public class BirdRepository {

//	private ArrayList birdList = new ArrayList();
	
	HashSet<Bird> birdList = new HashSet<>();

	public void add(Bird bird) {
		birdList.add(bird);
	}
    public void remove(Bird bird) {
    	birdList.remove(bird);
    }
	public HashSet<Bird> get() {
		return birdList;

	}
}
