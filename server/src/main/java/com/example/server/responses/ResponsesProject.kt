package com.example.server.responses

import com.example.server.models.Project

// Описание ответа ResponsesProject

data class ResponsesProject(
    val page: Int,
    val perPage: Int,
    val totalPages: Int,
    val totalItems: Int,
    val items: Project
)
