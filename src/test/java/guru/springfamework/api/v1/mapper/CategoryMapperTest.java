package guru.springfamework.api.v1.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import guru.springfamework.api.v1.model.CategoryDTO;
import guru.springfamework.domain.Category;
import org.junit.jupiter.api.Test;

class CategoryMapperTest {

    @Test
    public void shouldMapCarToDto() {
        Category category = new Category("fruits");

        CategoryDTO categoryDTO = CategoryMapper.INSTANCE.categoryToCategoryDto(category);

        assertEquals("fruits", categoryDTO.getName());
    }
}
