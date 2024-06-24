package ru.frolov.viewmodule.entity.forOrder;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.frolov.viewmodule.entity.forGlasses.Frame;
import ru.frolov.viewmodule.entity.forGlasses.GLens;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    // дата = new Date();
// Фамилия клиента
// Адрес клиента
// Список оправ
// Список очковых линз
    @Id
    private Long id;

    private Date date = new Date();
    private String name;
    private String adress;

    @OneToMany
    private List<Frame> frames;

    @OneToMany
    private List<GLens> gLenses;
}
