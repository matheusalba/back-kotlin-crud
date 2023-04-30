package alba.kotlindelphi.business

import alba.kotlindelphi.DTO.UserDto
import alba.kotlindelphi.entity.UserEntity
import alba.kotlindelphi.repository.CodeAuthRepository
import alba.kotlindelphi.repository.UserRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("user")
class UserBusiness(
    val jpaUserRepository:UserRepository,
    val codeAuthRepository: CodeAuthRepository
) {

    @PostMapping("test")
    fun postUser(userDto:UserDto){
        val retorno = codeAuthRepository.queryAuthCode(userDto.uuid)
    }

    fun userDtoToUserEntity(userDto: UserDto):UserEntity{
        return UserEntity(null,userDto.name,userDto.email,userDto.phone)
    }

}