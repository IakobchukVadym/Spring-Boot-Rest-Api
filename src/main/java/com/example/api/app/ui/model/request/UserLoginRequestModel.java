package com.example.api.app.ui.model.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserLoginRequestModel {
    private String email;
    private String password;
}
