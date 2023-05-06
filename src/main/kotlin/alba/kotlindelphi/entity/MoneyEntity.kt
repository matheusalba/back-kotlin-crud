package alba.kotlindelphi.entity

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
    val moneyId: Long? = 0,

    @Column
    val moneyLocalDateTime: LocalDateTime = LocalDateTime.now(),

    @Column
    val moneyValue: BigDecimal? =  BigDecimal.ZERO ,

    @Column
    val moneyEmployer: String? = "",

    @Column
    val moneyLocal: String? = "",

    @Column
    val monetaryUnit: String? = "",

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "payment_code_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    val moneyPaymentCode: PaymentCodeEntity? = null,
    )