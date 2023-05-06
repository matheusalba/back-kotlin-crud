package alba.kotlindelphi.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import java.util.UUID

@Entity
@Table(name ="paymentsCode")
class PaymentCodeEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var payment_code_id: Long? = 0,

    @GeneratedValue(strategy = GenerationType.AUTO)
    val payment_code_uuid: UUID? = UUID.randomUUID(),

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sale_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    val payment_code_venda_id: SaleEntity? = null

    )