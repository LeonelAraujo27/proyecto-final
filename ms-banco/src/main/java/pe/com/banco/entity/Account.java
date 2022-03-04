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
@Table(name = "ACCOUNT")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ACCOUNT", nullable = false)
    private Long idAccount;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_CUSTOMER", nullable = false)
    private Customer customer;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_PRODUCT", nullable = false)
    private Product product;

    @Column(name = "NUMBER", length =20, nullable = false)
    private String number;

    @Column(name = "BALANCE", precision = 10, scale = 2, nullable = false)
    private BigDecimal balance;

    @Column(name = "MONEY", length =50, nullable = false)
    private String money;

    @Column(name = "ISO_MONEY", length =3, nullable = false)
    private String isoMoney;

}