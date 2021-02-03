package robertd.core_java.common.animal;

public class AgeException extends RuntimeException {

	int badAge;
	int maxAgeAllowed;
	Class inputClass;
	
	public AgeException() {
		super();
	}

	public AgeException(String msg) {
		super(msg);
	}
	
	public AgeException(int ageIn, int maxAge, Class classIn) {
		badAge = ageIn;
		maxAgeAllowed = maxAge;
		inputClass = classIn;
	}
	
	@Override
	public String getMessage () {
		String msg = "Age of " + badAge;
		msg += " for class " + inputClass.getSimpleName() + " is invalid. ";
		msg += "The allowed range is from 0 to " + maxAgeAllowed;
		return msg;
	}


}
