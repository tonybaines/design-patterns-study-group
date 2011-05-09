package abstractfactory;

import animals.Animal;

public abstract class AbstractAnimalFactory {
	public abstract Animal createNew(final String name);
}
