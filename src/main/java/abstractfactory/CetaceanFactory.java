package abstractfactory;

import movement.SwimMovement;
import animals.Animal;
import animals.Dolphin;

public class CetaceanFactory extends AbstractAnimalFactory {

	@Override
	public Animal createNew(String name) {
		if (Dolphin.class.getSimpleName().equals(name)) {
			return new Dolphin(new SwimMovement());
		}
		throw new IllegalArgumentException("Unknown Cetacean: " + name);
	}

}
