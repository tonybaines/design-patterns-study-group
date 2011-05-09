package abstractfactory;

import movement.WalkMovement;
import animals.Animal;
import animals.Bear;

public class EutherianFactory extends AbstractAnimalFactory {

	@Override
	public Animal createNew(String name) {
		if (Bear.class.getSimpleName().equals(name)) {
			return new Bear(new WalkMovement());
		}
		throw new IllegalArgumentException("Unknown Eutherian: " + name);
	}

}
