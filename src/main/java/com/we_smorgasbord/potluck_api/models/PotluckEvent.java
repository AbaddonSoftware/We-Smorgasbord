package com.we_smorgasbord.potluck_api.models;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

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

    private String name;

    // TODO: Implement a better way of handling event date
    private String EventDate;

    // TODO: Customize Location implementation
    private String EventLocation;

    private String description;

    private String imageLocation;
    
}
