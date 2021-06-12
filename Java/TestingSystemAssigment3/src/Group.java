import java.time.LocalDate;

public class Group implements Comparable<Group> {
	int id;
	String groupName;
	LocalDate createDate;

	@Override
	public int compareTo(Group o) {
		if (id < o.id)
			return -1;
		if (id > o.id)
			return 1;
		return 0;
	}

	// go equal roi Ctrl + Space:
	// equal:
//	@Override
//	public boolean equals(Object obj) {
//		if( obj == null) return false;
//		Group objGroup = (Group) obj; // ep kieu Object ve kieu Group.
//		
//		if(groupName.equals(objGroup.groupName) && id == objGroup.id) {
//			return true;
//		} return false;
//				
//	}
	// Object : to nhat cua java
	
	
	// to String:
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
