package pe.com.banco.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "TRANSACTION_CONSUMPTION")
public class TransactionConsumption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TRANSACTION_CONSUMPTION", nullable = false)
    private Long idTransactionConsumption;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_TRANSACTION", nullable = false)
    private Transaction transaction;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_SERVICE", nullable = false)
    private Service service;

}
