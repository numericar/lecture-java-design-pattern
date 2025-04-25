package creations.builders;

public class UserWebDTO implements UserDTO {
	private String name;
	private String address;
	private String age;

	public UserWebDTO(String name, String address, String age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getAddress() {
		return this.address;
	}

	@Override
	public String getAge() {
		return this.age;
	}

}
