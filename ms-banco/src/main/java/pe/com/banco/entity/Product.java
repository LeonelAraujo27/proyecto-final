package pe.com.banco.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "PRODUCT")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PRODUCT", nullable = false)
	private Long idProduct;

	@ManyToOne(optional = false)
	@JoinColumn(name = "ID_TYPE_PRODUCT", nullable = false)
	private TypeProduct typeProduct;

	@Column(name = "NAME", length =20, nullable = false)
	private String name;

	@Column(name = "COMMISSION", precision = 5, scale = 2, nullable = false)
	private BigDecimal commission;

	@Column(name = "LIMIT_MAXIMUM", nullable = false)
	private Integer limitMaximum;

}