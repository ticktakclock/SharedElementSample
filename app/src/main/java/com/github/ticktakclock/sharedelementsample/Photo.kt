package com.github.ticktakclock.sharedelementsample

data class Photo(val id: Int, val title: String, val imageUrl: String) {

    companion object {
        fun fetchAll() = listOf(
            Photo(
                0,
                "ゼリーフライ",
                "https://1.bp.blogspot.com/-JgCCcKaPehk/XuRAqUWJgLI/AAAAAAABZgQ/hY77s2QpJjQG1kk78jR91O4LRrinBRWaQCNcBGAsYHQ/s180-c/food_jelly_fry.png"
            ),
            Photo(
                1,
                "カリフラワーライス",
                "https://1.bp.blogspot.com/-Adxg5Zfj9sI/XtxD1pS9jUI/AAAAAAABZU8/G_UHPS7HCJ8Ve5lWiPL2sDmhYJ_nHZ5iQCNcBGAsYHQ/s180-c/food_cauliflower_rice.png"
            ),
            Photo(
                2,
                "揚げ餃子",
                "https://1.bp.blogspot.com/-s0F8ah-KmmA/XobTIIgFn3I/AAAAAAABYFA/RLUBWSpeAusE4R2SmGPqaa0ZLeb05MybQCNcBGAsYHQ/s180-c/food_gyouza_age.png"
            ),
            Photo(
                3,
                "ペスカトーレ",
                "https://1.bp.blogspot.com/-RWs_4Pahu5o/XlyfunbOzFI/AAAAAAABXok/34sB189nT08OpZu7n-lz2GKZUce3ZSU8ACNcBGAsYHQ/s180-c/food_spaghetti_pescatora.png"
            ),
            Photo(
                4,
                "ジャンバラヤ",
                "https://1.bp.blogspot.com/-z3hqfa8t0S4/XobTIcPIK5I/AAAAAAABYFE/jS1pSqgEPJAbSb3WzMfCORukvRS7SZXFACNcBGAsYHQ/s180-c/food_jambalaya.png"
            ),
            Photo(
                5,
                "レモンラーメン",
                "https://1.bp.blogspot.com/-xzTdHATFuvU/Xlyft6FdB2I/AAAAAAABXoY/-MCfnzSXVhkg0WDObHDVFbkvmUGVUoN0QCNcBGAsYHQ/s180-c/food_ra-men_lemon.png"
            ),
            Photo(
                6,
                "かに玉",
                "https://1.bp.blogspot.com/-YDGkzYON_Vg/XmHk2ovVFwI/AAAAAAABXvw/xx3Gjdo4Z54phHjNgcMkevyHeXuRGZ0SgCNcBGAsYHQ/s180-c/food_kanitama.png"
            ),
            Photo(
                7,
                "宇宙食",
                "https://1.bp.blogspot.com/-T3ZsIsLkDVs/XkZdPFKa4uI/AAAAAAABXVY/trSE9300P6YX388N5-Al8m0gIZFRHuivACNcBGAsYHQ/s180-c/space_food.png"
            ),
            Photo(
                8,
                "お好み焼き",
                "https://1.bp.blogspot.com/-MsI-cwG9LmY/Xbo7IE3judI/AAAAAAABVzA/qJKp2sMiCckuEn3KP1yzX79no-fWyq8DgCNcBGAsYHQ/s180-c/food_okonomiyaki_kyabetsuyaki_decoration.png"
            ),
            Photo(
                9,
                "餃子",
                "https://1.bp.blogspot.com/-UbN0yy2MMrM/XaKa5_0WWUI/AAAAAAABVj8/-YGIDDkzgPUkGRe9odTWisMXeIZBTK9wgCNcBGAsYHQ/s180-c/food_curryrice_white.png"
            ),
            Photo(
                10,
                "カレーライス",
                "https://1.bp.blogspot.com/-UbN0yy2MMrM/XaKa5_0WWUI/AAAAAAABVj8/-YGIDDkzgPUkGRe9odTWisMXeIZBTK9wgCNcBGAsYHQ/s180-c/food_curryrice_white.png"
            ),
            Photo(
                11,
                "エビフライ",
                "https://1.bp.blogspot.com/-N4wY9yIahmw/XVKf6aSOBZI/AAAAAAABUFs/ENGPYG_Cq7kP5TWvamiXS5Ak_Q5NFsyuwCLcBGAs/s180-c/food_ebi_fry_set.png"
            ),
            Photo(
                12,
                "鍋",
                "https://1.bp.blogspot.com/-jXIyJNC8ofg/XTPoHxzHSPI/AAAAAAABTwQ/pZCjTsWrx_UZ_7q5kvMHS1KHGdNAveRDACLcBGAs/s180-c/food_nabe_mizutaki.png"
            ),
            Photo(
                13,
                "ポテトフライ",
                "https://1.bp.blogspot.com/-U5tiBAaVncQ/XQjuEWqlAmI/AAAAAAABTPI/c-nmr6K9WmwW7vOYBYIU5q_1PtdhuVFQgCLcBGAs/s180-c/food_fried_potato_dish.png"
            ),
            Photo(
                14,
                "ポットパイ",
                "https://4.bp.blogspot.com/-hb0SFii_eZQ/XGjx4QtFWNI/AAAAAAABRck/-wzYshwz0KsRngk4eUEexgsJXqk2jT2QACLcBGAs/s180-c/food_soup_pie_dutumi_potpie.png"
            )
        )

        fun find(id: Int): Photo? {
            return fetchAll().find { it.id == id }
        }
    }
}