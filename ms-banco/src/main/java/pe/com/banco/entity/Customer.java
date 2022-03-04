package pe.com.banco.entity;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "CUSTOMER")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CUSTOMER", nullable = false)
	private Long idCustomer;

	@ManyToOne(optional = false)
	@JoinColumn(name = "ID_TYPE_CUSTOMER", nullable = false)
	private TypeCustomer typeCustomer;

	@Column(name = "NAME", length =100, nullable = false)
	private String name;
	
	@Column(name = "LAST_NAME", length =100, nullable = false)
	private String lastName;
	
	@Column(name = "GENDER", length =1, nullable = false)
	private String gender;

	@Column(name = "EMAIL", length =100, nullable = false)
	private String email;

	@Column(name = "TYPE_DOCUMENT", length =30, nullable = false)
	private Integer typeDocument;
	
	@Column(name = "NUMBER_DOCUMENT", length =30, nullable = false)
	private Integer numberDocument;
	
	@Column(name = "ADDRESS", length =100)
	private String address;

}