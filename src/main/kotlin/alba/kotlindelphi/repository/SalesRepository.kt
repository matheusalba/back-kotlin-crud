package alba.kotlindelphi.repository

import alba.kotlindelphi.entity.SaleEntity
import org.springframework.data.jpa.repository.JpaRepository

interface SalesRepository:JpaRepository<SaleEntity, Long> {
}