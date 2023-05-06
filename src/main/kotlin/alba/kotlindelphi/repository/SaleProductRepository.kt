package alba.kotlindelphi.repository

import alba.kotlindelphi.entity.SaleProductEntity
import org.springframework.data.jpa.repository.JpaRepository

interface SaleProductRepository:JpaRepository<SaleProductEntity,Long>