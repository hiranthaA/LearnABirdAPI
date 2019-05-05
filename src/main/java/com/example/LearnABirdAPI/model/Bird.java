package com.example.LearnABirdAPI.model;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import java.lang.annotation.Documented;
import java.sql.Blob;

@Entity
public class Bird {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    @Column(columnDefinition="TEXT")
    private String info;
    @Lob
    private byte[] photo;
    @Lob
    private byte[] sound;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public byte[] getSound() {
        return sound;
    }

    public void setSound(byte[] sound) {
        this.sound = sound;
    }
}
