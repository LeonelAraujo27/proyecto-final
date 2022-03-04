package pe.com.banco.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "TYPE_PRODUCT")
public class TypeProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TYPE_PRODUCT", nullable = false)
    private Long idTypeProduct;

    @Column(name = "NAME", length = 8, nullable = false)
    private String name;

}