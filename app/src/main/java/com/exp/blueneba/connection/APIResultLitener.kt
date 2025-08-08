package com.exp.blueneba.connection
import retrofit2.Response

interface APIResultLitener<T> {

    abstract fun onAPIResult(response: Response<T>?, errorMessage: String?)
}