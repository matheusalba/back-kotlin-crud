package alba.kotlindelphi.repository

import alba.kotlindelphi.entity.PaymentEntity
import org.springframework.data.jpa.repository.JpaRepository

interface PaymentRepository: JpaRepository<PaymentEntity,Long> {
}