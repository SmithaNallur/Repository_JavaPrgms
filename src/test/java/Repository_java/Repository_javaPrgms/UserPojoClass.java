package Repository_java.Repository_javaPrgms;

public class UserPojoClass {
	private int userId;
	private String FirstName;
	private String LastName;
    private int age;
	private String address;
	
	public UserPojoClass(int userId,String FirstName,String LastName,int age,String address) {
		super();
		this.userId=userId;
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.age = age;
		this.address = address;
		
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	
public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

public String getLastName() {
	return LastName;
	
}

public void setLastName(String lastName) {
	LastName=lastName;
	
}

@Override
public String toString() {
	return "UserPojoClass [userId=" + userId + ", FirstName=" + FirstName + ", LastName=" + LastName + ", age=" + age
			+ ", address=" + address + "]";
}

	
	}
