package creations.builders;

import java.time.LocalDate;

public interface UserDTOBuilder {
	UserDTO build();
    UserDTO getUserDTO();
    UserDTOBuilder withFirstName(String firstName);
    UserDTOBuilder withLastName(String lastName);
    UserDTOBuilder withBirthDate(LocalDate date);
    UserDTOBuilder withAddress(Address address);
}
