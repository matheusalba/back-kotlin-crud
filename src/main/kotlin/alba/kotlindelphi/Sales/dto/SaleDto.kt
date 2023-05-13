package alba.kotlindelphi.Sales.dto

import alba.kotlindelphi.Payment.dto.PaymentMethodEnum

class SaleDto (
    val sale_payment_method: PaymentMethodEnum,
    val store_id: Long = 0
    )