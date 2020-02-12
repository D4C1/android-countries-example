package com.example.countries.di

import com.example.countries.model.CountriesService
import dagger.Module
import dagger.Provides

@Module
class ServiceModule {

    @Provides
    fun providesService(): CountriesService {
        return CountriesService()
    }
}