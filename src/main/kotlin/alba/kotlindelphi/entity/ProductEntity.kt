package alba.kotlindelphi.entity

import jakarta.persistence.*

@Entity
@Table(name = "products")
class ProductEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val product_id: Long? = 0,

    @Column
    val product_name : String? = "",

    @ManyToMany(mappedBy = "product_sold")
    val sale: List<SaleEntity> = listOf(),

    @Column
    @OneToMany(mappedBy = "group_id")
    val group : List<ProductEntity>? = listOf(),

    @ManyToOne
    @JoinColumn
    val group_id : ProductEntity? = null
)