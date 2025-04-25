package creations.builders;

import java.time.LocalDate;

public class Client {
	public static void main(String[] args) {
        User user = createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();

        UserDTO dto = directBuild(builder, user);
        System.out.println(dto.toString());
    }

    private static UserDTO directBuild(UserDTOBuilder builder, User user) {
        builder.withFirstName(user.getFirstName())
            .withLastName(user.getLastName())
            .withBirthDate(user.getBirthDate())
            .withAddress(user.getAddress());

        return builder.build();
    }

    public static User createUser() {
        User user = new User();
		user.setBirthDate(LocalDate.of(1960, 5, 6));
		user.setFirstName("Ron");
		user.setLastName("Swanson");
		Address address = new Address();
		address.setHouseNumber("100");
		address.setStreet("State Street");
		address.setCity("Pawnee");
		address.setState("Indiana");
		address.setZipcode("47998");
		user.setAddress(address);
		return user;
    }
}
