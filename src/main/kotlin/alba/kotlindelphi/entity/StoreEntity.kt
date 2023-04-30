package alba.kotlindelphi.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction

@Entity
@Table(name="stores")
data class StoreEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var store_id: Int? = 0,

    @Column
    var store_name: String? = "",

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    var user: UserEntity? = null

)
