package alba.kotlindelphi.DTO.PaymentsDtos


import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.UUID

class PaymentDto(
    val paymentCode: UUID,
    val money:List<Money>? = null,
    val credit:List<Credit>? = null,
    val pix:List<Pix>? = null,
    val check:List<Check>? = null,
    )
class Money(
    val moneyDateTime: LocalDateTime? = null,
    val moneyValue: BigDecimal? = null,
    val moneyEmployer: String? = null,
    val moneyLocal: String? = null,
    val monetaryUnit: String? = null
)
class Credit(
    val creditDateTime: LocalDateTime? = null,
    val creditValue: BigDecimal? = null,
    val creditMouths: Int? = null,
    val creditFlag: String? = null,
    val creditFees: Double? = null,
    )
class Pix(
    val pixDateTime: LocalDateTime? = null,
    val pixValue: BigDecimal? = null,
    val pixEmployer: String? = null,
    val pixClient: String? = null,
)
class Check(
    val checkDateTime: LocalDateTime? = null,
    val checkMouths: Int? = 0,
    val checkEmployer: String? = null,
    val checkClient: String? = null,
)