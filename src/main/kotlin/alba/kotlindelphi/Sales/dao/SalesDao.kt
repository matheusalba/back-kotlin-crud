package alba.kotlindelphi.Sales.dao

import jakarta.persistence.EntityManager
import org.springframework.stereotype.Service

@Service
class SalesDao(
    val entityManager: EntityManager
) {
    fun sales():List<Any?>{
        val query = entityManager.createNativeQuery(
            """
            select
            sp.product_id,
            p.product_name,
            coalesce( sum(p.product_sale_price) - sum(p.product_cost_price), 0 ) as lucro 
            from sales_products sp
            inner join products p on p.product_id = sp.product_id
            group by 1,2    
            """.trimIndent()
        )
        return query.resultList
    }
}