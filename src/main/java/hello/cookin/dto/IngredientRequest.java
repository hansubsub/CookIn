package hello.cookin.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class IngredientRequest {
    private String name;
    private LocalDate expirationDate;
    private Long userId;  // 등록하는 사용자 ID
}