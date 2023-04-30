package alba.kotlindelphi.repository

import alba.kotlindelphi.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository :JpaRepository<UserEntity, Long> {
}