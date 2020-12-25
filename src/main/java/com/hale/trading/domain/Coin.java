package com.hale.trading.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Coin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long coinId;
    private String coinName;
    private String coinDescription;

    @Transient
    private List<MultipartFile> images= new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL)

    private List<Image> imageList;
    @ManyToMany(cascade = CascadeType.MERGE)
    List<Category> categories = new ArrayList<>();

    private Long sellerId;
    private CoinStatus coinStatus;
}
