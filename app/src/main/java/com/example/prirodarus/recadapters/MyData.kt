package com.example.prirodarus.recadapters

import com.example.prirodarus.R

data class feel(val image:Int, val name_feel:String)
class MyFeel{val list = arrayListOf(feel(R.drawable.calm_img, "Спокойным"),
    feel(R.drawable.relax_img, "Расслабленным"),
    feel(R.drawable.focus_img, "Сосредоточенным"),
    feel(R.drawable.anxious_img, "Взволнованным")
)
}
data class state (val title:String, val text_state:String, val image_state: Int)
class MyState
{
    val state_list = arrayListOf(state("Заголовок статьи", "Краткое описание", R.drawable.state_image_1),
        state("Загаловок", "Краткое описание", R.drawable.state_image_1))
}
