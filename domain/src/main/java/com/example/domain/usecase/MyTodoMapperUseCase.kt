package com.example.domain.usecase

import com.example.data.model.MyTodoResponse
import com.example.domain.model.MyTodoModel
import javax.inject.Inject


class MyTodoMapperUseCase @Inject constructor() {
    internal fun getTodos(todos: List<MyTodoResponse>): List<MyTodoModel> {
        val temp = ArrayList<MyTodoModel>()
        todos.forEach { todo ->
            temp.add(MyTodoModel(todo.id, todo.title))
        }
        return temp
    }

    private fun getList(): List<MyTodoResponse> =
        listOf(
            MyTodoResponse(1, "Title1", false, 1),
            MyTodoResponse(2, "Title2", false, 2),
            MyTodoResponse(3, "Title3", false, 3),
            MyTodoResponse(4, "Title4", true, 4),
            MyTodoResponse(5, "Title5", true, 5),
            MyTodoResponse(6, "Title6", false, 6)
        )
}

