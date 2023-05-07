package alba.kotlindelphi.business

import alba.kotlindelphi.DTO.PaymentsDtos.PaymentDto
import alba.kotlindelphi.DTO.SaleDto
import alba.kotlindelphi.DTO.SaleProductDto
import alba.kotlindelphi.entity.MoneyEntity
import alba.kotlindelphi.entity.PaymentEntity
import alba.kotlindelphi.entity.SaleEntity
import alba.kotlindelphi.entity.SaleProductEntity
import alba.kotlindelphi.repository.*
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException
import java.time.LocalDate
import java.time.LocalDateTime

@RestController
@RequestMapping("sale")
class SalesBusiness(
    val storeRepository: StoreRepository,
    val salesRepository: SalesRepository,
    val productRepository: ProductRepository,
    val moneyRepository: MoneyRepository,
    val pixRepository: PixRepository,
    val salesProductRepository: SaleProductRepository,
    val paymentRepository: PaymentRepository,
) {

    @PostMapping("save")
    fun postSale(@RequestBody saleDto: SaleDto) {
        val store = storeRepository.findById(saleDto.store_id).orElseThrow { ResponseStatusException(HttpStatus.NOT_FOUND) }
        salesRepository.save(SaleEntity(
            null,
            LocalDate.now(),
            saleDto.sale_payment_method,
            store
        ))
    }

    @PostMapping("saleproduct")
    fun postSaleProduct(@RequestBody saleProductDto: SaleProductDto){

        val store = storeRepository.findById(saleProductDto.storeId).orElseThrow { ResponseStatusException(HttpStatus.NOT_FOUND) }
        val sale = salesRepository.findById(saleProductDto.saleId).orElseThrow { ResponseStatusException(HttpStatus.NOT_FOUND) }
        val product = productRepository.findById(saleProductDto.productId).orElseThrow { ResponseStatusException(HttpStatus.NOT_FOUND) }
        if(store.store_id?.equals(sale.store_id?.store_id) == true) {
            salesProductRepository.save(
                SaleProductEntity(
                    null,
                    store,
                    sale,
                    product
                )
            )
        }
    }

    @PostMapping("payment")
    fun postPayment(@RequestBody payment: PaymentDto) {
        var pay : PaymentEntity? = null

        if(salesRepository.existsById(payment.saleId)){
            pay = paymentRepository.save(
                PaymentEntity(null,
                salesRepository.getReferenceById(payment.saleId)
            ))
        }

        if(payment.money?.isNotEmpty() == true && pay!=null){
            payment.money.forEach {
                moneyRepository.save(
                    MoneyEntity(null,
                        LocalDateTime.now(),
                        it.moneyValue,
                        it.moneyEmployer,
                        it.moneyLocal,
                        it.monetaryUnit,
                        pay
                ))
            }
        }
    }


}