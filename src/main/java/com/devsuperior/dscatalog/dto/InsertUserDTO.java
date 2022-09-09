package com.devsuperior.dscatalog.dto;

public class InsertUserDTO extends UserDTO {

    private static final Long serialVersionUID = 1L;

    private String password;

    public InsertUserDTO(String password) {
        super();
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
