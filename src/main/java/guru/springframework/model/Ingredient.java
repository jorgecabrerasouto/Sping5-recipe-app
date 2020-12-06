package guru.springframework.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import guru.springframework.model.Ingredient;

@Entity
@Table(name = "Ingredient")
public class Ingredient implements Serializable {

	private static final long serialVersionUID = 1L;

	public Ingredient() {
	}

	
	public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom) {
		super();
		this.description = description;
		this.amount = amount;
		this.uom = uom;
	}

	public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom, Recipe recipe) {
		super();
		this.description = description;
		this.amount = amount;
		this.uom = uom;
		this.recipe = recipe;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String description;
	private BigDecimal amount;

	@OneToOne(fetch = FetchType.EAGER)
	private UnitOfMeasure uom;

	@ManyToOne
	private Recipe recipe;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	public UnitOfMeasure getUom() {
		return uom;
	}

	public void setUom(UnitOfMeasure uom) {
		this.uom = uom;
	}

}
