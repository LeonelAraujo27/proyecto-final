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
@Table(name = "CARD")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CARD", nullable = false)
    private Long idCard;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_CUSTOMER", nullable = false)
    private Customer customer;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_TYPE_PRODUCT", nullable = false)
    private TypeProduct typeProduct;

    @Column(name = "NUMBER", length =20, nullable = false)
    private String number;

    @Column(name = "LIMIT_CARD", precision = 8, scale =2, nullable = false)
    private BigDecimal limit;


}