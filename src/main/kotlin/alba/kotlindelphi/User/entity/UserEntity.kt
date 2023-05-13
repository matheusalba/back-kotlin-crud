package alba.kotlindelphi.User.entity

import jakarta.persistence.*

@Entity
@Table(name="users")
data class UserEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column
    var name: String? = null,

    @Column
    var email: String? = null,

    @Column
    var phone: String? = null
    )