package com.example.server.services

import com.example.server.models.Error400
import com.example.server.models.User
import com.example.server.models.UserAuth
import com.example.server.requests.ChangeUserInformation
import com.example.server.requests.RequestAuth
import com.example.server.requests.RequestRegister
import com.example.server.requests.UserId
import com.example.server.responses.ResponseAuth
import com.example.server.responses.ResponseRegister
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST

// Описание роутов User
interface UserService {

    @POST("/collections/users/records")
    suspend fun registerUser(
        @Body body: RequestRegister
    ): Response<ResponseRegister>

    @POST("/collections/users/auth-with-password")
    suspend fun loginUser(
        @Body body: RequestAuth
    ): Response<ResponseAuth>

    @GET("/collections/users/records/{id_user}")
    suspend fun getUserById(@Body body: UserId): Response<User>


    @PATCH("/collections/users/records/{id_user}")
    suspend fun changeProfileUser(
        @Body body: ChangeUserInformation
    ): Response<User>

    @DELETE("/collections/_authOrigins/records/{id_token}")
    suspend fun deleteUser(
        @Body body: UserAuth
    ): Response<Error400>
}
