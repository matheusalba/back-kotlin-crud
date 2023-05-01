package alba.kotlindelphi.DTO

import alba.kotlindelphi.entity.PaymentMethodEnum

class SaleDto (
    val sale_payment_method: PaymentMethodEnum,
    val store_id: Long = 0,
    val product_id: Long = 0
    )