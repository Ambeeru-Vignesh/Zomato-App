package zomatoApp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import zomatoApp.dto.RestaurantDto;
import zomatoApp.entities.enums.UserRole;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String email;
    private String Password;

    private UserRole role;

    private List<Order> orders;

    private List<RestaurantDto> favourites = new ArrayList<>();

    private List<String> addresses = new ArrayList<>();

    private String status;


}
