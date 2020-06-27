package com.github.ticktakclock.sharedelementsample

data class Photo(val title: String, val imageUrl: String) {

    companion object{
        fun createDummy() = listOf(
            Photo("ゼリーフライ", "https://1.bp.blogspot.com/-JgCCcKaPehk/XuRAqUWJgLI/AAAAAAABZgQ/hY77s2QpJjQG1kk78jR91O4LRrinBRWaQCNcBGAsYHQ/s180-c/food_jelly_fry.png"),
            Photo("カリフラワーライス", "https://1.bp.blogspot.com/-Adxg5Zfj9sI/XtxD1pS9jUI/AAAAAAABZU8/G_UHPS7HCJ8Ve5lWiPL2sDmhYJ_nHZ5iQCNcBGAsYHQ/s180-c/food_cauliflower_rice.png"),
            Photo("揚げ餃子", "https://1.bp.blogspot.com/-s0F8ah-KmmA/XobTIIgFn3I/AAAAAAABYFA/RLUBWSpeAusE4R2SmGPqaa0ZLeb05MybQCNcBGAsYHQ/s180-c/food_gyouza_age.png"),
            Photo("ペスカトーレ", "https://1.bp.blogspot.com/-RWs_4Pahu5o/XlyfunbOzFI/AAAAAAABXok/34sB189nT08OpZu7n-lz2GKZUce3ZSU8ACNcBGAsYHQ/s180-c/food_spaghetti_pescatora.png"),
            Photo("ジャンバラヤ", "https://1.bp.blogspot.com/-z3hqfa8t0S4/XobTIcPIK5I/AAAAAAABYFE/jS1pSqgEPJAbSb3WzMfCORukvRS7SZXFACNcBGAsYHQ/s180-c/food_jambalaya.png"),
            Photo("レモンラーメン", "https://1.bp.blogspot.com/-xzTdHATFuvU/Xlyft6FdB2I/AAAAAAABXoY/-MCfnzSXVhkg0WDObHDVFbkvmUGVUoN0QCNcBGAsYHQ/s180-c/food_ra-men_lemon.png"),
            Photo("いらすと", "https://1.bp.blogspot.com/-hq2NkdVdvYg/XuHCjmgH9eI/AAAAAAABZdI/wh1lUWAgZg84CFxP9aX3cqvUn1fuRIVsACNcBGAsYHQ/s1600/tablet_family.png"),
            Photo("いらすと", "https://1.bp.blogspot.com/-ZG_36wOnNWo/Xtt6kiYgQkI/AAAAAAABZR8/TOPFp_CDUWUTA45IS-Tv3DEShmm6OxGdACNcBGAsYHQ/s400/nyuin_online_menkai_woman.png"),
            Photo("いらすと", "https://1.bp.blogspot.com/-hq2NkdVdvYg/XuHCjmgH9eI/AAAAAAABZdI/wh1lUWAgZg84CFxP9aX3cqvUn1fuRIVsACNcBGAsYHQ/s1600/tablet_family.png"),
            Photo("いらすと", "https://1.bp.blogspot.com/-ZG_36wOnNWo/Xtt6kiYgQkI/AAAAAAABZR8/TOPFp_CDUWUTA45IS-Tv3DEShmm6OxGdACNcBGAsYHQ/s400/nyuin_online_menkai_woman.png")
        )
    }
}