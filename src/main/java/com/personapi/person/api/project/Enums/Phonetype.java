package com.personapi.person.api.project.Enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public enum Phonetype {
    HOME("Home"),
    MOBILE("Mobile"),
    COMMERCIAL("Commercial");
    private final String description;
}
