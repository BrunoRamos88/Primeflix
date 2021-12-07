package com.br.primeflix.data

import com.br.primeflix.domain.Movie

interface MovieDataSource {

    fun getAllMovies(): List<Movie>

}