package zomatoApp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String price;

    private Category foodCategory;

    private List<String> images;

    private boolean available;

    private Restaurant restaurant;

    private boolean isVegetarian;
    private boolean isSeasonal;

    private List<String> ingredients = new ArrayList<>();

    private Date creationDate;
}
