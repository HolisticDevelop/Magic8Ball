package com.example.ball8magic.domain.repository

import com.example.ball8magic.domain.entity.Answer
import kotlinx.coroutines.flow.Flow

interface AnswerRespository {
    fun getAnswer(question: String) : Flow<Answer>
}