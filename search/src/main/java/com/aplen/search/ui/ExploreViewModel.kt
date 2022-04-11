package com.aplen.search.ui

import androidx.appcompat.widget.SearchView
import androidx.lifecycle.LiveDataReactiveStreams
import androidx.lifecycle.ViewModel
import com.aplen.core.domain.usecase.MovieUseCase
import com.aplen.search.di.ExploreAppScope
import io.reactivex.BackpressureStrategy
import io.reactivex.Flowable
import io.reactivex.subjects.PublishSubject
import javax.inject.Inject

@ExploreAppScope
class ExploreViewModel @Inject constructor(private val useCase: MovieUseCase) : ViewModel() {

    fun exploreMovie(query: String) =
        LiveDataReactiveStreams.fromPublisher(
            useCase.getSearchMovies(query).toFlowable(BackpressureStrategy.BUFFER)
        )

    fun searchResult(searchView: SearchView?): Flowable<String> {
        val queryChannel = PublishSubject.create<String>()

        searchView?.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                queryChannel.onComplete()
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if (newText != null) {
                    queryChannel.onNext(newText)
                }
                return true
            }

        })
        return queryChannel.toFlowable(BackpressureStrategy.BUFFER)
    }

}