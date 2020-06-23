package com.octaedge.daggersimpleproject.di

import com.octaedge.daggersimpleproject.App
import com.octaedge.daggersimpleproject.di.module.ActivityBuilderModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityBuilderModule::class
    ]
)
interface AppComponent : AndroidInjector<App>