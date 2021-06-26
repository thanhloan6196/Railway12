
import java.time.LocalDate;
import java.util.Date;

public class Account {
	int id;
	String email;
	String userName;
	String fullName;
	Department department;
	Position position;
	LocalDate createDate;
	Group[] dsNhom;

	// ko co parameter:
	public Account() {

	}

	// Có các parameter là id, Email, Username, FirstName,
//	LastName (với FullName = FirstName + LastName)
	public Account(int id, String email, String userName, String firstName, String lastName) {
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName + lastName;

	}

	// c,
	public Account(int id, String email, String userName, String firstName, String lastName, Position position) {
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName + " " + lastName;
		this.position = position;
		this.createDate = LocalDate.now();
	}
	
	//d,
	public Account(int id, String email, String userName, String firstName, String lastName, Position positionName, LocalDate createDate) {
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName + " " +  lastName;
		this.position.positionName = position.positionName;
		this.createDate = createDate;
	}

	public Account(int id, String email, String userName, String fullName, Department department, Position position,
			LocalDate createDate, Group[] dsNhom) {
		super();
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.department = department;
		this.position = position;
		this.createDate = createDate;
		this.dsNhom = dsNhom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public Group[] getDsNhom() {
		return dsNhom;
	}

	public void setDsNhom(Group[] dsNhom) {
		this.dsNhom = dsNhom;
	}

}
