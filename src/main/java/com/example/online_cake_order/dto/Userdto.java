package com.example.online_cake_order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
@Data
@AllArgsConstructor
public class Userdto {
    private Integer id;
    @NonNull
    private String fullName;
    @NonNull
    private String email;
    @NonNull
    private String mobileNo;
    @NonNull
    private String password;

}
