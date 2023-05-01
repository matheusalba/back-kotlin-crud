package alba.kotlindelphi.entity

import jakarta.persistence.*

@Entity
@Table(name = "sales")
class SaleEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val sale_id: Long? = 0,

    @ManyToMany
    @JoinTable(
        name = "sale_products",
        joinColumns = arrayOf(JoinColumn(name="sale_id")),
        inverseJoinColumns = arrayOf(JoinColumn(name="product_id"))
    )
    val product_sold: List<ProductEntity> = listOf()
)