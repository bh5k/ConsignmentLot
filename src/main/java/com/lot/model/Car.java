package com.lot.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorValue("Car")
@NoArgsConstructor
@Getter
@Setter
public class Car extends Vehicle {
    private String type;
}
