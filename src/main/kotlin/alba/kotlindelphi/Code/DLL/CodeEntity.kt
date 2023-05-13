package alba.kotlindelphi.Code.DLL

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table


@Entity
@Table(name="authcodes")
class CodeEntity {
    @Id
    val id_code: Int = 0

    @Column
    val code: String = ""
}