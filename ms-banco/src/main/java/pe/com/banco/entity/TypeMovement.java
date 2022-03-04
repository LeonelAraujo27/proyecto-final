package pe.com.banco.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "TYPE_MOVEMENT")
public class TypeMovement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TYPE_MOVEMENT", nullable = false)
    private Long idTypeMovement;

    @Column(name = "NAME", length = 8, nullable = false)
    private String name;

}