package alba.kotlindelphi.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import java.time.LocalDate
import java.time.LocalDateTime

@Entity
@Table(name = "sales")
class SaleEntity (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val sale_id: Long? = 0,

    @Column
    val sale_date: LocalDate? = LocalDate.now(),

    @Column
    @Enumerated(EnumType.STRING)
    val sale_payment_method : PaymentMethodEnum? = null,

    @ManyToMany
    @JoinTable(
        name = "sale_products",
        joinColumns = arrayOf(JoinColumn(name="sale_id")),
        inverseJoinColumns = arrayOf(JoinColumn(name="product_id"))
    )
    val product_sold: List<ProductEntity> = listOf(),

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "store_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    var store_id: StoreEntity? = null



)