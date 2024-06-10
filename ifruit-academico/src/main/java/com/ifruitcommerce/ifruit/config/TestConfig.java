package com.ifruitcommerce.ifruit.config;

import com.ifruitcommerce.ifruit.entities.*;
import com.ifruitcommerce.ifruit.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;
import java.util.Date;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Matheus", "matheus.avila@exemplo.com", "458742847238", "mat1234");
        User u2 = new User(null, "Joselino", "joselino@exemplo.com", "458742847234", "12345ADMIN");

        userRepository.saveAll(Arrays.asList(u1, u2));

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));

        Product p1 = new Product(null, "O Hobbit", "Aventura épica escrita por J.R.R. Tolkien.", 85.0, "");
        Product p2 = new Product(null, "iPhone 13", "Smartphone de última geração com câmera avançada.", 4999.0, "");
        Product p3 = new Product(null, "Dell Inspiron", "Notebook confiável e potente para uso diário.", 3000.0, "");
        Product p4 = new Product(null, "Xbox Series X", "Console de videogame com gráficos impressionantes.", 4500.0, "");
        Product p5 = new Product(null, "Cozinha Prática", "Livro de receitas para cozinheiros iniciantes e experientes.", 50.0, "");

        p1.getCategories().add(cat2);
        p2.getCategories().add(cat1);
        p2.getCategories().add(cat3);
        p3.getCategories().add(cat3);
        p4.getCategories().add(cat3);
        p5.getCategories().add(cat2);

        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

        Order o1 = new Order(null, new Date(), OrderStatus.PAID, u1);
        Order o2 = new Order(null, new Date(), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, new Date(), OrderStatus.WAITING_PAYMENT, u1);

        orderRepository.saveAll(Arrays.asList(o1, o2, o3));

        OrderItem oi1 = new OrderItem(o1, p1, 2, p1.getPrice());
        OrderItem oi2 = new OrderItem(o1, p3, 1, p3.getPrice());
        OrderItem oi3 = new OrderItem(o2, p3, 2, p3.getPrice());
        OrderItem oi4 = new OrderItem(o3, p5, 2, p5.getPrice());

        orderItemRepository.saveAll(Arrays.asList(oi1, oi2, oi3, oi4));

        Payment pay1 = new Payment(null, new Date(), o1);
        o1.setPayment(pay1);

        orderRepository.save(o1);
    }
}