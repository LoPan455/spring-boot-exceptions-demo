package io.tjohander.exceptiondemo.controller

import io.tjohander.exceptiondemo.domain.user.User
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/users"])
class UsersController {

    @GetMapping(value = ["/"])
    @ResponseStatus(HttpStatus.OK)
    fun getUser(id: String): ResponseEntity<User> {
        val user = User(
                1,
                "larry@google.com",
                "Larry",
                "Page",
                "https://avataaars.io/?avatarStyle=Circle&topType=NoHair&accessoriesType=Round&facialHairType=MoustacheFancy&facialHairColor=BlondeGolden&clotheType=BlazerShirt&eyeType=Happy&eyebrowType=RaisedExcited&mouthType=Concerned&skinColor=Pale"
        )
        return ResponseEntity<User>(user, HttpStatus.OK)
    }
}
