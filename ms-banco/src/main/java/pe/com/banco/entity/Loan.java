package pe.com.banco.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "LOAN")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_LOAN", nullable = false)
    private Long idLoan;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_CUSTOMER", nullable = false)
    private Customer customer;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_TYPE_PRODUCT", nullable = false)
    private TypeProduct typeProduct;

    @Column(name = "REASON", length =20, nullable = false)
    private String reason;

    @Column(name = "AMOUNT", precision=10, scale=2, nullable = false)
    private BigDecimal amount;

    @Column(name = "RATE", precision=4, scale=2, nullable = false)
    private BigDecimal rate;

}