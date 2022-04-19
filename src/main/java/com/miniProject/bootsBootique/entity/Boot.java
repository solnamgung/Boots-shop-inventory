package com.miniProject.bootsBootique.entity;

import com.miniProject.bootsBootique.enums.BootType;

import javax.persistence.*;

@Entity
@Table(name = "BOOTS")
public class Boot {

    @Id
    @GeneratedValue()
    private Integer id;

    @Enumerated(EnumType.STRING) //This is used to ensure that Spring Data JPA knows that a BootType is just a String.
    @Column(name="TYPE")
    private BootType type;

    @Column(name="SIZE")
    private Float size;

    @Column(name="QUANTITY")
    private Integer quantity;

    @Column(name="MATERIAL")
    private String material;

    /*
    Remember, in order for Spring Data JPA to be able to convert between entries in the "BOOTS" table
    and instances of the Boot class, you’ll have to add getters and setters for each field.
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BootType getType() {
        return type;
    }

    public void setType(BootType type) {
        this.type = type;
    }

    public Float getSize() {
        return size;
    }

    public void setSize(Float size) {
        this.size = size;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
