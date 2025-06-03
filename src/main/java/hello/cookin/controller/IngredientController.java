package hello.cookin.controller;

import hello.cookin.dto.IngredientRequest;
import hello.cookin.dto.IngredientResponse;
import hello.cookin.service.IngredientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ingredients")
@RequiredArgsConstructor
public class IngredientController {

    private final IngredientService ingredientService;

    @PostMapping("/add")
    public IngredientResponse addIngredient(@RequestBody IngredientRequest request) {
        return ingredientService.addIngredient(request);
    }
    @GetMapping("/user/{userId}")
    public List<IngredientResponse> getIngredients(@PathVariable Long userId) {
        return ingredientService.getIngredientsByUserId(userId);
    }
    @PutMapping("/update/{ingredientId}")
    public IngredientResponse updateIngredient(
            @PathVariable Long ingredientId,
            @RequestBody IngredientRequest request) {
        return ingredientService.updateIngredient(ingredientId, request.getName(), request.getExpirationDate());
    }
    @DeleteMapping("/delete/{ingredientId}")
    public String deleteIngredient(@PathVariable Long ingredientId) {
        ingredientService.deleteIngredient(ingredientId);
        return "삭제 완료";
    }



}
