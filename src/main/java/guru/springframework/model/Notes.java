package guru.springframework.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Notes")
public class Notes implements Serializable {

	private static final long serialVersionUID = 1L;

	public Notes() {
	}

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	private Recipe recipe;
	
	@Lob
	private String recipeNotes;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Recipe getRecipe() {
		return recipe;
	}
	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}
	public String getRecipeNotes() {
		return recipeNotes;
	}
	public void setRecipeNotes(String recipeNotes) {
		this.recipeNotes = recipeNotes;
	}

}
