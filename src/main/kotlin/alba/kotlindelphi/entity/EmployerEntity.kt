package alba.kotlindelphi.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction

@Entity
@Table(name="employes")
class EmployerEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
var employer_id: Long? = 0

@Column
var employer_name: String = ""

@Column
var employer_position: String = ""

@ManyToOne(fetch = FetchType.LAZY, optional = false)
@JoinColumn(name = "store_id", nullable = false)
@OnDelete(action = OnDeleteAction.CASCADE)
@JsonIgnore
var store_id: StoreEntity? = null

}