package com.example.saveanddownloadpicture.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "image_table")
public class ImageFile{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private String name;

    @Column(name = "picByte")
    private byte[] picByte;

    public ImageFile() {
        super();
    }


    public ImageFile(String name, String type, byte[] picByte) {
        this.type = type;
        this.name = name;
        this.picByte = picByte;
    }
}
