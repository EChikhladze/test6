package com.example.test6.di

import com.example.test6.data.PasscodeRepositoryImpl
import com.example.test6.domain.PasscodeRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@Module
@InstallIn(FragmentComponent::class)
interface RepositoryModule {

    @Binds
    fun providePasscodeRepository(impl: PasscodeRepositoryImpl): PasscodeRepository
}