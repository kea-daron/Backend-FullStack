package model;

import java.time.LocalDate;
import java.util.Arrays;

public class Product {
    private Integer id;
    private String uuid;
    private String pName;
    private String description;
    private LocalDate importedDate;
    private LocalDate exportedDate;
    private String[] pImages;
    private ProductCategory[] productCategories;
    public Product(){}
    public Product(Integer id, String uuid, String pName, String description, LocalDate importedDate, LocalDate exportedDate, String[] pImages, ProductCategory[] productCategories) {
        this.id = id;
        this.uuid = uuid;
        this.pName = pName;
        this.description = description;
        this.importedDate = importedDate;
        this.exportedDate = exportedDate;
        this.pImages = pImages;
        this.productCategories = productCategories;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id + '\n' +
                ", uuid='" + uuid + '\n' +
                ", pName='" + pName + '\n' +
                ", description='" + description + '\n' +
                ", importedDate=" + importedDate +
                ", exportedDate=" + exportedDate +
                ", pImages=" + Arrays.toString(pImages) +
                ", productCategories=" + Arrays.toString(productCategories) +
                '}';
    }
}
