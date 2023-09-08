package ra.md5_ss9_bt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ra.md5_ss9_bt.model.Product;

public interface IProductRepository extends JpaRepository<Product,Long> {

}
