package io.electrosalaf.sanwo.models;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class AppUser {
    private UUID id;
    private String firstName;
    private String lastName;
    private String password;
}
