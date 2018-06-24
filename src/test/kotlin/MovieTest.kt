
import io.kotlintest.matchers.collections.shouldHaveSingleElement
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class MovieTest : StringSpec() {
    init {
        "should read movie file and build Movie Store"{
            val movieStore = buildMovieStore()
            movieStore.movies.size shouldBe 11
        }
        "should give me Lagaan"{
            buildMovieStore()
                    .findByDuration(200)
                    .map { it.title }.shouldHaveSingleElement("Lagaan: Once Upon a Time in India")
        }
    }
}