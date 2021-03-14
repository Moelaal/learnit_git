package oop.onlineShop.storage.impl;

import oop.onlineShop.enteties.Product;
import oop.onlineShop.enteties.impl.DefaultProduct;
import oop.onlineShop.storage.ProductStoringService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class DefaultProductStoringService implements ProductStoringService {
    private static final String PRODUCT_INFO_STORAGE = "product.csv";
    private static final String CURRENT_TASK_RESOURCE = "finaltask";
    private static final String RESOURCE_FOLDER = "resources";
    private static final int  PRODUCT_PRICE_INDEX = 3;
    private static final int PRODUCT_CATEGORY_INDEX = 2;
    private static final int PRODUCT_NAME_INDEX = 1;
    private static final int PRODUCT_ID_INDEX = 0;



    @Override
    public List<Product> loadProduct() {
        try(var stream = Files.lines(Paths.get(RESOURCE_FOLDER,CURRENT_TASK_RESOURCE,PRODUCT_INFO_STORAGE))){
            return stream.filter(Objects::nonNull).filter(line -> !line.isEmpty()).map(
                    line -> {
                        String[] productElements = line.split(",");
                        return new DefaultProduct(Integer.valueOf(productElements[PRODUCT_ID_INDEX]),
                                productElements[PRODUCT_NAME_INDEX],productElements[PRODUCT_PRICE_INDEX],
                                productElements[PRODUCT_CATEGORY_INDEX],Double.valueOf(productElements[PRODUCT_PRICE_INDEX]));
                    }
            ).collect(Collectors.toList());
        }catch(IOException e){
            e.printStackTrace();
            return Collections.EMPTY_LIST;
        }
    }
}
