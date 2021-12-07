package com.br.primeflix.usecase

import com.br.primeflix.data.MovieRepository


class MoviesListUseCase(private val movieRepository: MovieRepository) {

    operator fun invoke() = movieRepository.getAllMoviesFromDataSource()

}