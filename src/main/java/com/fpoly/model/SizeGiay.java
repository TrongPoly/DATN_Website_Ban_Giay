package com.fpoly.model;

import jakarta.persistence.*;

@Entity
@Table(name = "size_giay")
public class SizeGiay {
    @Id
    @Column(name = "id_giay", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "\"size\"")
    private Integer size;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

}