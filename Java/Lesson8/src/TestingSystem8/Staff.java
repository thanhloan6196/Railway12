package TestingSystem8;

public class Staff<N> extends MyMap<N, String>{

	public Staff(N id, String name) {
		super(id, name);
		
	}
	public N getId() {
		return getKey();
	}

	public String getName() {
		return super.getValue();
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
