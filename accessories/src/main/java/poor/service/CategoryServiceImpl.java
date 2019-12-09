package poor.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import poor.repository.CategoryRepository;
import poor.model.Category;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

	@Qualifier("categoryRepository")
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public String saveCategory(Category category) {

		category.setActive(true);
		categoryRepository.saveAndFlush(category);
		return "Save Sucessfully";
	}

	@Override
	public List<Category> findAllCategories() {


		List<Category> categories = new ArrayList<>();
		List<Category> categoriesCopy = new ArrayList<>();
		categoryRepository.findAll().forEach(categories::add);
		categoriesCopy.addAll(categories);
		for (Category c : categories) {
			System.out.println(c);
			if (!c.isActive()) {
				categoriesCopy.remove(c);
			}
		}
		return categoriesCopy;

	}

	@Override
	public Category findCategoryById(Integer id) {

		Category category = categoryRepository.findOne(id);
		if (!category.isActive()) {
			category = null;
		}
		return category;
	}

	@Override
	public String deleteCategory(Integer id) {

		Category c = categoryRepository.findOne(id);
		c.setActive(false);
		categoryRepository.saveAndFlush(c);
		return "Deleted Successfully";
	}

	@Override
	public String updateCategory(Category category) {

		categoryRepository.saveAndFlush(category);
		return "Updated Successfully";
	}

}
