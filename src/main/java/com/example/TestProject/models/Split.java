package com.example.TestProject.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Split {

    private User user;
    private double amount;

    public Split(User user) {
        this.user=user;
    }
}
