package com.example.quizapp

object Constants {
    fun getQuestions():ArrayList<Question>{
        val questionsList=ArrayList<Question>()
        val que1=Question(
            1,
            "what country does this flag belong to?",
         R.drawable.ic_flag_of_argentina,
            optionOne = "Argentina",
            optionTwo = "America",
            optionThree = "Armenia",
            optionFour = "Austria",
            correctAnswer = 1
        )
        questionsList.add(que1)
        val que2 =Question(
                2,
                "what country does this flag belong to?",
                R.drawable.ic_flag_of_australia,
                optionOne = "Argentina",
                optionTwo = "America",
                optionThree = "Armenia",
                optionFour = "Australia",
                correctAnswer = 4
        )
        questionsList.add(que2)
        val que3=Question(
                3,
                "what country does this flag belong to?",
                R.drawable.ic_flag_of_belgium,
                optionOne = "Belgium",
                optionTwo = "India",
                optionThree = "Africa",
                optionFour = "Russia",
                correctAnswer = 1
        )
        questionsList.add(que3)
        val que4=Question(
                4,
                "what country does this flag belong to?",
                R.drawable.ic_flag_of_brazil,
                optionOne = "Argentina",
                optionTwo = "Brazil",
                optionThree = "China",
                optionFour = "Uganda",
                correctAnswer = 2
        )
        questionsList.add(que4)
        val que5=Question(
                5,
                "what country does this flag belong to?",
                R.drawable.ic_flag_of_denmark,
                optionOne = "Canada",
                optionTwo = "Armenia",
                optionThree = "South Africa",
                optionFour = "Denmark",
                correctAnswer = 4
        )
        questionsList.add(que5)
        val que6=Question(
                6,
                "what country does this flag belong to?",
                R.drawable.ic_flag_of_fiji,
                optionOne = "Pakistan",
                optionTwo = "Mexico",
                optionThree = "Fiji",
                optionFour = "Japan",
                correctAnswer = 3
        )
        questionsList.add(que6)
        val que7=Question(
                7,
                "what country does this flag belong to?",
                R.drawable.ic_flag_of_germany,
                optionOne = "France",
                optionTwo = "Uruguay",
                optionThree = "United Kingdom",
                optionFour = "Germany",
                correctAnswer = 4
        )
        questionsList.add(que7)
        val que8=Question(
                7,
                "what country does this flag belong to?",
                R.drawable.ic_flag_of_india,
                optionOne = "India",
                optionTwo = "Russia",
                optionThree = "France",
                optionFour = "Portugal",
                correctAnswer = 1
        )
        questionsList.add(que8)
        val que9=Question(
                9,
                "what country does this flag belong to?",
                R.drawable.ic_flag_of_kuwait,
                optionOne = "Iran",
                optionTwo = "Iraq",
                optionThree = "Kuwait",
                optionFour = "Behrain",
                correctAnswer = 3
        )
        questionsList.add(que9)
        val que10=Question(
                10,
                "what country does this flag belong to?",
                R.drawable.ic_flag_of_new_zealand,
                optionOne = "NewZealand",
                optionTwo = "Australia",
                optionThree = "Azerbaijan",
                optionFour = "Austria",
                correctAnswer = 1
        )
        questionsList.add(que10)
        return questionsList
    }
}