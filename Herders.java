package robertd.core_java.common.animal.mammals;

import java.util.ArrayList;
import java.util.List;

public abstract class Herders extends Mammal{
	
	protected int minHerdSize;
	protected int maxHerdSize;
	
	List<Herders> herd = (List<Herders>) new ArrayList<Herders>();

}
