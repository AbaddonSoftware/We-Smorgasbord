package com.we_smorgasbord.potluck_api.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name="user")
public class User {
    
    @Id
    @GeneratedValue
    private Long id;
    
    
    private String name;
    

    private String email;

}
