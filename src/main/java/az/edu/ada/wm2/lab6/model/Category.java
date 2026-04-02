package az.edu.ada.wm2.lab6.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;
import java.util.UUID;
import az.edu.ada.wm2.lab6.model.Product;

@Entity
@Table(name = "categories")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Category {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    // This is the back reference to products
    @ManyToMany(mappedBy = "categories")
    private Set<Product> products;
}