package com.etiya.productservice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="product_attributes")
public class ProductAttribute {
    @EmbeddedId
    private ProductAttributeId id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "product_id")
    @ManyToOne
    private Product product;

    @Column(name="value")
    private int value;

    @Id
    @ManyToOne
    @NotNull
    @JoinColumn (name="attribute_id")
    private Attribute attribute;



}
