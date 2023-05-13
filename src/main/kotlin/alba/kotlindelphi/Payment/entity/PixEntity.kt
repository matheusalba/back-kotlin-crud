package alba.kotlindelphi.Payment.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction

@Entity
@Table(name="pix")
class PixEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var pix_id: Long? = 0,



    )

