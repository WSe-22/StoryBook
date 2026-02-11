package com.example.server.responses

import com.example.server.models.News

// Описание ответа ResponsesNews


data class ResponsesNews(
    val page: Int,
    val perPage: Int,
    val totalPages: Int,
    val totalItems: Int,
    val items: News
)
