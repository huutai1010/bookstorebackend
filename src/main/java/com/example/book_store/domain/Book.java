package com.example.book_store.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Setter
@Getter
@Entity
@Data
@Table(name = "book_product")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "oldPrice", nullable = false)
    private double oldPrice;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "image", nullable = false)
    private String image;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "numbers", nullable = false)
    private int numbers;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "publisher", nullable = false)
    private String publisher;

    @Column(name = "isSaleOff", nullable = false)
    private Boolean isSaleOff;

    public Book() {}
    public Book(Long id, String title, double price, double oldPrice, String description, String image, Date date, int numbers, String author, String publisher, Boolean isSaleOff) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.oldPrice = oldPrice;
        this.description = description;
        this.image = image;
        this.date = date;
        this.numbers = numbers;
        this.author = author;
        this.publisher = publisher;
        this.isSaleOff = isSaleOff;
    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", oldPrice=" + oldPrice +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", date=" + date +
                ", numbers=" + numbers +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", isSaleOff=" + isSaleOff +
                '}';
    }
}
