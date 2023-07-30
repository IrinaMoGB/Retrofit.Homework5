package api;

import dto.GetCategoryDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CategoryService {
    @GET("categories/{id}")
    Call<GetCategoryDTO> getCategory(@Path("id") int id);
}
