package alba.kotlindelphi.Product.repository

import alba.kotlindelphi.Product.entity.ProductEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository: JpaRepository<ProductEntity, Long>