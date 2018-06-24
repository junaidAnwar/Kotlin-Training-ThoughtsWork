import java.io.FileReader
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Movie(val title: String, val releaseDate : LocalDate, var genres: List<String>, val director: String, val actors: List<String>, val actresses: List<String>, val duration: Int ){

    override fun toString(): String {
        return "\nMovie\ntitle='$title'\nreleaseDate=$releaseDate\ngenres=$genres\ndirector='$director'\nactors=$actors\nactresses=$actresses\nduration=$duration\n"
    }
}


class MovieStore(val movies: List<Movie>){

    fun findByReleaseYear(year: Int)=movies.filter { year==(it.releaseDate.year) }
    fun findByDuration(duration: Int)=movies.filter { it.duration>duration }
    fun findByActor(actor: String)=movies.filter { it.actors.contains(actor) }
    fun findByActress(actress: String)=movies.filter { it.actresses.contains(actress) }
}

fun main(args: Array<String>){

    val ms = buildMovieStore()
    println(" Find by year")
    println(ms.findByReleaseYear(2015))
    println(" Find by Duration")
    println(ms.findByDuration(220))
    println(" Find by Actor")
    println(ms.findByActor("Aamir Khan"))
    println(" Find by Actress")
    println(ms.findByActress("Kareena Kapoor"))
}

internal fun buildMovieStore(): MovieStore {
    val moviesList = mutableListOf<Movie>()
    val filePath = "G:\\Code\\Kotlin\\kotlin-training-scratchpad\\src\\main\\resources\\movies-list-without-header.csv"
    FileReader(filePath)
            .forEachLine { line ->
                val values = line.split(",")
                val movie = Movie(title = values[0],
                        releaseDate = LocalDate.parse(values[1], DateTimeFormatter.ofPattern("yyyy/MM/dd")),
                        actors = values[2].split("|"),
                        actresses = values[3].split("|"),
                        duration = values[4].toInt(),
                        genres = values[5].split("|"),
                        director = values[6]
                )
                moviesList.add(movie)
            }
    return MovieStore(moviesList)
}