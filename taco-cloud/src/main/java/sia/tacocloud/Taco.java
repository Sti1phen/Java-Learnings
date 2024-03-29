package sia.tacocloud;


import java.util.Date;
import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Taco {

private Long id;
private Date CreatedAt = new Date();  


@NotNull
@Size(min = 5, message = "Name must be at least 5 characters long")    
private String name;

@NotNull
@Size(min = 1, message = "You must choose at least one ingredient")
private List<Ingredient> ingredients;
    
}
