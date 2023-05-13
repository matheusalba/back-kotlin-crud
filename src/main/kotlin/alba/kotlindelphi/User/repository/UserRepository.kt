package alba.kotlindelphi.User.repository

import alba.kotlindelphi.User.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository :JpaRepository<UserEntity, Long> {
}