package com.example.androidfundamentals.fifteen

import java.io.Serializable

data class Person(val name: String, val age: Int, val country: String) : Serializable {
    override fun toString(): String {
        return "$name is $age years old living in $country"
    }
}