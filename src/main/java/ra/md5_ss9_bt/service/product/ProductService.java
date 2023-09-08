package ra.md5_ss9_bt.service.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.md5_ss9_bt.model.Product;
import ra.md5_ss9_bt.repository.IProductRepository;

import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);

    }

    @Override
    public void remove(Long id) {
        productRepository.deleteById(id);
    }
}
