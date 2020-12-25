package com.hale.trading.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long addId;
    @NotBlank
    private String street;
    @NotBlank
    private String city;
    @NotBlank
    private String state;
    @NotNull
    private Long zip;
    @NotBlank
    private String country;
}
