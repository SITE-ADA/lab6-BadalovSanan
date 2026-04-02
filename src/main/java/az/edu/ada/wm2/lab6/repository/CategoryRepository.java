package az.edu.ada.wm2.lab6.repository;

import com.example.demo.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {
}