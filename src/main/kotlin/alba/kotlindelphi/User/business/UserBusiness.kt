package alba.kotlindelphi.User.business

import alba.kotlindelphi.User.dto.UserDto
import alba.kotlindelphi.User.entity.UserEntity
import alba.kotlindelphi.Code.DLL.CodeAuthRepository
import alba.kotlindelphi.User.repository.UserRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("user")
class UserBusiness(
    val jpaUserRepository: UserRepository,
    val codeAuthRepository: CodeAuthRepository
) {

    @PostMapping("test")
    fun postUser(@RequestBody userDto: UserDto){
        val retorno = codeAuthRepository.queryAuthCode(userDto.uuid)
        jpaUserRepository.save(userDtoToUserEntity(userDto))
    }

    fun userDtoToUserEntity(userDto: UserDto): UserEntity {
        return UserEntity(null,userDto.name,userDto.email,userDto.phone)
    }

}