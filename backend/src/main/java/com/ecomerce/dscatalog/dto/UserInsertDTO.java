package com.ecomerce.dscatalog.dto;

import java.util.Objects;

public class UserInsertDTO extends UserDTO {
	private static final long serialVersionUID = 1L;
	
	private String Password;
	
	public UserInsertDTO() {
		super();
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(Password);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserInsertDTO other = (UserInsertDTO) obj;
		return Objects.equals(Password, other.Password);
	}
}
