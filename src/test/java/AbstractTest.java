import com.github.javafaker.Faker;
import api.CategoryService;
import api.ProductService;
import dto.ProductDTO;
import utils.RetrofitUtils;
import org.junit.jupiter.api.BeforeAll;

public class AbstractTest {
    private static CategoryService categoryService;
    private static ProductService productService;
    private static ProductDTO product;
    private static Faker faker = new Faker();

    @BeforeAll
    static void beforeAll() {
        categoryService =
                RetrofitUtils.getRetrofit().create(CategoryService.class);

        productService =
                RetrofitUtils.getRetrofit().create(ProductService.class);

        product = new ProductDTO()
                .withTitle(faker.food().ingredient())
                .withCategoryTitle("Food")
                .withPrice((int) (Math.random() * 10000));
    }

    public CategoryService getCategoryService() {
        return categoryService;
    }

    public ProductService getProductService() {
        return productService;
    }

    public static ProductDTO getProduct() {
        return product;
    }
}
