package com.kodiiiofc.urbanuniversity.art_gallery

import java.io.Serializable

data class Picture(val title: String, val authorName: String, val imageResources: Int) : Serializable {
    companion object {
        val pictures = mutableListOf(
            Picture("Испанка", "Родригес Хосе", R.drawable.ispanka),
            Picture("Поцелуй", "Густав Климт", R.drawable.pocelyi),
            Picture("Просторы России", "Панов Эдуард", R.drawable.prostory_rossii),
            Picture("Великолепные цветы", "Петров Андрей", R.drawable.velikolepnye_cvety),
            Picture("Средиземноморский городок . Вид с балкона на парусники", "Влодарчик Анджей", R.drawable.gorodok),
            Picture("Зима в горах", "Шарабарин Андрей", R.drawable.zima_v_gorah),
            Picture("Зебры.Ориджинал колор N4", "Виверс Кристина", R.drawable.zebry),
            Picture("Дождь в Санкт - Петербурге.Вид на дом компании «Зингер» и Казанский собор","Камский Савелий",R.drawable.zinger),
            Picture("Сладкое чаепитие с самоваром", "Камский Савелий", R.drawable.samovar),
            Picture("Городской парк", "Дюпре Брайн", R.drawable.gorodskoy_park)
        )
    }
}
