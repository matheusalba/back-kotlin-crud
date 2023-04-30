package alba.kotlindelphi.repository

import alba.kotlindelphi.entity.StoreEntity
import org.springframework.data.jpa.repository.JpaRepository

interface StoreRepository:JpaRepository<StoreEntity, Long> {
}