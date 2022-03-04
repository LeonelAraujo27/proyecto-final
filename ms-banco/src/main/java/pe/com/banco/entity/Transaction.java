package pe.com.banco.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "TRANSACTION")
public class Transaction implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TRANSACTION", nullable = false)
    private Long idTransaction;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_TYPE_TRANSACTION", nullable = false)
    private TypeTransaction typeTransaction;

    @ManyToOne(optional = true)
    @JoinColumn(name = "ID_CARD", nullable = true)
    private Card card;

    @ManyToOne(optional = true)
    @JoinColumn(name = "ID_LOAN", nullable = true)
    private Loan loan;

    @Column(name = "AMOUNT", precision = 8, scale = 2, nullable = false)
    private BigDecimal amount;

    @Column(name = "DATE_REGISTRATION", nullable = false)
    private LocalDateTime dateRegistration;

}