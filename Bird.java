import java.util.Objects;

public abstract class Bird {
	enum Clr {
		RED, GREEN, BLUE, BLACK_WHITE
	};

	Clr clr;
	String id;
	String name;

	@Override
	public String toString() {
		return "Bird{" + "clr=" + clr + ", id='" + id + "', name='" + name + "'}";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Bird bird = (Bird) o;
		return Objects.equals(id, bird.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(clr, id, name);

	}
}