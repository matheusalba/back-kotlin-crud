package alba.kotlindelphi.Payment.repository

import alba.kotlindelphi.Payment.entity.PaymentEntity
import org.springframework.data.jpa.repository.JpaRepository

interface PaymentRepository: JpaRepository<PaymentEntity,Long> {
}