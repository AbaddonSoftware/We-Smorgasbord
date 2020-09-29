package com.we_smorgasbord.potluck_api.models;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="potluck")
public class PotluckEvent {

    @Id
    @GeneratedValue
    private Long id;

    private Instant creationDate;

    @NotNull
    @Size(min=3, max=150, message="Potluck Event name must not be less than 3 characters or more than 150.")
    private String name;

    // TODO: Implement a more standard method of handling event date then just raw string
    private String EventDate;

    // TODO: Customize Location implementation
    private String EventLocation;

    private String description;

    private String imageLocation;
    
}
