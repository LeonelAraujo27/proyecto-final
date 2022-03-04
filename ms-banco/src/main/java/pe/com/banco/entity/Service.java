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
@Table(name = "SERVICE")
public class Service {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_SERVICE", nullable = false)
	private Long idService;

	@ManyToOne(optional = false)
	@JoinColumn(name = "ID_TYPE_SERVICE", nullable = false)
	private TypeService typeService;

	@Column(name = "NAME", length = 100, nullable = false)
	private String name;

}