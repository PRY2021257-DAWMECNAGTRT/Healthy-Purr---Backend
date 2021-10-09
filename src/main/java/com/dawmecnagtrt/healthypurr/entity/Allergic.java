package com.dawmecnagtrt.healthypurr.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "allergics")
public class Allergic extends CommonEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "allergic_id", nullable = false)
    private Integer allergicId;

    @Column(nullable = false)
    @Size(max = 30)
    private String description;
}
