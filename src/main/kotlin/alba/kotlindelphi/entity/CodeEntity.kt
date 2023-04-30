package alba.kotlindelphi.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

/*Por ser data class possui construtor e pode ser instanciada*/
@Entity
@Table(name="authcodes")
class CodeEntity {
    @Id
    val id_code: Int = 0

    @Column
    val code: String = ""
}