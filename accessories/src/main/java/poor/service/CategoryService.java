package poor.service;

import java.util.List;

import poor.model.Category;

public interface CategoryService {

	String saveCategory(Category category);

	List<Category> findAllCategories();

	Category findCategoryById(Integer id);

	String deleteCategory(Integer id);

	String updateCategory(Category branch);

}
