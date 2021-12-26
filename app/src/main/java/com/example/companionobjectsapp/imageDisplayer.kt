package com.example.companionobjectsapp

class imageDisplayer {


    companion object check {
        var checker = ""
        fun check(input: String): String {

            if (input == "day" ||input == "Day"){
               checker = "day"
            }
            else if (input == "night"|| input == "Night" ){
                checker =  "night"
            }
            else{
                checker = "invalid"
            }

            return checker
        }

    }

}