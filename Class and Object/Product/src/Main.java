import model.Product;
import model.ProductCategory;

import java.time.LocalDate;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Product coca = new Product(1,
                UUID.randomUUID().toString(),
                "Coca",
                "This is Coca.",
                LocalDate.now(),
                LocalDate.of(999, 4, 5),
                new String[] {"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQHQKxL7IQsZ3tthbzioGqmlMDQdJ1Iv8kzWw&s"},
                new ProductCategory[]{ProductCategory.DRINK,ProductCategory.FRUIT});

        System.out.println(coca);

    };
}