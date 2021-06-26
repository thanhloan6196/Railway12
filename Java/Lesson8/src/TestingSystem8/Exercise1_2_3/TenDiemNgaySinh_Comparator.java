package TestingSystem8.Exercise1_2_3;

import java.util.Comparator;

public class TenDiemNgaySinh_Comparator implements Comparator<StudentEx2>{

	@Override
	public int compare(StudentEx2 o1, StudentEx2 o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
	public int compareDiem(StudentEx2 s1, StudentEx2 s2) {
		if(s1.getDiem()==s2.getDiem()) {
			return 0;
		}
		else if(s1.getDiem() > s2.getDiem()) {
			return 1;
		}
		else {
			return -1;
		}
			
	}
	
	public int compareNgaySinh(StudentEx2 o1, StudentEx2 o2) {
		// TODO Auto-generated method stub
		return o1.getNgaySinh().compareTo(o2.getNgaySinh());
	}

}
