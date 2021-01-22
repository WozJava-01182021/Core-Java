package kipk.core_java.common.animal;

public interface Carnivore {
	public abstract void hunt();
	public abstract String findPrey();
	public abstract boolean catchPrey (Animal target);

}
