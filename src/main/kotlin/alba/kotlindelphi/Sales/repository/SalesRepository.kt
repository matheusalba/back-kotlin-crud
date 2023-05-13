package alba.kotlindelphi.Sales.repository

import alba.kotlindelphi.Sales.entity.SaleEntity
import org.springframework.data.jpa.repository.JpaRepository

interface SalesRepository:JpaRepository<SaleEntity, Long> {
}