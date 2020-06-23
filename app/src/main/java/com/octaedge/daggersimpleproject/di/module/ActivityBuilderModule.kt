package com.octaedge.daggersimpleproject.di.module

import com.octaedge.daggersimpleproject.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {
    //Activity Injector - Core component of Andorid (eg:Activity, Fragment, Service etc)
    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity
}