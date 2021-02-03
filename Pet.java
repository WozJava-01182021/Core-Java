package robertd.core_java.common.animal;

import robertd.core_java.common.Nameable;

public interface Pet extends Domesticatable, Nameable {
	// public Pet() {}  // for ch2.Constructors
	public abstract boolean haslicense();
	public abstract void befriendly();
	


}
