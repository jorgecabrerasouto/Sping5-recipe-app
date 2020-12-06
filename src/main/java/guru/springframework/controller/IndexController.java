package guru.springframework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.services.RecipeService;

@Controller
public class IndexController {

	private final RecipeService recipeService;

	public IndexController(RecipeService recipeService) {
		super();
		this.recipeService = recipeService;
	}

	@RequestMapping({ "", "/", "index" })
	public String getIndexpage(Model model) {
		model.addAttribute("recipes", recipeService.getRecipes());
		return "index";
	}
}
