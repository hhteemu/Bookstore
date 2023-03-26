package hh.sof3as3.Bookstore;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import hh.sof3as3.Bookstore.domain.Category;
import hh.sof3as3.Bookstore.domain.CategoryRepository;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class CategoryRepositoryTest {

	@Autowired
	private CategoryRepository repository;
	
	@Test
	public void findByNameShouldReturnCategory() {
		List<Category> categories = repository.findByName("Horror");
		assertThat(categories).hasSize(1);
		assertThat(categories.get(0).getName()).isEqualTo("Horror");
	}
	
	@Test
	public void createNewCategory() {
		Category c1 = new Category("Testikategoria");
		repository.save(c1);
		assertThat(c1.getName()).isNotNull();
	}
	
	@Test
	public void deleteCategory() {
		int repositoryLength = (int) repository.count();
		Category c1 = new Category("Testikategoria");
		repository.save(c1);
		assertThat(c1.getName()).isNotNull();
		repository.delete(c1);
		assertThat((int) repository.count()).isEqualTo(repositoryLength);
	}
}

