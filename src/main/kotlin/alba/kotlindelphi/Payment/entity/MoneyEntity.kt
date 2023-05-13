package alba.kotlindelphi.Payment.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import java.math.BigDecimal
import java.time.LocalDateTime

@Entity
@Table(name="money")
class MoneyEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val money_id: Long? = null,

    @Column
    val money_local_date_time: LocalDateTime = LocalDateTime.now(),

    @Column
    val money_value: BigDecimal? =  BigDecimal.ZERO,

    @Column
    val money_employer: String? = "",

    @Column
    val money_local: String? = "",

    @Column
    val monetaryUnit: String? = "",

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "payment_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    val money_payment_id: PaymentEntity? = null,
    )