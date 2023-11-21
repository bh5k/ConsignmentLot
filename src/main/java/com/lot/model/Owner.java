package com.lot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Owner {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    //@OneToMany(mappedBy = "owner")
    //private List<Vehicle> vehicles;

    @ManyToMany
    @JoinTable(
        name = "owner_vehicle",
        joinColumns = @JoinColumn(name = "owner_id"),
        inverseJoinColumns = @JoinColumn(name = "vehicle_id"))
    private List<Vehicle> vehicles;

}
