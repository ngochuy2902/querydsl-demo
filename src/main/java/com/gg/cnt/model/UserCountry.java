package com.gg.cnt.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "user_countries")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserCountry implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "country_id", nullable = false)
    private Long countryId;

    @ManyToOne
    @JoinColumn(insertable = false, updatable = false)
    private User user;

    @ManyToOne
    @JoinColumn(insertable = false, updatable = false)
    private Country country;
}
