package com.mon.espace.medical.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Register {
    private long id;
    private String first_name;

    private String last_name;

    private String email;

    private String password;


}
