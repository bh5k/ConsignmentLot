package com.lot.model;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
//@DiscriminatorValue("Truck")
//@Getter
//@Setter
public class Truck extends Vehicle{
    private boolean is4wd;

    public boolean is4wd() {
        return is4wd;
    }

    public void set4wd(boolean is4wd) {
        this.is4wd = is4wd;
    }
}
