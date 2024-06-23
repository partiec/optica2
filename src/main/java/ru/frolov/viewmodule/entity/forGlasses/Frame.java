package ru.frolov.viewmodule.entity.forGlasses;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Frame {
    @Id
    private Long id;

    private String firm;
    private String model;
    private String material;
    private String typeOfFixation;

}
