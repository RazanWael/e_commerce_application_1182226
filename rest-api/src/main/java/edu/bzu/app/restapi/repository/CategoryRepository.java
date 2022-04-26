package edu.bzu.app.restapi.repository;

import edu.bzu.app.restapi.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring recognises the repositories by the fact that they extend one of the predefined Repository interfaces
 * Author: Mohammed Kharma
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
