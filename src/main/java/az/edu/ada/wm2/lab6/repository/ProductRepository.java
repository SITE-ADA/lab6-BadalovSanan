package az.edu.ada.wm2.lab6.repository;

import az.edu.ada.wm2.lab6.model.Product;
import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}