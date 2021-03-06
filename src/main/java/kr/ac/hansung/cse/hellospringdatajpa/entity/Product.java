package kr.ac.hansung.cse.hellospringdatajpa.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "app_product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String brand;
    private String madein;
    private double price;

    public Product(String name, String brand, String madein, double price) {
        this.name = name;
        this.brand = brand;
        this.madein = madein;
        this.price = price;
    }
}
