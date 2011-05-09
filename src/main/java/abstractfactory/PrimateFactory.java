package abstractfactory;

import movement.RunMovement;
import movement.WalkMovement;
import animals.Animal;
import animals.Human;
import animals.Monkey;

public class PrimateFactory extends AbstractAnimalFactory {

	@Override
	public Animal createNew(String name) {
		if (Human.class.getSimpleName().equals(name)) {
			return new Human(new WalkMovement());
		}
		else if (Monkey.class.getSimpleName().equals(name)) {
			return new Monkey(new RunMovement());
		}
		throw new IllegalArgumentException("Unknown Primate: " + name);
	}

}
