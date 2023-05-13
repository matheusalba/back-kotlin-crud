package alba.kotlindelphi.Store.repository

import alba.kotlindelphi.Store.entity.StoreEntity
import org.springframework.data.jpa.repository.JpaRepository

interface StoreRepository:JpaRepository<StoreEntity, Long> {
}