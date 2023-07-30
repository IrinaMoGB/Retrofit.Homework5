package api;
import dto.ProductDTO;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ProductService {
    @POST("products")
    Call<ProductDTO> createProduct(@Body ProductDTO createProductRequest);

    @DELETE("products/{id}")
    Call<ResponseBody> deleteProduct(@Path("id") int id);

    @PUT("products")
    Call<ProductDTO> modifyProduct(@Body ProductDTO modifyProductRequest);

    @GET("products/{id}")
    Call<ProductDTO> getProductById(@Path("id") int id);

    @GET("products")
    Call<ResponseBody> getProducts();


}
