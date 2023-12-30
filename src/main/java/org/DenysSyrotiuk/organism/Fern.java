package org.DenysSyrotiuk.organism;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class Fern extends Plant {
    @Override
    public Fern reproduce() {
        Fern reproduce = new Fern();
        reproduce.setIcon(getIcon());
        reproduce.setMaxAmount(getMaxAmount());
        reproduce.setMaxWeight(getMaxWeight());
        return reproduce;
    }
}
