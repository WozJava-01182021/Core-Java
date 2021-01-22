package kipk.core_java.common;

public interface Nameable {
	
	//interfaces will always be public and abstract
	//abstract methods can be used in abstract classes or in interfaces
	//normally, method is closed with {}, but an abstract method must be close with ;
	//interfaces cannot contain variables, only constants
	public abstract String getName();
	public abstract void setName(String s);

}
