package ma.emsi.studentsapp.repository;

import ma.emsi.studentsapp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
      List<Product> findByNameContains(String c);

      List<Product> findByPriceGreaterThan(double price);

      @Query("update Product  set name='Phone' where id = :y")
      Product updateById(@Param("y") Long i);
      @Query("select p from Product p where p.name like :x")
      List<Product> search(@Param("x") String c);

      @Query("select p from Product p where p.price > :x")
      List<Product> searchByPrice(@Param("x") double c);



}
