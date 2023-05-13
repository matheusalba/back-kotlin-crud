package alba.kotlindelphi.Sales.repository

import alba.kotlindelphi.Sales.entity.SaleProductEntity
import org.springframework.data.jpa.repository.JpaRepository

interface SaleProductRepository:JpaRepository<SaleProductEntity,Long>