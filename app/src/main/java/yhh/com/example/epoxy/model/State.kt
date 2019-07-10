package yhh.com.example.epoxy.model

import yhh.com.example.epoxy.pojo.Library

sealed class State {
    object StartLoading : State()
    object FinishLoading : State()

    data class Update(val data: List<Library>) : State()
}