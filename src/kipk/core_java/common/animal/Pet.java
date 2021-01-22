package kipk.core_java.common.animal;

import kipk.core_java.common.Nameable;

public interface Pet extends Domesticatable,Nameable {
	public abstract boolean hasLicense();
	public abstract void beFriendly();

}
