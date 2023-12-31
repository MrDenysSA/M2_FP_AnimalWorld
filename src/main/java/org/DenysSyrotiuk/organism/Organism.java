package org.DenysSyrotiuk.organism;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.DenysSyrotiuk.actionsOrganism.Reproducile;

import java.io.Serializable;
@Getter
@Setter
@ToString
public abstract class Organism implements Reproducile {
    private int     maxAmount;
}
