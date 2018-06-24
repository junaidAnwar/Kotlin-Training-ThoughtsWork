# Kotlin-Training-ThoughtsWork
companion code for Kotlin trainning at thoughtWorks on 23-24 June 2018
https://thoughtworkspune.github.io/kotlininenterprise/

# Kotlin Test Documentation
https://github.com/kotlintest/kotlintest/blob/master/doc/reference.md
https://github.com/kotlintest/kotlintest/blob/master/doc/matchers.md


# Kotlin In Enterprise Workshop

Sample Project:
https://github.com/SarthakMakhija/kotlin-training-scratchpad.git

# Movies Exercise 1
Create Movie class with following properties
imdbID (string), title (string), releaseDate (date), genres (list), director (string), actors (list), actresses (list), duration (in min)
Create MovieStore class with min 5 movies list as member variable
Implement following functions on MovieStore
Find movies released in given releaseYear
Find movies with duration greater than ‘n’ min
Find movies with given actor (ignore case, contains string search)
Find movies with given actress (ignore case, contains string search)

List of movies CSV file
https://raw.githubusercontent.com/sunitparekh/share-it/master/movies.cs

# Movies Exercise 2
Using Data Classes remove boilerplate code from Movie class
Use Enum for Genre
Support destructuring declaration in Movie without creating it a data class
Companion object for Movie and MovieStore for creating movies
movie1 in MovieStore
