package edu.bzu.app.restapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data

@AllArgsConstructor
@NoArgsConstructor

@Entity

@Table
public class Customer implements Serializable{
    @Id
    @GeneratedValue
    private Long id;
    private String fullName;
    private String gender;
//        private String password;
    private String email;
    private Long phoneNumber;

}
