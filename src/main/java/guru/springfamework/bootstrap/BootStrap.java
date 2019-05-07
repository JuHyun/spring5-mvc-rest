package guru.springfamework.bootstrap;

import guru.springfamework.domain.Category;
import guru.springfamework.repositories.CategoryRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class BootStrap implements CommandLineRunner {

    private final CategoryRepository categoryRepository;

    public BootStrap(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<Category> iterable = Arrays.asList(new Category("fruits"), new Category("dried"),
                new Category("fresh"), new Category("exotic"), new Category("nuts"));
        categoryRepository.saveAll(iterable);
    }
}
