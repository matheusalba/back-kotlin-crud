package alba.kotlindelphi.repository

import alba.kotlindelphi.entity.ProductEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository: JpaRepository<ProductEntity, Long>