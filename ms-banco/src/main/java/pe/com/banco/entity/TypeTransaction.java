package pe.com.banco.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "TYPE_TRANSACTION")
public class TypeTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TYPE_TRANSACTION", nullable = false)
    private Long idTypeTransaction;

    @Column(name = "NAME", length =100, nullable = false)
    private String name;

}