package com.example.countries.di

import com.example.countries.viewmodel.ListViewModel
import dagger.Component

@Component(modules = [ServiceModule::class])
interface ServiceComponent {

    fun inject(listViewModel: ListViewModel)

}