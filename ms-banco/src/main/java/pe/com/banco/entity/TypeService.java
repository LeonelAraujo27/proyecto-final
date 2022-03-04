package pe.com.banco.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "TYPE_SERVICE")
public class TypeService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TYPE_SERVICE", nullable = false)
    private Long idTypeService;

    @Column(name = "NAME", length =6, nullable = false)
    private String name;

}