package com.example.myapplication.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.widget.EditText
import com.example.myapplication.R

class WeatherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_weather)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val edtSearch: EditText = findViewById(R.id.edtSearch)
        edtSearch.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == android.view.inputmethod.EditorInfo.IME_ACTION_SEARCH) {
                // 검색 동작을 수행하는 함수 호출
                performSearch(edtSearch.text.toString())
                true
            } else {
                false
            }
        }
    }

    private fun performSearch(query: String) {
        // 검색어에 대한 동작을 수행하는 코드를 추가
        // 예: 네트워크 요청 및 결과 표시
    }
}