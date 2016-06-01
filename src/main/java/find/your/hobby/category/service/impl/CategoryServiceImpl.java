package find.your.hobby.category.service.impl;

import find.your.hobby.category.domain.Category;
import find.your.hobby.category.repository.CategoryRepository;
import find.your.hobby.category.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

/**
 * Created by Iwan on 01.06.2016.
 */
@Component("categoryService")
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }
}
