import dto.ProductDTO;
import lombok.SneakyThrows;
import okhttp3.ResponseBody;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;
import retrofit2.Response;

import static org.hamcrest.MatcherAssert.assertThat;



public class ProductTest extends AbstractTest {
    @SneakyThrows
    @Test
    void createProductTest() {
        Response<ProductDTO> response = getProductService().createProduct(getProduct())
                .execute();
        assertThat(response.isSuccessful(), CoreMatchers.is(true));
    }


    @SneakyThrows
    @Test
    void getProductByIdTest() {
        Response<ProductDTO> response = getProductService().getProductById(1)
                .execute();
        assertThat(response.isSuccessful(), CoreMatchers.is(true));
    }

    @SneakyThrows
    @Test
    void getAllProductsTest() {
        Response<ResponseBody> response = getProductService().getProducts()
                .execute();
        assertThat(response.isSuccessful(), CoreMatchers.is(true));
    }

    @SneakyThrows
    @Test
    void modifyProductTest() {
        Response<ProductDTO> response = getProductService().modifyProduct(getProduct().withId(1))
                .execute();
        assertThat(response.isSuccessful(), CoreMatchers.is(true));
    }

    @SneakyThrows
    @Test
    void deleteProductTest() {
        Response<ResponseBody> response = getProductService().deleteProduct(1)
                .execute();
        assertThat(response.isSuccessful(), CoreMatchers.is(true));
    }



}
