package alba.kotlindelphi.entity

import jakarta.persistence.*
import java.math.BigDecimal

@Entity
@Table(name = "products")
class ProductEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val product_id: Long? = 0,

    @Column
    val product_name : String? = "",

    @Column
    val product_cost_price: BigDecimal? = null,

    @Column
    val product_sale_price: BigDecimal? = null,

    @Column
    @OneToMany(mappedBy = "group_id")
    val group : List<ProductEntity>? = listOf(),

    @ManyToOne
    @JoinColumn
    val group_id : ProductEntity? = null
)