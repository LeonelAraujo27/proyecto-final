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
@Table(name = "MOVEMENT")
public class Movement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MOVEMENT", nullable = false)
    private Long idMovement;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_TYPE_MOVEMENT", nullable = false)
    private TypeMovement typeMovement;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_ACCOUNT", nullable = false)
    private Account account;

    @Column(name = "AMOUNT", precision = 8, scale = 2, nullable = false)
    private BigDecimal amount;

    @Column(name = "DATE_REGISTRATION", nullable = false)
    private LocalDateTime dateRegistration;

}