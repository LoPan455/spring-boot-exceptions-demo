package io.tjohander.exceptiondemo.domain

data class ErrorDetailResponse(val message: String, val code: String, val errors: ArrayList<ErrorDetail>) {
}

data class ErrorDetail(val resource: String, val field: String, val error: String) {
}


