package com.example.leetdroid.sharedViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QuestionSharedViewModel : ViewModel() {

    val questionTitleSlug = MutableLiveData<String>()
    val questionHasSolution = MutableLiveData<Boolean>()
    val questionID = MutableLiveData<String>()
    val questionPaid = MutableLiveData<Boolean>()


    // function to get title slug
    fun getQuestionTitleSlug(titleSlug: String) {
        questionTitleSlug.postValue(titleSlug)
    }

    // function to get title slug
    fun getQuestionHasSolution(hasSolution: Boolean) {
        questionHasSolution.postValue(hasSolution)
    }

    // function to get question ID
    fun getQuestionId(questionId: String) {
        questionID.postValue(questionId)
    }

    // function to get question's status -> paid/free
    fun isQuestionPaid(status: Boolean) {
        questionPaid.postValue(status)
    }
}