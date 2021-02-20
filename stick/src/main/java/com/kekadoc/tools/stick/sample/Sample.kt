package com.kekadoc.tools.stick.sample

import java.util.*

object Sample {

    object Json {
        const val SINGLE = "https://raw.githubusercontent.com/kekadoc/storehouse/main/json_array.json"
        const val ARRAY = "https://raw.githubusercontent.com/kekadoc/storehouse/main/json_single.json"
    }

    object Image {

        object Person {

            const val URL_UNKNOWN = "https://raw.githubusercontent.com/kekadoc/storehouse/main/person_unknown.png"

            const val URL_MALE_0 = "https://raw.githubusercontent.com/kekadoc/storehouse/main/person_male_0.png"
            const val URL_MALE_1 = "https://raw.githubusercontent.com/kekadoc/storehouse/main/person_male_1.png"
            const val URL_MALE_2 = "https://raw.githubusercontent.com/kekadoc/storehouse/main/person_male_2.png"
            const val URL_MALE_3 = "https://raw.githubusercontent.com/kekadoc/storehouse/main/person_male_3.png"
            const val URL_MALE_4 = "https://raw.githubusercontent.com/kekadoc/storehouse/main/person_male_4.png"
            const val URL_MALE_5 = "https://raw.githubusercontent.com/kekadoc/storehouse/main/person_male_5.png"

            const val URL_FEMALE_0 = "https://raw.githubusercontent.com/kekadoc/storehouse/main/person_female_0.png"
            const val URL_FEMALE_1 = "https://raw.githubusercontent.com/kekadoc/storehouse/main/person_female_1.png"
            const val URL_FEMALE_2 = "https://raw.githubusercontent.com/kekadoc/storehouse/main/person_female_2.png"
            const val URL_FEMALE_3 = "https://raw.githubusercontent.com/kekadoc/storehouse/main/person_female_3.png"
            const val URL_FEMALE_4 = "https://raw.githubusercontent.com/kekadoc/storehouse/main/person_female_4.png"
            const val URL_FEMALE_5 = "https://raw.githubusercontent.com/kekadoc/storehouse/main/person_female_5.png"

            private fun getByIndex(index: Int): String {
                return when(index) {
                    0 -> Sample.Image.Person.URL_MALE_0
                    1 -> Sample.Image.Person.URL_MALE_1
                    2 -> Sample.Image.Person.URL_MALE_2
                    3 -> Sample.Image.Person.URL_MALE_3
                    4 -> Sample.Image.Person.URL_MALE_4
                    5 -> Sample.Image.Person.URL_MALE_5
                    6 -> Sample.Image.Person.URL_FEMALE_0
                    7 -> Sample.Image.Person.URL_FEMALE_1
                    8 -> Sample.Image.Person.URL_FEMALE_2
                    9 -> Sample.Image.Person.URL_FEMALE_3
                    10 -> Sample.Image.Person.URL_FEMALE_4
                    11 -> Sample.Image.Person.URL_FEMALE_5
                    else -> Sample.Image.Person.URL_UNKNOWN
                }
            }

            fun getRandomUrl(): String {
                return when(Random().nextInt(12)) {
                    0 -> URL_MALE_0
                    1 -> URL_MALE_1
                    2 -> URL_MALE_2
                    3 -> URL_MALE_3
                    4 -> URL_MALE_4
                    5 -> URL_MALE_5
                    6 -> URL_FEMALE_0
                    7 -> URL_FEMALE_1
                    8 -> URL_FEMALE_2
                    9 -> URL_FEMALE_3
                    10 -> URL_FEMALE_4
                    11 -> URL_FEMALE_5
                    else -> URL_UNKNOWN
                }
            }

        }

    }


}