package alba.kotlindelphi.business

import alba.kotlindelphi.DTO.SaleDto
import alba.kotlindelphi.entity.SaleEntity
import alba.kotlindelphi.repository.ProductRepository
import alba.kotlindelphi.repository.SalesRepository
import alba.kotlindelphi.repository.StoreRepository
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException
import java.time.LocalDate

@RestController
@RequestMapping("sale")
class SalesBusiness(
    val storeRepository: StoreRepository,
    val salesRepository: SalesRepository,
    val productRepository: ProductRepository,
) {

@PostMapping("save")
fun postSale(@RequestBody saleDto: SaleDto) {
    val store = storeRepository.findById(saleDto.store_id).orElseThrow { ResponseStatusException(HttpStatus.NOT_FOUND) }
    val product = productRepository.findById(saleDto.product_id).orElseThrow { ResponseStatusException(HttpStatus.NOT_FOUND) }

    salesRepository.save(SaleEntity(null, LocalDate.now(), saleDto.sale_payment_method, listOf(product),store))
}

}
