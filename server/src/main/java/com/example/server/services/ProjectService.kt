package com.example.server.services

import com.example.server.models.Project
import com.example.server.requests.RequestProject
import com.example.server.responses.ResponsesProject
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

// Описание роутов Project

interface ProjectService {
    @POST("/collections/project/records")
    suspend fun createProject(
        @Body body: RequestProject
    ): Response<Project>

    @GET("/collections/project/records")
    suspend fun getProjects(): Response<ResponsesProject>
}